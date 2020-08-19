package com.springboot.tao.demo.httpTest.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author taozhiwei
 * @date 2020/8/19 17:48
 */
@NoArgsConstructor
@Data
public class MemberMain {

    /**
     * status : 1
     * server_time : 1597830366623
     * order_field : price
     * order_headers : [{"field":"selling_time","direction":["DESC"],"name":"最新"},{"field":"recommd","direction":[],"name":"人气"},{"field":"collect_num","direction":["DESC"],"name":"收藏"},{"field":"price","direction":["DESC","ASC"],"name":"价格"}]
     * order_direction : DESC
     * paging : {"is_last_page":false}
     * result : [{"storage_type":4,"tag":"user","collect_num":3,"pass_fair_show":0,"server_name":"再续前缘","level_desc":"112级","highlights":[],"kindid":1,"equip_level":112,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:34172   人物评分:19517","equip_type":"1","price":99900,"other_info":{"school":8,"icon":"/game_res/res/photo/0007.png","level_desc":"112级","highlights":[],"desc_sumup":"总评分:34172   人物评分:19517","basic_attrs":["总评分:34172","人物评分:19517"],"format_equip_name":"化生寺","desc_sumup_short":"总评分:34172   人物评分:19517"},"allow_urs_bargain":false,"expire_remain_seconds":1223029,"serverid":4,"icon":"/game_res/res/photo/0007.png","game_ordersn":"202008112101716-4-RMSS6LCHUNM2F2","platform_type":2,"allow_bargain":false,"format_equip_name":"化生寺","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":15,"pass_fair_show":1,"server_name":"再续前缘","level_desc":"112级","highlights":[],"kindid":1,"equip_level":112,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:35322   人物评分:19545","equip_type":"1","price":99900,"other_info":{"school":8,"icon":"/game_res/res/photo/0013.png","level_desc":"112级","highlights":[],"desc_sumup":"总评分:35322   人物评分:19545","basic_attrs":["总评分:35322","人物评分:19545"],"format_equip_name":"化生寺","desc_sumup_short":"总评分:35322   人物评分:19545"},"allow_urs_bargain":false,"expire_remain_seconds":854192,"serverid":4,"icon":"/game_res/res/photo/0013.png","game_ordersn":"201910120901716-4-YCJLYRSBH4BYJD","platform_type":2,"allow_bargain":false,"format_equip_name":"化生寺","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":19,"pass_fair_show":1,"server_name":"再续前缘","level_desc":"115级","highlights":["激活经脉"],"kindid":1,"equip_level":115,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:35633   人物评分:19878","equip_type":"1","price":99900,"other_info":{"school":3,"icon":"/game_res/res/photo/0003.png","level_desc":"115级","highlights":["激活经脉"],"desc_sumup":"总评分:35633   人物评分:19878","basic_attrs":["总评分:35633","人物评分:19878"],"format_equip_name":"龙宫","desc_sumup_short":"总评分:35633   人物评分:19878"},"allow_urs_bargain":false,"expire_remain_seconds":1036831,"serverid":4,"icon":"/game_res/res/photo/0003.png","game_ordersn":"202007121201716-4-J4Y5KQ3RAD2M7V","platform_type":2,"allow_bargain":false,"format_equip_name":"龙宫","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":0,"pass_fair_show":1,"server_name":"再续前缘","level_desc":"109级","highlights":[],"kindid":1,"equip_level":109,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:29397   人物评分:16904","equip_type":"1","price":99900,"other_info":{"school":3,"icon":"/game_res/res/photo/0008.png","level_desc":"109级","highlights":[],"desc_sumup":"总评分:29397   人物评分:16904","basic_attrs":["总评分:29397","人物评分:16904"],"format_equip_name":"龙宫","desc_sumup_short":"总评分:29397   人物评分:16904"},"allow_urs_bargain":true,"expire_remain_seconds":454366,"serverid":4,"icon":"/game_res/res/photo/0008.png","game_ordersn":"202008022301716-4-D9D3BSUTZ273R3","platform_type":2,"allow_bargain":true,"format_equip_name":"龙宫","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":3,"pass_fair_show":1,"server_name":"再续前缘","level_desc":"115级","highlights":["激活经脉"],"kindid":1,"equip_level":115,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:28177   人物评分:19464","equip_type":"1","price":99900,"other_info":{"school":6,"icon":"/game_res/res/photo/0009.png","level_desc":"115级","highlights":["激活经脉"],"desc_sumup":"总评分:28177   人物评分:19464","basic_attrs":["总评分:28177","人物评分:19464"],"format_equip_name":"狮驼岭","desc_sumup_short":"总评分:28177   人物评分:19464"},"allow_urs_bargain":false,"expire_remain_seconds":1180897,"serverid":4,"icon":"/game_res/res/photo/0009.png","game_ordersn":"202008071101716-4-P9WUBZKDVVHBVG","platform_type":2,"allow_bargain":false,"format_equip_name":"狮驼岭","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":22,"pass_fair_show":0,"server_name":"再续前缘","level_desc":"115级","highlights":["激活经脉"],"kindid":1,"equip_level":115,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:36403   人物评分:21372","equip_type":"1","price":99900,"other_info":{"school":1,"icon":"/game_res/res/photo/0001.png","level_desc":"115级","highlights":["激活经脉"],"desc_sumup":"总评分:36403   人物评分:21372","basic_attrs":["总评分:36403","人物评分:21372"],"format_equip_name":"大唐官府","desc_sumup_short":"总评分:36403   人物评分:21372"},"allow_urs_bargain":false,"expire_remain_seconds":1234517,"serverid":4,"icon":"/game_res/res/photo/0001.png","game_ordersn":"202008072101716-4-VA03ALQVPNFYWE","platform_type":2,"allow_bargain":false,"format_equip_name":"大唐官府","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":7,"pass_fair_show":1,"server_name":"再续前缘","level_desc":"115级","highlights":["激活经脉"],"kindid":1,"equip_level":115,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:29131   人物评分:19838","equip_type":"1","price":99900,"other_info":{"school":12,"icon":"/game_res/res/photo/0009.png","level_desc":"115级","highlights":["激活经脉"],"desc_sumup":"总评分:29131   人物评分:19838","basic_attrs":["总评分:29131","人物评分:19838"],"format_equip_name":"小雷音","desc_sumup_short":"总评分:29131   人物评分:19838"},"allow_urs_bargain":true,"expire_remain_seconds":996814,"serverid":4,"icon":"/game_res/res/photo/0009.png","game_ordersn":"202008090601716-4-4FSWWWAOTZISJ2","platform_type":2,"allow_bargain":true,"format_equip_name":"小雷音","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":8,"pass_fair_show":0,"server_name":"再续前缘","level_desc":"115级","highlights":["激活经脉"],"kindid":1,"equip_level":115,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:31942   人物评分:18730","equip_type":"1","price":99900,"other_info":{"school":3,"icon":"/game_res/res/photo/0003.png","level_desc":"115级","highlights":["激活经脉"],"desc_sumup":"总评分:31942   人物评分:18730","basic_attrs":["总评分:31942","人物评分:18730"],"format_equip_name":"龙宫","desc_sumup_short":"总评分:31942   人物评分:18730"},"allow_urs_bargain":false,"expire_remain_seconds":1213720,"serverid":4,"icon":"/game_res/res/photo/0003.png","game_ordersn":"202008111801716-4-EVMHNG7QXMKXC6","platform_type":2,"allow_bargain":false,"format_equip_name":"龙宫","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":1,"pass_fair_show":1,"server_name":"再续前缘","level_desc":"112级","highlights":["双蓝装备x1"],"kindid":1,"equip_level":112,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:33830   人物评分:18829","equip_type":"1","price":99900,"other_info":{"school":8,"icon":"/game_res/res/photo/0007.png","level_desc":"112级","highlights":["双蓝装备x1"],"desc_sumup":"总评分:33830   人物评分:18829","basic_attrs":["总评分:33830","人物评分:18829"],"format_equip_name":"化生寺","desc_sumup_short":"总评分:33830   人物评分:18829"},"allow_urs_bargain":false,"expire_remain_seconds":919529,"serverid":4,"icon":"/game_res/res/photo/0007.png","game_ordersn":"202008071701716-4-IMUVQHYA3HXKXF","platform_type":2,"allow_bargain":false,"format_equip_name":"化生寺","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":0,"pass_fair_show":1,"server_name":"再续前缘","level_desc":"114级","highlights":["激活经脉"],"kindid":1,"equip_level":114,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:25925   人物评分:20826","equip_type":"1","price":99900,"other_info":{"school":7,"icon":"/game_res/res/photo/0005.png","level_desc":"114级","highlights":["激活经脉"],"desc_sumup":"总评分:25925   人物评分:20826","basic_attrs":["总评分:25925","人物评分:20826"],"format_equip_name":"魔王寨","desc_sumup_short":"总评分:25925   人物评分:20826"},"allow_urs_bargain":false,"expire_remain_seconds":1110478,"serverid":4,"icon":"/game_res/res/photo/0005.png","game_ordersn":"202008101101716-4-C8HQAIXUXKINRE","platform_type":2,"allow_bargain":false,"format_equip_name":"魔王寨","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":0,"pass_fair_show":0,"server_name":"再续前缘","level_desc":"112级","highlights":["激活经脉"],"kindid":1,"equip_level":112,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:32757   人物评分:18832","equip_type":"1","price":99900,"other_info":{"school":3,"icon":"/game_res/res/photo/0003.png","level_desc":"112级","highlights":["激活经脉"],"desc_sumup":"总评分:32757   人物评分:18832","basic_attrs":["总评分:32757","人物评分:18832"],"format_equip_name":"龙宫","desc_sumup_short":"总评分:32757   人物评分:18832"},"allow_urs_bargain":true,"expire_remain_seconds":1228001,"serverid":4,"icon":"/game_res/res/photo/0003.png","game_ordersn":"202008112201716-4-SVQHIJOE7BX6WG","platform_type":2,"allow_bargain":true,"format_equip_name":"龙宫","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":1,"pass_fair_show":1,"server_name":"再续前缘","level_desc":"115级","highlights":[],"kindid":1,"equip_level":115,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:30594   人物评分:14976","equip_type":"1","price":99900,"other_info":{"school":7,"icon":"/game_res/res/photo/0009.png","level_desc":"115级","highlights":[],"desc_sumup":"总评分:30594   人物评分:14976","basic_attrs":["总评分:30594","人物评分:14976"],"format_equip_name":"魔王寨","desc_sumup_short":"总评分:30594   人物评分:14976"},"allow_urs_bargain":true,"expire_remain_seconds":539127,"serverid":4,"icon":"/game_res/res/photo/0009.png","game_ordersn":"202007181201716-4-6TIKRDF1O7WDAT","platform_type":2,"allow_bargain":true,"format_equip_name":"魔王寨","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":18,"pass_fair_show":1,"server_name":"再续前缘","level_desc":"105级","highlights":[],"kindid":1,"equip_level":105,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:26651   人物评分:14240","equip_type":"1","price":99900,"other_info":{"school":1,"icon":"/game_res/res/photo/0001.png","level_desc":"105级","highlights":[],"desc_sumup":"总评分:26651   人物评分:14240","basic_attrs":["总评分:26651","人物评分:14240"],"format_equip_name":"大唐官府","desc_sumup_short":"总评分:26651   人物评分:14240"},"allow_urs_bargain":false,"expire_remain_seconds":790002,"serverid":4,"icon":"/game_res/res/photo/0001.png","game_ordersn":"202004251701716-4-UKJATEWDJFDURZ","platform_type":2,"allow_bargain":false,"format_equip_name":"大唐官府","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":2,"pass_fair_show":1,"server_name":"再续前缘","level_desc":"115级","highlights":["激活经脉"],"kindid":1,"equip_level":115,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:35691   人物评分:21002","equip_type":"1","price":99900,"other_info":{"school":3,"icon":"/game_res/res/photo/0003.png","level_desc":"115级","highlights":["激活经脉"],"desc_sumup":"总评分:35691   人物评分:21002","basic_attrs":["总评分:35691","人物评分:21002"],"format_equip_name":"龙宫","desc_sumup_short":"总评分:35691   人物评分:21002"},"allow_urs_bargain":false,"expire_remain_seconds":889337,"serverid":4,"icon":"/game_res/res/photo/0003.png","game_ordersn":"202008080001716-4-KWRPUUVBELZZNV","platform_type":2,"allow_bargain":false,"format_equip_name":"龙宫","game_channel":"netease"},{"storage_type":4,"tag":"user","collect_num":3,"pass_fair_show":1,"server_name":"再续前缘","level_desc":"115级","highlights":[],"kindid":1,"equip_level":115,"tag_key":"{         \"sort_key\": \"price\",          \"tag\": \"user\",          \"sort_order\": \"DESC\",          \"extern_tag\": null       }","area_name":"一区","desc_sumup_short":"总评分:23685   人物评分:16751","equip_type":"1","price":99900,"other_info":{"school":7,"icon":"/game_res/res/photo/0005.png","level_desc":"115级","highlights":[],"desc_sumup":"总评分:23685   人物评分:16751","basic_attrs":["总评分:23685","人物评分:16751"],"format_equip_name":"魔王寨","desc_sumup_short":"总评分:23685   人物评分:16751"},"allow_urs_bargain":false,"expire_remain_seconds":795631,"serverid":4,"icon":"/game_res/res/photo/0005.png","game_ordersn":"202007232001716-4-Z3NUFSCE3URFGG","platform_type":2,"allow_bargain":false,"format_equip_name":"魔王寨","game_channel":"netease"}]
     * pager : {"cur_page":1,"total_pages":18}
     */

    private int status;
    private long server_time;
    private String order_field;
    private String order_direction;
    private PagingBean paging;
    private PagerBean pager;
    private List<OrderHeadersBean> order_headers;
    private List<ResultBean> result;

    @NoArgsConstructor
    @Data
    public static class PagingBean {
        /**
         * is_last_page : false
         */

        private boolean is_last_page;
    }

    @NoArgsConstructor
    @Data
    public static class PagerBean {
        /**
         * cur_page : 1
         * total_pages : 18
         */

        private int cur_page;
        private int total_pages;
    }

    @NoArgsConstructor
    @Data
    public static class OrderHeadersBean {
        /**
         * field : selling_time
         * direction : ["DESC"]
         * name : 最新
         */

        private String field;
        private String name;
        private List<String> direction;
    }

    @NoArgsConstructor
    @Data
    public static class ResultBean {
        /**
         * storage_type : 4
         * tag : user
         * collect_num : 3
         * pass_fair_show : 0
         * server_name : 再续前缘
         * level_desc : 112级
         * highlights : []
         * kindid : 1
         * equip_level : 112
         * tag_key : {         "sort_key": "price",          "tag": "user",          "sort_order": "DESC",          "extern_tag": null       }
         * area_name : 一区
         * desc_sumup_short : 总评分:34172   人物评分:19517
         * equip_type : 1
         * price : 99900
         * other_info : {"school":8,"icon":"/game_res/res/photo/0007.png","level_desc":"112级","highlights":[],"desc_sumup":"总评分:34172   人物评分:19517","basic_attrs":["总评分:34172","人物评分:19517"],"format_equip_name":"化生寺","desc_sumup_short":"总评分:34172   人物评分:19517"}
         * allow_urs_bargain : false
         * expire_remain_seconds : 1223029
         * serverid : 4
         * icon : /game_res/res/photo/0007.png
         * game_ordersn : 202008112101716-4-RMSS6LCHUNM2F2
         * platform_type : 2
         * allow_bargain : false
         * format_equip_name : 化生寺
         * game_channel : netease
         */

        private int storage_type;
        private String tag;
        private int collect_num;
        private int pass_fair_show;
        private String server_name;
        private String level_desc;
        private int kindid;
        private int equip_level;
        private String tag_key;
        private String area_name;
        private String desc_sumup_short;
        private String equip_type;
        private int price;
        private OtherInfoBean other_info;
        private boolean allow_urs_bargain;
        private int expire_remain_seconds;
        private int serverid;
        private String icon;
        private String game_ordersn;
        private int platform_type;
        private boolean allow_bargain;
        private String format_equip_name;
        private String game_channel;
        private List<?> highlights;

        @NoArgsConstructor
        @Data
        public static class OtherInfoBean {
            /**
             * school : 8
             * icon : /game_res/res/photo/0007.png
             * level_desc : 112级
             * highlights : []
             * desc_sumup : 总评分:34172   人物评分:19517
             * basic_attrs : ["总评分:34172","人物评分:19517"]
             * format_equip_name : 化生寺
             * desc_sumup_short : 总评分:34172   人物评分:19517
             */

            private int school;
            private String icon;
            private String level_desc;
            private String desc_sumup;
            private String format_equip_name;
            private String desc_sumup_short;
            private List<?> highlights;
            private List<String> basic_attrs;
        }
    }
}
