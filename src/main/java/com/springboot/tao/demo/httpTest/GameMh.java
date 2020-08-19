package com.springboot.tao.demo.httpTest;

import com.alibaba.fastjson.JSON;
import com.springboot.tao.bean.HttpResultBean;
import com.springboot.tao.demo.httpTest.bean.MemberDetail;
import com.springboot.tao.demo.httpTest.bean.MemberMain;
import com.springboot.tao.demo.httpTest.bean.MemberOtherBean;
import com.springboot.tao.demo.httpTest.bean.MemberSearchResult;
import com.springboot.tao.util.HttpClientTool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author taozhiwei
 * @date 2020/8/19 17:17
 * 梦幻西游手游测试
 */
public class GameMh {
    /**
     * 游戏账号列表 get
     */
    static final String MEMBER_LIST = "https://recommd.my.cbg.163.com/cgi-bin/recommend.py";

    /**
     * 账号详情 post
     */
    static final String MEMBER_DETAIL = "https://my.cbg.163.com/cgi/api/get_equip_detail";

    //static final String MEMBER_LIST_TEST = "https://recommd.my.cbg.163.com/cgi-bin/recommend.py?callback=jQuery33107954430261232583_1597811682854&act=recommd_by_role&search_type=role&count=15&platform_type=2&serverid=4&price_min=50000&price_max=99900&equip_level_min=90&equip_level_max=119&order_by=price%20DESC&page=1&_=1597811682864";

    public static void main(String[] args) throws Exception {
        GameMh gameMh = new GameMh();
        ArrayList<MemberSearchResult> memberDetailAll = new ArrayList<>(20);
        for (int i = 0; i < 8; i++) {
            List<MemberMain.ResultBean> queryMemberList = gameMh.getQueryMemberList(String.valueOf(i));
            ArrayList<MemberSearchResult> memberDetail = gameMh.getMemberDetail(queryMemberList);
            memberDetailAll.addAll(memberDetail);
        }

        System.out.println(memberDetailAll);

    }

    public List<MemberMain.ResultBean> getQueryMemberList(String page) throws Exception {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("callback","jQuery33107954430261232583_1597811682854");
        hashMap.put("act", "recommd_by_role");
        hashMap.put("search_type", "role");
        hashMap.put("count", "15");
        hashMap.put("platform_type", "2");
        hashMap.put("serverid", "4");
        hashMap.put("price_min","50000");
        hashMap.put("price_max", "99900");
        hashMap.put("equip_level_min","90");
        hashMap.put("equip_level_max","119");
        hashMap.put("order_by", "price DESC");
        hashMap.put("page", page);
        hashMap.put("_", "1597811682864");
        HttpResultBean httpResultBean = new HttpResultBean();
        HttpClientTool.get(MEMBER_LIST, hashMap,null, httpResultBean);
        String content = httpResultBean.getContent().replace("jQuery33107954430261232583_1597811682854(", "");
        content = content.substring(0, content.length() - 1);
        MemberMain memberMain = JSON.parseObject(content, MemberMain.class);
        return memberMain.getResult();
    }

    public ArrayList<MemberSearchResult> getMemberDetail(List<MemberMain.ResultBean> list){
        ArrayList<MemberSearchResult> resultList = new ArrayList<MemberSearchResult>();
        if(list != null && list.size() > 0){
            list.stream().forEach(s -> {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("serverid", "4");
                hashMap.put("ordersn", s.getGame_ordersn());
                HttpResultBean httpResultBean = new HttpResultBean();
                HttpClientTool.postForm(MEMBER_DETAIL, hashMap, null, httpResultBean);
                String content = httpResultBean.getContent();
                MemberDetail memberDetail = JSON.parseObject(content, MemberDetail.class);
                String equip_desc = null;
                if(memberDetail.getEquip() != null){
                    equip_desc = memberDetail.getEquip().getEquip_desc();
                }
                if(equip_desc != null){
                    MemberOtherBean memberOtherBean = JSON.parseObject(equip_desc, MemberOtherBean.class);
                    List<MemberOtherBean.SkillBeans.OrgSkillListBean> org_skill_list = memberOtherBean.getSkill().getOrg_skill_list();
                    org_skill_list.forEach(x -> {
                        if(x.getSkill_id() == 200006 || x.getSkill_id() == 200004){
                            if(x.getSkill_lv() >= 110){
                                MemberSearchResult memberSearchResult = new MemberSearchResult();
                                memberSearchResult.setLevel(s.getLevel_desc());
                                memberSearchResult.setMoney(s.getPrice());
                                memberSearchResult.setScore(s.getDesc_sumup_short());
                                resultList.add(memberSearchResult);
                            }
                        }
                    });
                }
            });
        }
        return resultList;
    }
}
