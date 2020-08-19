package com.springboot.tao.demo.httpTest.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author taozhiwei
 * @date 2020/8/19 18:17
 */
@NoArgsConstructor
@Data
public class MemberOtherBean {


    /**
     * jingmai : {"jingmai":{"cur_scheme_no":1,"jm_scheme_list":[{"use_qyd_num":12,"active_info":[{"xcs_self_effect_ratio":37,"equip_seq":21,"xc_stone_itemtype":24213,"xc_stone_last":16,"jm_no":11},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":18},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":2},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":6},{"xcs_self_effect_ratio":33,"equip_seq":19,"xc_stone_itemtype":24213,"xc_stone_last":0,"jm_no":20},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":1},{"xcs_self_effect_ratio":50,"equip_seq":20,"xc_stone_itemtype":24214,"xc_stone_last":31,"jm_no":3},{"xcs_self_effect_ratio":99,"equip_seq":12,"xc_stone_itemtype":24217,"xc_stone_last":0,"jm_no":10},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":7},{"xcs_self_effect_ratio":36,"equip_seq":18,"xc_stone_itemtype":24213,"xc_stone_last":0,"jm_no":19},{"xcs_self_effect_ratio":32,"equip_seq":17,"xc_stone_itemtype":24213,"xc_stone_last":0,"jm_no":5},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":4}],"scheme_no":1,"active_effect_ratio":100,"equip_effect_ratio":100}],"qyd_info":{"accu_activeness":0,"accu_exp":0,"own_qyd_num":12,"need_activeness":0,"need_exp":0,"make_qyd_st":1},"equip_info_list":[{"xcs_self_effect_ratio":32,"equip_seq":17,"xc_stone_itemtype":24213,"xc_stone_last":0},{"xcs_self_effect_ratio":36,"equip_seq":18,"xc_stone_itemtype":24213,"xc_stone_last":0},{"xcs_self_effect_ratio":99,"equip_seq":12,"xc_stone_itemtype":24217,"xc_stone_last":0},{"xcs_self_effect_ratio":37,"equip_seq":21,"xc_stone_itemtype":24213,"xc_stone_last":16},{"xcs_self_effect_ratio":33,"equip_seq":19,"xc_stone_itemtype":24213,"xc_stone_last":0},{"xcs_self_effect_ratio":50,"equip_seq":20,"xc_stone_itemtype":24214,"xc_stone_last":31}],"max_scheme_num":2}}
     * mount : {"mount_list":[{"info":{"pendantDye":[],"cSn":"","iType":4114,"iDyeExpire":0,"badgeList":[],"iBirthTime":1529358941,"cName":"刺果猬","iDye":0,"iSendTime":0,"iBadgeStatus":0,"iGrowth":0,"iIsRaised":0,"iSkill":0,"iMountStatus":1,"cSendName":"","iSpecMount":0,"iRare":1,"iStage":3,"iExpire":0},"mount_id":"1001_1529358941_1"},{"info":{"pendantDye":[],"cSn":"","iType":4101,"iDyeExpire":0,"badgeList":[],"iBirthTime":1496144579,"cName":"独角驳","iDye":0,"iSendTime":0,"iBadgeStatus":1,"iGrowth":0,"iIsRaised":1,"iSkill":703,"iMountStatus":1,"cSendName":"","iSpecMount":0,"iRare":1,"iStage":3,"iExpire":0},"mount_id":"1001_1496144579_1"},{"info":{"pendantDye":[],"cSn":"","iType":4143,"iDyeExpire":0,"badgeList":[{"iType":6001,"iLast":200,"pos":1,"iGrade":1,"cProp":"5:8|7:8|7:8","ws_install_mode":2},{"iType":6021,"iLast":200,"pos":3,"iGrade":1,"cProp":"11:50|15:50|11:50","ws_install_mode":2},{"iType":6001,"iLast":200,"pos":2,"iGrade":1,"cProp":"1:40|1:40|7:8","ws_install_mode":2}],"iBirthTime":1545646962,"cName":"冰晶鹿","iDye":0,"iSendTime":0,"iBadgeStatus":1,"iGrowth":0,"iIsRaised":0,"iSkill":701,"iMountStatus":2,"cSendName":"","iSpecMount":0,"iRare":2,"iStage":3,"iExpire":0},"mount_id":"1001_1545646962_1"},{"info":{"pendantDye":[],"cSn":"","iType":4127,"iDyeExpire":0,"badgeList":[{"iType":6001,"iLast":200,"pos":1,"iGrade":1,"cProp":"3:8|3:8|1:40","ws_install_mode":2},{"iType":6021,"iLast":200,"pos":3,"iGrade":1,"cProp":"15:50|12:50|11:50","ws_install_mode":2},{"iType":6001,"iLast":200,"pos":2,"iGrade":1,"cProp":"5:8|3:8|3:8","ws_install_mode":2}],"iBirthTime":1519229165,"cName":"哮天犬","iDye":1,"iSendTime":0,"iBadgeStatus":1,"iGrowth":0,"iIsRaised":0,"iSkill":701,"iMountStatus":1,"cSendName":"","iSpecMount":0,"iRare":1,"iStage":3,"iExpire":0},"mount_id":"1001_1519229165_5"},{"info":{"pendantDye":[],"cSn":"","iType":4180,"iDyeExpire":0,"badgeList":[],"iBirthTime":1580452796,"cName":"瑞雪熊","iDye":0,"iSendTime":0,"iBadgeStatus":0,"iGrowth":0,"iIsRaised":0,"iSkill":0,"iMountStatus":1,"cSendName":"","iSpecMount":0,"iRare":1,"iStage":3,"iExpire":0},"mount_id":"1001_1580452796_2"},{"info":{"pendantDye":[],"cSn":"","iType":4110,"iDyeExpire":0,"badgeList":[],"iBirthTime":1549859361,"cName":"福康猪","iDye":0,"iSendTime":0,"iBadgeStatus":0,"iGrowth":0,"iIsRaised":0,"iSkill":0,"iMountStatus":1,"cSendName":"","iSpecMount":0,"iRare":1,"iStage":3,"iExpire":0},"mount_id":"1001_1549859361_2"},{"info":{"pendantDye":[],"cSn":"","iType":4108,"iDyeExpire":0,"badgeList":[{"iType":6011,"iLast":200,"pos":1,"iGrade":1,"cProp":"4:12|6:12|4:12","ws_install_mode":2},{"iType":6021,"iLast":200,"pos":3,"iGrade":1,"cProp":"15:50|12:50|15:50","ws_install_mode":2},{"iType":6011,"iLast":200,"pos":2,"iGrade":1,"cProp":"6:12|13:100|13:100","ws_install_mode":2}],"iBirthTime":1507498701,"cName":"洒金鳞","iDye":0,"iSendTime":0,"iBadgeStatus":1,"iGrowth":0,"iIsRaised":0,"iSkill":703,"iMountStatus":1,"cSendName":"","iSpecMount":0,"iRare":2,"iStage":3,"iExpire":0},"mount_id":"1001_1507498701_1"}]}
     * summon_child : {"child_list":[],"iMaxBSlot":10,"recycle_summon_list":[{"pMag":19,"qDef":1258,"drugskill":[],"qDam":1382,"pStr":16,"life":7000,"pMagBorn":19,"growupProm":0,"cName":"羽云仙子","iGrade":0,"pMagScheme2":0,"quali_dan_limit":10,"equip":[],"skill":[{"id":419},{"id":402},{"id":404}],"iPointFreeScheme2":100,"pRes":26,"iEquipUnlock":0,"iHp_Max":190,"qMagDamProm":0,"iDefense":81,"iType":2057,"qCorProm":0,"qSpe":1298,"cFashion":"","iHp":190,"pDexScheme2":0,"qCorPromCnt":0,"quali_dan_remain":10,"pResBorn":26,"mark":2156,"iUpExp":0,"supersum":0,"qMagDam":1820,"pCor":21,"fashion_id":0,"iMp_Max":123,"pDex":18,"lszz_remain":5,"iPointFree":0,"qDamPromCnt":0,"bianyi":0,"upgrade_cnt":0,"iFengDodge":1,"ryd_used":0,"iPointScheme":1,"precioussum":0,"iDamage":33,"iMagDam":32,"iMagDef":44,"pCorBorn":21,"jpyx_use_cnt":2,"growup":1288,"iMp":123,"elementalsum":0,"dye":0,"qSpePromCnt":0,"pStrBorn":16,"growupPromCnt":0,"use_animal_yx":[],"qDamProm":0,"pResScheme2":0,"lockskill":0,"iPromoteGrade":0,"ignore_skill_confirm":0,"ryd_remain_cnt":5,"qDefPromCnt":0,"qCor":5135,"fashion_expire":0,"qMagDamPromCnt":0,"qSpeProm":0,"pDexBorn":18,"max_animal_yx":3,"wild":0,"iSpeed":38,"zhuan_shen":0,"qDefProm":0,"pCorScheme2":0,"pStrScheme2":0},{"pMag":71,"qDef":1323,"drugskill":[],"qDam":945,"pStr":51,"life":8110,"pMagBorn":30,"growupProm":0,"cName":"蚌仙子","iGrade":41,"pMagScheme2":0,"quali_dan_limit":10,"equip":[],"skill":[{"id":523},{"id":332},{"id":431},{"id":301}],"iPointFreeScheme2":510,"pRes":63,"iEquipUnlock":0,"iHp_Max":895,"qMagDamProm":0,"iDefense":349,"iType":2013,"qCorProm":0,"qSpe":756,"cFashion":"","iHp":895,"pDexScheme2":0,"qCorPromCnt":0,"quali_dan_remain":10,"pResBorn":22,"mark":1632,"iUpExp":0,"supersum":0,"qMagDam":1688,"pCor":57,"fashion_id":0,"iMp_Max":538,"pDex":63,"lszz_remain":5,"iPointFree":205,"qDamPromCnt":0,"bianyi":0,"upgrade_cnt":0,"iFengDodge":620,"ryd_used":0,"iPointScheme":1,"precioussum":0,"iDamage":188,"iMagDam":161,"iMagDef":162,"pCorBorn":16,"jpyx_use_cnt":2,"growup":1109,"iMp":538,"elementalsum":0,"dye":0,"qSpePromCnt":0,"pStrBorn":10,"growupPromCnt":0,"use_animal_yx":[],"qDamProm":0,"pResScheme2":0,"lockskill":0,"iPromoteGrade":0,"ignore_skill_confirm":0,"ryd_remain_cnt":5,"qDefPromCnt":0,"qCor":3812,"fashion_expire":0,"qMagDamPromCnt":0,"qSpeProm":0,"pDexBorn":22,"max_animal_yx":3,"wild":0,"iSpeed":177,"zhuan_shen":0,"qDefProm":0,"pCorScheme2":0,"pStrScheme2":0}],"ware_summon_list":[{"pMag":216,"qDef":1119,"drugskill":[],"qDam":986,"pStr":62,"life":4000,"pMagBorn":18,"growupProm":0,"cName":"珍露童子","iGrade":33,"pMagScheme2":0,"quali_dan_limit":10,"equip":[],"skill":[{"id":410},{"id":527},{"id":422},{"id":323}],"iPointFreeScheme2":430,"pRes":48,"iEquipUnlock":0,"iHp_Max":906,"qMagDamProm":0,"iDefense":265,"iType":2078,"qCorProm":0,"qSpe":1135,"cFashion":"","iHp":906,"pDexScheme2":0,"qCorPromCnt":0,"quali_dan_remain":10,"pResBorn":15,"mark":1880,"iUpExp":0,"supersum":0,"qMagDam":2675,"pCor":51,"fashion_id":0,"iMp_Max":1511,"pDex":53,"lszz_remain":5,"iPointFree":0,"qDamPromCnt":0,"bianyi":0,"upgrade_cnt":0,"iFengDodge":460,"ryd_used":0,"iPointScheme":1,"precioussum":0,"iDamage":204,"iMagDam":419,"iMagDef":369,"pCorBorn":18,"jpyx_use_cnt":2,"growup":1228,"iMp":1511,"elementalsum":0,"dye":0,"qSpePromCnt":0,"pStrBorn":29,"growupPromCnt":0,"use_animal_yx":[],"qDamProm":0,"pResScheme2":0,"lockskill":0,"iPromoteGrade":0,"ignore_skill_confirm":0,"ryd_remain_cnt":5,"qDefPromCnt":0,"qCor":4903,"fashion_expire":0,"qMagDamPromCnt":0,"qSpeProm":0,"pDexBorn":20,"max_animal_yx":3,"wild":0,"iSpeed":183,"zhuan_shen":0,"qDefProm":0,"pCorScheme2":0,"pStrScheme2":0},{"pMag":19,"qDef":1162,"drugskill":[],"qDam":1646,"pStr":43,"life":8000,"pMagBorn":11,"growupProm":0,"cName":"鬼剑","iGrade":8,"pMagScheme2":0,"quali_dan_limit":10,"equip":[],"skill":[{"id":404},{"id":431},{"id":302},{"id":503}],"iPointFreeScheme2":180,"pRes":20,"iEquipUnlock":0,"iHp_Max":315,"qMagDamProm":0,"iDefense":92,"iType":2056,"qCorProm":0,"qSpe":1548,"cFashion":"","iHp":315,"pDexScheme2":0,"qCorPromCnt":0,"quali_dan_remain":10,"pResBorn":12,"mark":2358,"iUpExp":0,"supersum":0,"qMagDam":2153,"pCor":22,"fashion_id":0,"iMp_Max":156,"pDex":36,"lszz_remain":5,"iPointFree":40,"qDamPromCnt":0,"bianyi":0,"upgrade_cnt":0,"iFengDodge":1,"ryd_used":0,"iPointScheme":1,"precioussum":0,"iDamage":120,"iMagDam":46,"iMagDef":69,"pCorBorn":14,"jpyx_use_cnt":2,"growup":1264,"iMp":156,"elementalsum":0,"dye":0,"qSpePromCnt":0,"pStrBorn":35,"growupPromCnt":0,"use_animal_yx":[],"qDamProm":0,"pResScheme2":0,"lockskill":0,"iPromoteGrade":0,"ignore_skill_confirm":0,"ryd_remain_cnt":5,"qDefPromCnt":0,"qCor":5167,"fashion_expire":0,"qMagDamPromCnt":0,"qSpeProm":0,"pDexBorn":28,"max_animal_yx":3,"wild":0,"iSpeed":99,"zhuan_shen":0,"qDefProm":0,"pCorScheme2":0,"pStrScheme2":0},{"pMag":20,"qDef":1095,"drugskill":[],"qDam":1128,"pStr":20,"life":8000,"pMagBorn":20,"growupProm":0,"cName":"布雨神君","iGrade":0,"pMagScheme2":0,"quali_dan_limit":10,"equip":[],"skill":[{"id":527},{"id":428},{"id":429}],"iPointFreeScheme2":100,"pRes":20,"iEquipUnlock":0,"iHp_Max":183,"qMagDamProm":0,"iDefense":63,"iType":2042,"qCorProm":0,"qSpe":1388,"cFashion":"","iHp":183,"pDexScheme2":0,"qCorPromCnt":0,"quali_dan_remain":10,"pResBorn":20,"mark":1773,"iUpExp":0,"supersum":0,"qMagDam":2778,"pCor":20,"fashion_id":0,"iMp_Max":131,"pDex":20,"lszz_remain":5,"iPointFree":0,"qDamPromCnt":0,"bianyi":0,"upgrade_cnt":0,"iFengDodge":1,"ryd_used":0,"iPointScheme":1,"precioussum":0,"iDamage":42,"iMagDam":34,"iMagDef":46,"pCorBorn":20,"jpyx_use_cnt":2,"growup":1300,"iMp":131,"elementalsum":0,"dye":0,"qSpePromCnt":0,"pStrBorn":20,"growupPromCnt":0,"use_animal_yx":[],"qDamProm":0,"pResScheme2":0,"lockskill":0,"iPromoteGrade":0,"ignore_skill_confirm":0,"ryd_remain_cnt":5,"qDefPromCnt":0,"qCor":4881,"fashion_expire":0,"qMagDamPromCnt":0,"qSpeProm":0,"pDexBorn":20,"max_animal_yx":3,"wild":0,"iSpeed":42,"zhuan_shen":0,"qDefProm":0,"pCorScheme2":0,"pStrScheme2":0}],"summon_list":[{"pMag":764,"drugskill":[{"status":1,"gongmingIds":[],"iPos":0,"iHight":2,"id":9218,"iLevel":3},{"status":0,"gongmingIds":[],"iPos":2,"iHight":0,"id":9511,"iLevel":5},{"status":0,"gongmingIds":[{"id":9513,"iPos":0},{"id":9511,"iPos":1},{"id":9501,"iPos":2},{"id":9504,"iPos":3}],"iPos":0,"iHight":1,"id":9015,"iLevel":5},{"status":0,"gongmingIds":[],"iPos":0,"iHight":0,"id":9508,"iLevel":5},{"status":0,"gongmingIds":[],"iPos":1,"iHight":0,"id":9510,"iLevel":5}],"pStr":149,"lljg_lefttime":0,"iSpeed":637,"equip":[{"AddPoint":"","iGood":0,"iType":25422,"pos":1,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"5:10","iScore":10,"Special":"","iLevel":105},{"AddPoint":"","iGood":0,"iType":25428,"pos":3,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:42","iScore":10,"Special":"","iLevel":105},{"AddPoint":"","iGood":0,"iType":25425,"pos":2,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"7:10","iScore":10,"Special":"","iLevel":105}],"skill":[{"id":409},{"id":526},{"id":414},{"id":407},{"id":433},{"id":435},{"id":406}],"ignore_skill_confirm":0,"pRes":138,"qMagDamProm":0,"supersum":0,"qMagDam":2113,"pCor":152,"iMp_Max":4928,"iPointFree":0,"qDamPromCnt":0,"qDamProm":0,"dye":0,"iTrainRemain":0,"qSpe":1372,"pCorScheme2":0,"qDam":1272,"growupProm":0,"iGrade":125,"quali_dan_limit":15,"iPointFreeScheme2":1350,"fashion_id":0,"use_animal_yx":[],"cFashion":"","quali_dan_remain":0,"ryd_used":0,"precioussum":0,"growup":1146,"iMagDef":1018,"jpyx_use_cnt":1,"iMp":4928,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":1,"lockskill":526,"pResBorn":13,"unique_drug_st":2,"qDefPromCnt":0,"iBound":0,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":3311,"pDexBorn":22,"pStrBorn":24,"iType":2024,"dye_expire":0,"mark":3385,"pDex":147,"fight_status":0,"life":2310,"iPointScheme":1,"iDamage":671,"pResScheme2":0,"mount_skill_id":0,"iTrade":1592654699,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":768,"pDexScheme2":0,"cName":"一沙＂一净土","pStrScheme2":0,"bianyi":0,"lszz_remain":0,"iMaxPointScheme":1,"iDefense":700,"iPromoteGrade":0,"iHp":3311,"iUpExp":328840,"upgrade_cnt":0,"iFengDodge":2300,"iMagDam":1434,"pCorBorn":27,"pMagBorn":14,"qCorProm":0,"ryd_remain_cnt":5,"qCor":5121,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":1,"zhuan_shen":0,"qDefProm":0},{"pMag":779,"drugskill":[{"status":1,"gongmingIds":[],"iPos":0,"iHight":1,"id":9006,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":2,"iHight":0,"id":9511,"iLevel":3},{"status":1,"gongmingIds":[],"iPos":0,"iHight":0,"id":9508,"iLevel":2},{"status":1,"gongmingIds":[],"iPos":1,"iHight":0,"id":9514,"iLevel":3},{"status":1,"gongmingIds":[],"iPos":0,"iHight":2,"id":9237,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":3,"iHight":0,"id":9510,"iLevel":2}],"pStr":138,"lljg_lefttime":0,"iSpeed":641,"equip":[{"AddPoint":"","iGood":0,"iType":25422,"pos":1,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"5:10","iScore":10,"Special":"","iLevel":105}],"skill":[{"id":306},{"id":307},{"id":525},{"id":309},{"id":314}],"ignore_skill_confirm":0,"pRes":136,"qMagDamProm":0,"supersum":0,"qMagDam":3345,"pCor":147,"iMp_Max":5896,"iPointFree":0,"qDamPromCnt":0,"qDamProm":0,"dye":50529027,"iTrainRemain":0,"qSpe":1229,"pCorScheme2":0,"qDam":1347,"growupProm":0,"iGrade":125,"quali_dan_limit":10,"iPointFreeScheme2":1351,"fashion_id":0,"use_animal_yx":[{"max_cnt":3,"cnt":1,"iType":31999}],"cFashion":"","quali_dan_remain":0,"ryd_used":0,"precioussum":0,"growup":1290,"iMagDef":1223,"jpyx_use_cnt":2,"iMp":5896,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":1,"lockskill":525,"pResBorn":11,"unique_drug_st":2,"qDefPromCnt":0,"iBound":0,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":3496,"pDexBorn":26,"pStrBorn":13,"iType":2044,"dye_expire":0,"mark":2547,"pDex":151,"fight_status":0,"life":226,"iPointScheme":1,"iDamage":706,"pResScheme2":0,"mount_skill_id":0,"iTrade":1586430681,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":1637,"pDexScheme2":0,"cName":"亲宝守护者","pStrScheme2":0,"bianyi":1,"lszz_remain":4,"iMaxPointScheme":1,"iDefense":1104,"iPromoteGrade":0,"iHp":3496,"iUpExp":117260,"upgrade_cnt":0,"iFengDodge":2300,"iMagDam":1706,"pCorBorn":22,"pMagBorn":28,"qCorProm":0,"ryd_remain_cnt":5,"qCor":5400,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":1,"zhuan_shen":0,"qDefProm":0},{"pMag":490,"drugskill":[],"pStr":108,"lljg_lefttime":0,"iSpeed":295,"equip":[],"skill":[{"id":403},{"id":415},{"id":525},{"id":409},{"id":307}],"ignore_skill_confirm":0,"pRes":100,"qMagDamProm":0,"supersum":0,"qMagDam":1008,"pCor":102,"iMp_Max":2619,"iPointFree":0,"qDamPromCnt":0,"qDamProm":0,"dye":0,"iTrainRemain":0,"qSpe":809,"pCorScheme2":0,"qDam":1116,"growupProm":0,"iGrade":80,"quali_dan_limit":10,"iPointFreeScheme2":900,"fashion_id":0,"use_animal_yx":[],"cFashion":"","quali_dan_remain":10,"ryd_used":0,"precioussum":0,"growup":1000,"iMagDef":540,"jpyx_use_cnt":2,"iMp":2619,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":0,"lockskill":0,"pResBorn":20,"unique_drug_st":0,"qDefPromCnt":0,"iBound":0,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":1159,"pDexBorn":20,"pStrBorn":20,"iType":2097,"dye_expire":0,"mark":1791,"pDex":100,"fight_status":0,"life":7469,"iPointScheme":1,"iDamage":493,"pResScheme2":0,"mount_skill_id":0,"iTrade":0,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":748,"pDexScheme2":0,"cName":"海毛虫","pStrScheme2":0,"bianyi":0,"lszz_remain":5,"iMaxPointScheme":1,"iDefense":440,"iPromoteGrade":0,"iHp":1159,"iUpExp":81131,"upgrade_cnt":0,"iFengDodge":1400,"iMagDam":705,"pCorBorn":20,"pMagBorn":20,"qCorProm":0,"ryd_remain_cnt":5,"qCor":1924,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":0,"zhuan_shen":0,"qDefProm":0},{"pMag":758,"drugskill":[],"pStr":143,"lljg_lefttime":0,"iSpeed":583,"equip":[],"skill":[{"id":525},{"id":309},{"id":310},{"id":307},{"id":306}],"ignore_skill_confirm":0,"pRes":143,"qMagDamProm":0,"supersum":0,"qMagDam":2964,"pCor":143,"iMp_Max":5573,"iPointFree":0,"qDamPromCnt":0,"qDamProm":0,"dye":0,"iTrainRemain":0,"qSpe":1140,"pCorScheme2":0,"qDam":1254,"growupProm":0,"iGrade":123,"quali_dan_limit":10,"iPointFreeScheme2":1330,"fashion_id":0,"use_animal_yx":[],"cFashion":"","quali_dan_remain":10,"ryd_used":0,"precioussum":0,"growup":1270,"iMagDef":1158,"jpyx_use_cnt":2,"iMp":5573,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":0,"lockskill":0,"pResBorn":20,"unique_drug_st":1,"qDefPromCnt":0,"iBound":1,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":3095,"pDexBorn":20,"pStrBorn":20,"iType":2044,"dye_expire":0,"mark":2094,"pDex":143,"fight_status":0,"life":6227,"iPointScheme":1,"iDamage":677,"pResScheme2":0,"mount_skill_id":0,"iTrade":2147483632,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":1482,"pDexScheme2":0,"cName":"灵符女娲","pStrScheme2":0,"bianyi":0,"lszz_remain":5,"iMaxPointScheme":1,"iDefense":1044,"iPromoteGrade":0,"iHp":3095,"iUpExp":635869,"upgrade_cnt":0,"iFengDodge":2260,"iMagDam":1556,"pCorBorn":20,"pMagBorn":20,"qCorProm":0,"ryd_remain_cnt":5,"qCor":5130,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":0,"zhuan_shen":0,"qDefProm":0},{"pMag":740,"drugskill":[{"status":0,"gongmingIds":[],"iPos":2,"iHight":0,"id":9505,"iLevel":1},{"status":0,"gongmingIds":[],"iPos":0,"iHight":1,"id":9013,"iLevel":1},{"status":0,"gongmingIds":[],"iPos":0,"iHight":0,"id":9517,"iLevel":1},{"status":0,"gongmingIds":[],"iPos":1,"iHight":0,"id":9512,"iLevel":1},{"status":0,"gongmingIds":[],"iPos":3,"iHight":0,"id":9523,"iLevel":1}],"pStr":138,"lljg_lefttime":0,"iSpeed":647,"equip":[],"skill":[{"id":527},{"id":306},{"id":307},{"id":333},{"id":309}],"ignore_skill_confirm":0,"pRes":138,"qMagDamProm":0,"supersum":0,"qMagDam":2990,"pCor":193,"iMp_Max":5589,"iPointFree":0,"qDamPromCnt":0,"qDamProm":0,"dye":0,"iTrainRemain":0,"qSpe":1356,"pCorScheme2":0,"qDam":1122,"growupProm":0,"iGrade":125,"quali_dan_limit":10,"iPointFreeScheme2":1350,"fashion_id":0,"use_animal_yx":[],"cFashion":"","quali_dan_remain":5,"ryd_used":0,"precioussum":0,"growup":1300,"iMagDef":1258,"jpyx_use_cnt":2,"iMp":5589,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":1,"lockskill":527,"pResBorn":13,"unique_drug_st":1,"qDefPromCnt":0,"iBound":0,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":3566,"pDexBorn":16,"pStrBorn":13,"iType":2042,"dye_expire":0,"mark":2293,"pDex":141,"fight_status":0,"life":6722,"iPointScheme":1,"iDamage":638,"pResScheme2":0,"mount_skill_id":0,"iTrade":1589939071,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":1152,"pDexScheme2":0,"cName":"一水\u201d一秋波","pStrScheme2":0,"bianyi":0,"lszz_remain":5,"iMaxPointScheme":1,"iDefense":911,"iPromoteGrade":0,"iHp":3566,"iUpExp":19688,"upgrade_cnt":0,"iFengDodge":2400,"iMagDam":1563,"pCorBorn":13,"pMagBorn":45,"qCorProm":0,"ryd_remain_cnt":5,"qCor":5010,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":1,"zhuan_shen":0,"qDefProm":0},{"pMag":764,"drugskill":[{"status":1,"gongmingIds":[],"iPos":0,"iHight":2,"id":9236,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":0,"iHight":1,"id":9006,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":1,"iHight":0,"id":9511,"iLevel":4},{"status":1,"gongmingIds":[],"iPos":0,"iHight":0,"id":9512,"iLevel":4},{"status":1,"gongmingIds":[],"iPos":2,"iHight":0,"id":9508,"iLevel":2},{"status":1,"gongmingIds":[],"iPos":3,"iHight":0,"id":9510,"iLevel":2}],"pStr":154,"lljg_lefttime":0,"iSpeed":680,"equip":[{"AddPoint":"4:6","iGood":0,"iType":25421,"pos":1,"Effect":"","iSystemBind":0,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"5:13","iScore":25,"Special":"","iLevel":85},{"AddPoint":"","iGood":0,"iType":25428,"pos":3,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:42","iScore":10,"Special":"","iLevel":105},{"AddPoint":"1:7","iGood":0,"iType":25424,"pos":2,"Effect":"","iSystemBind":0,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:28","iScore":21,"Special":"","iLevel":85}],"skill":[{"id":331},{"id":307},{"id":525},{"id":306},{"id":309}],"ignore_skill_confirm":0,"pRes":145,"qMagDamProm":0,"supersum":0,"qMagDam":2998,"pCor":142,"iMp_Max":5633,"iPointFree":0,"qDamPromCnt":0,"qDamProm":0,"dye":50529027,"iTrainRemain":0,"qSpe":1479,"pCorScheme2":0,"qDam":1419,"growupProm":0,"iGrade":125,"quali_dan_limit":10,"iPointFreeScheme2":1350,"fashion_id":0,"use_animal_yx":[],"cFashion":"","quali_dan_remain":10,"ryd_used":0,"precioussum":0,"growup":1270,"iMagDef":1180,"jpyx_use_cnt":2,"iMp":5633,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":1,"lockskill":525,"pResBorn":20,"unique_drug_st":2,"qDefPromCnt":0,"iBound":0,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":3788,"pDexBorn":20,"pStrBorn":29,"iType":2046,"dye_expire":0,"mark":2622,"pDex":145,"fight_status":1,"life":502,"iPointScheme":1,"iDamage":757,"pResScheme2":0,"mount_skill_id":0,"iTrade":1591655080,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":1719,"pDexScheme2":0,"cName":"一方\u2033一净土","pStrScheme2":0,"bianyi":1,"lszz_remain":0,"iMaxPointScheme":1,"iDefense":1177,"iPromoteGrade":0,"iHp":3788,"iUpExp":2034,"upgrade_cnt":0,"iFengDodge":2300,"iMagDam":1627,"pCorBorn":17,"pMagBorn":14,"qCorProm":0,"ryd_remain_cnt":5,"qCor":6279,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":1,"zhuan_shen":0,"qDefProm":0},{"pMag":137,"drugskill":[{"status":1,"gongmingIds":[],"iPos":0,"iHight":2,"id":9239,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":0,"iHight":1,"id":9004,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":2,"iHight":0,"id":9503,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":3,"iHight":0,"id":9501,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":1,"iHight":0,"id":9502,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":0,"iHight":0,"id":9504,"iLevel":1}],"pStr":769,"lljg_lefttime":0,"iSpeed":738,"equip":[{"AddPoint":"5:6|4:3","iGood":1,"iType":25422,"pos":1,"Effect":"","iSystemBind":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"7:26","iScore":44,"Special":"","iLevel":105},{"AddPoint":"","iGood":0,"iType":25428,"pos":3,"Effect":"","iSystemBind":0,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"4:13","iScore":9,"Special":"","iLevel":105},{"AddPoint":"4:5","iGood":0,"iType":25423,"pos":2,"Effect":"","iSystemBind":0,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:29","iScore":17,"Special":"","iLevel":65}],"skill":[{"id":412},{"id":305},{"id":402},{"id":301}],"ignore_skill_confirm":0,"pRes":145,"qMagDamProm":0,"supersum":0,"qMagDam":1952,"pCor":146,"iMp_Max":1390,"iPointFree":1,"qDamPromCnt":0,"qDamProm":0,"dye":0,"iTrainRemain":0,"qSpe":1428,"pCorScheme2":0,"qDam":1669,"growupProm":0,"iGrade":125,"quali_dan_limit":10,"iPointFreeScheme2":1351,"fashion_id":0,"use_animal_yx":[{"max_cnt":3,"cnt":1,"iType":31999}],"cFashion":"","quali_dan_remain":0,"ryd_used":0,"precioussum":0,"growup":1287,"iMagDef":851,"jpyx_use_cnt":2,"iMp":1390,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":1,"lockskill":0,"pResBorn":20,"unique_drug_st":2,"qDefPromCnt":0,"iBound":0,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":3250,"pDexBorn":28,"pStrBorn":19,"iType":2057,"dye_expire":0,"mark":2814,"pDex":153,"fight_status":0,"life":7631,"iPointScheme":1,"iDamage":2126,"pResScheme2":0,"mount_skill_id":0,"iTrade":1591704023,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":1431,"pDexScheme2":0,"cName":"一往＂一情深","pStrScheme2":0,"bianyi":0,"lszz_remain":0,"iMaxPointScheme":1,"iDefense":1082,"iPromoteGrade":0,"iHp":3250,"iUpExp":355656,"upgrade_cnt":0,"iFengDodge":2300,"iMagDam":433,"pCorBorn":21,"pMagBorn":12,"qCorProm":0,"ryd_remain_cnt":5,"qCor":5276,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":1,"zhuan_shen":0,"qDefProm":0}]}
     * other : {"live_house":100224042,"yard_lv":3,"icon_frame_list":[32544],"house_id":100224042,"house_lv":3,"iDyeCost":0,"iClosetCnt":2,"house_fengshui":1,"bubble_list":[],"addon_list":[40005,40004,40013],"foot_list":[],"title_effect_list":[],"iClosetDyeCost":30,"head_list":[36063,36072,36284,36235,36000],"cloth_list":[],"house_environ":30}
     * item_equip : {"item_list":[{"exinfo":{"iGood":0,"iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"5:5","iScore":5,"iPos":1,"iLevel":65},"iAmount":1,"iType":25420},{"exinfo":{"iTrade":0},"iAmount":1,"iType":22865},{"exinfo":{"iGood":0,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"4:5","iScore":4,"iPos":3,"iLevel":65},"iAmount":1,"iType":25426},{"exinfo":{"iTrade":0},"iAmount":2,"iType":5033},{"exinfo":{"iTrade":0},"iAmount":1,"iType":5032},{"exinfo":{"iTrade":0},"iAmount":1,"iType":31004},{"exinfo":{"iTrade":0},"iAmount":1,"iType":22839},{"exinfo":{"iTrade":0},"iAmount":1,"iType":22848},{"exinfo":{"iTrade":0},"iAmount":2,"iType":5031},{"exinfo":{"iTrade":0},"iAmount":1,"iType":20024},{"exinfo":{"iTrade":0},"iAmount":29,"iType":31002}],"ware_equip_list":[],"iWarehouseOwn":11,"recycle_item_list":[],"ware_item_list":[{"exinfo":{"ymsg":"法术伤害+54","iAmount":1,"iLevel":9},"iAmount":1,"iType":5409},{"exinfo":{"ymsg":"强化打造装备","iAmount":4},"iAmount":4,"iType":5031},{"exinfo":{"ymsg":"强化打造装备","iAmount":7},"iAmount":7,"iType":5033},{"exinfo":{"ymsg":"强化打造装备","iAmount":12},"iAmount":12,"iType":5034},{"exinfo":{"ymsg":"35级后可使用","iAmount":99},"iAmount":99,"iType":31002},{"exinfo":{"ymsg":"强化打造装备","iAmount":12},"iAmount":12,"iType":5032},{"exinfo":{"ymsg":"35级后可使用","iAmount":99},"iAmount":99,"iType":31002},{"exinfo":{"ymsg":"升级变化之术","iAmount":2,"iTrade":2147483632},"iAmount":2,"iType":22825},{"exinfo":{"ymsg":"法宝进阶","iAmount":2},"iAmount":2,"iType":8419},{"exinfo":{"ymsg":"增加宠物资质","iAmount":17},"iAmount":17,"iType":31004}],"equip_list":[{"exinfo":{"iDyeCnt":0,"iGood":1,"iKaifeng":0,"iRefineSuit":0,"cExProp":"4:4","iPkTmplId":0,"iEquipDye":0,"iLast":184,"iAdvanced":1,"iEquipDyeExpire":0,"ifail":2,"iTrade":1586430681,"cProp":"4:108|2:691","cMaker":"七喜_|100544083","iBind":0,"iScore":324,"iPos":1,"Gem":"3:10|3:10","iLevel":100},"iAmount":1,"iType":3011,"iWear":1},{"exinfo":{"iDyeCnt":0,"iGood":1,"iKaifeng":0,"iRefineSuit":0,"cExProp":"5:2|6:2","iPkTmplId":0,"iEquipDye":0,"iLast":171,"iAdvanced":1,"iEquipDyeExpire":0,"ifail":2,"iTrade":1586430681,"cProp":"5:203|6:106","cMaker":"一点乔蓝|101558","iBind":0,"iScore":628,"iPos":2,"Gem":"4:10|4:10","iLevel":100},"iAmount":1,"iType":3211,"iWear":1},{"exinfo":{"ifail":3,"cProp":"3:674|10:256|5:158","iDyeCnt":1,"iOriType":1411,"iKaifeng":1,"iRefineSuit":0,"cExProp":"3:20|10:-10|5:26","iEquipDye":4,"cExAddPoint":"4:-2|2:2","iEquipDyeExpire":0,"Gem":"4:11|4:11","iLevel":100,"iLast":115,"iBind":0,"iGood":1,"AddPoint":"4:23|2:24","iPkTmplId":0,"iAdvanced":1,"iTrade":1586430681,"cMaker":"森林女巫|148850","iScore":1173,"iPos":3},"iAmount":1,"iType":1211,"iWear":1},{"exinfo":{"iDyeCnt":0,"cProp":"1:590|4:178","iGood":1,"iKaifeng":0,"iRefineSuit":0,"AddPoint":"1:18|2:16","ifail":1,"iPkTmplId":0,"iEquipDye":0,"iLast":116,"iAdvanced":1,"iEquipDyeExpire":0,"iTrade":1586430681,"cExAddPoint":"2:3","cMaker":"冷月灬若雪|92412990","iBind":0,"iScore":551,"iPos":4,"Gem":"3:10|3:10","iLevel":100},"iAmount":1,"iType":3311,"iWear":1},{"exinfo":{"iDyeCnt":0,"iGood":1,"iKaifeng":0,"iRefineSuit":0,"cExProp":"1:14|4:2","iPkTmplId":0,"iEquipDye":0,"iLast":184,"iAdvanced":1,"iEquipDyeExpire":0,"ifail":2,"iTrade":1586430681,"cProp":"1:857|4:73","cMaker":"雨曦°|106072667","iBind":0,"iScore":478,"iPos":5,"Gem":"6:10|6:10","iLevel":100},"iAmount":1,"iType":3511,"iWear":1},{"exinfo":{"iDyeCnt":0,"iGood":1,"iKaifeng":0,"iRefineSuit":0,"cExProp":"7:1","iPkTmplId":0,"iEquipDye":0,"iLast":100,"Effect":"3|","iAdvanced":1,"iEquipDyeExpire":0,"ifail":0,"iTrade":1586430681,"cProp":"7:59|6:68","cMaker":"Adorei|181172124","iBind":0,"iScore":397,"iPos":6,"Gem":"6:9|6:9","iLevel":70},"iAmount":1,"iType":3608,"iWear":1}],"iMaxBag":90,"recycle_equip_list":[{"exinfo":{"ymsg":"70","AddPoint":"1:34|3:-7","iAmount":1,"iScore":213,"droptime":1584757654,"iLast":500,"iAdvanced":1,"cMaker":"一方＂一净土|159979203","cProp":"1:387|4:122","iGood":1,"iLevel":70},"iAmount":1,"iType":3308},{"exinfo":{"ymsg":"70","AddPoint":"3:22|2:-5","iAmount":1,"iScore":203,"droptime":1520168417,"iLast":500,"iAdvanced":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:361|4:136","iGood":1,"iLevel":70},"iAmount":1,"iType":3308},{"exinfo":{"AddPoint":"3:23","iAmount":1,"iScore":210,"iLast":500,"droptime":1502187670,"iAdvanced":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:397|4:125","iGood":1,"iLevel":70},"iAmount":1,"iType":3308},{"exinfo":{"AddPoint":"5:19","iAmount":1,"iScore":277,"iLast":500,"droptime":1512305922,"Effect":"15|","iAdvanced":1,"iTrade":1586430681,"cProp":"1:443|4:143","cMaker":"Amoヽ晴天灬|159979203","iBind":1,"iGood":1,"iLevel":80},"iAmount":1,"iType":3309},{"exinfo":{"iAmount":1,"iScore":561,"iLast":500,"droptime":1492914810,"iAdvanced":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"5:126|3:460|10:130","iGood":1,"iLevel":70},"iAmount":1,"iType":1408},{"exinfo":{"ymsg":"70","AddPoint":"1:-4|5:20","iAmount":1,"iGood":1,"droptime":1555297601,"iLast":500,"iAdvanced":1,"iTrade":1586430681,"cProp":"3:502|10:140|5:107","cMaker":"Amoヽ晴天灬|159979203","iBind":1,"iScore":526,"iLevel":70},"iAmount":1,"iType":1408},{"exinfo":{"ymsg":"70","AddPoint":"1:25","iAmount":1,"iScore":491,"droptime":1527481116,"iLast":500,"iAdvanced":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"3:454|10:123|5:102","iGood":1,"iLevel":70},"iAmount":1,"iType":1808},{"exinfo":{"ymsg":"70","iAmount":1,"iScore":497,"iLast":500,"droptime":1519658229,"iAdvanced":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"3:497|10:155|5:103","iGood":1,"iLevel":70},"iAmount":1,"iType":1008},{"exinfo":{"ymsg":"70","iAmount":1,"iGood":1,"iLast":500,"droptime":1555297634,"iAdvanced":1,"iTrade":1586430681,"cProp":"5:132|6:73","cMaker":"Amoヽ晴天灬|159979203","iBind":1,"iScore":292,"Special":"20005|","iLevel":70},"iAmount":1,"iType":3208},{"exinfo":{"iAmount":1,"iScore":502,"iLast":500,"droptime":1511594901,"iAdvanced":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"3:502|10:116|5:102","iGood":1,"iLevel":70},"iAmount":1,"iType":1808},{"exinfo":{"iAmount":1,"iScore":60,"iLast":200,"droptime":1507895855,"iAdvanced":1,"iTrade":1586430681,"cMaker":"回憶、過去|56280436","cProp":"4:81|2:471","iGood":1,"iLevel":70},"iAmount":1,"iType":3008}]}
     * basic : {"pMag":709,"iExpAllHi":11,"iLineupScore":200,"iGold":233520,"iCritical":0,"iXianYu":0,"wuxun":2118,"fish":444,"iFengAttack":0,"iSchool":3,"pDexExtra":0,"ptfruit_pStr":1,"iYingFuExp":3000000,"cName":"一方＂一净土","iGrade":115,"iSilverHi":0,"marrier_name":"","iAchPoint":642,"pCorExtra":18,"iUpExp":176387719,"pRes":116,"iSkillScore":1461,"iMagCritical":30,"liangshi":246,"iExpAll":279873173,"iUpExpHi":0,"ptfruit_pMag":9,"ptfruit_pCor":3,"tt_moon_use_cnt":23,"pStrExtra":0,"ptfruit_pDex":0,"pCor":117,"iDefense":1251,"iTotalScore":35633,"pDex":115,"iXiuScore":5775,"iPointFree":0,"iIcon":3,"fruit_num":17,"orgtitle":"","iFengDodge":2300,"hero":0,"pResExtra":21,"iEquipScore":7102,"hpsupply":910203,"iDamage":911,"iMagDam":1731,"iMagDef":1455,"perm_parnter_list":[1052,1033,1006,1054,1036,1058,1005,1001,1044,1050,1003],"pMagExtra":45,"change_sch_list":[7],"beast":1,"orgsc":0,"iMp_Max":5561,"cOrg":"","fabao_sc":0,"iHeal":246,"iGradeScore":3450,"iSilver":4311765,"jieri":0,"iHp_Max":4033,"ptfruit_pRes":4,"iFabaoScore":1055,"shenqi":0,"iScore":19878,"iPtfruitScore":55,"iBeastScore":15755,"pStr":116,"guaji_point":3000,"iSex":1,"shimen":88,"iReMagCritical":0,"marrier":-1,"xiayi":7975,"mpsupply":438508,"change_icon_list":[5],"fitbeast_sc":48,"iReCritical":0,"iSpeed":682,"perm_title_list":[15401,126406,28005,104903,24505,12203,105802,127601,16902,24600,22901,10202],"fashion":0,"point_scheme_dict":{"pMag":709,"pStr":116,"pCor":117,"pRes":116,"pDex":115}}
     * fabao : {"fabao_list":[{"iId":8103,"iGrade":1,"iFourAttr":0,"stage":[]},{"iId":8003,"iGrade":3,"iFourAttr":0,"stage":[]},{"iId":8006,"iGrade":10,"iFourAttr":3,"stage":[{"iAttrVal":60,"iStageIdx":1,"iAttr":1},{"iAttrVal":150,"iStageIdx":2,"iAttr":1},{"iAttrVal":150,"iStageIdx":3,"iAttr":1}]},{"iId":8001,"iGrade":10,"iFourAttr":1,"stage":[{"iAttrVal":50,"iStageIdx":1,"iAttr":2},{"iAttrVal":120,"iStageIdx":2,"iAttr":1},{"iAttrVal":40,"iStageIdx":3,"iAttr":2}]},{"iId":8009,"iGrade":1,"iFourAttr":0,"stage":[]},{"iId":8011,"iGrade":1,"iFourAttr":0,"stage":[]},{"iId":8002,"iGrade":10,"iFourAttr":0,"stage":[{"iAttrVal":300,"iStageIdx":1,"iAttr":1},{"iAttrVal":180,"iStageIdx":2,"iAttr":1}]},{"iId":8107,"iGrade":1,"iFourAttr":0,"stage":[]},{"iId":8119,"iGrade":5,"iFourAttr":0,"stage":[]},{"iId":8008,"iGrade":1,"iFourAttr":0,"stage":[]},{"iId":8106,"iGrade":3,"iFourAttr":0,"stage":[]},{"iId":8005,"iGrade":5,"iFourAttr":0,"stage":[]},{"iId":8108,"iGrade":1,"iFourAttr":0,"stage":[]},{"iId":8010,"iGrade":8,"iFourAttr":0,"stage":[{"iAttrVal":200,"iStageIdx":1,"iAttr":1}]},{"iId":8109,"iGrade":1,"iFourAttr":0,"stage":[]},{"iId":8004,"iGrade":2,"iFourAttr":0,"stage":[]},{"iId":8007,"iGrade":5,"iFourAttr":0,"stage":[]}]}
     * skill : {"lineup_list":[{"protect":0,"level":1,"protect_exp":0,"level_exp":2000,"protect_max_exp":1,"level_max_exp":20000,"id":9},{"protect":0,"level":2,"protect_exp":0,"level_exp":16600,"protect_max_exp":1,"level_max_exp":60000,"id":6},{"protect":0,"level":1,"protect_exp":0,"level_exp":2600,"protect_max_exp":1,"level_max_exp":20000,"id":2},{"protect":0,"level":1,"protect_exp":0,"level_exp":2200,"protect_max_exp":1,"level_max_exp":20000,"id":1},{"protect":0,"level":1,"protect_exp":0,"level_exp":0,"protect_max_exp":1,"level_max_exp":20000,"id":3},{"protect":0,"level":1,"protect_exp":0,"level_exp":5000,"protect_max_exp":1,"level_max_exp":20000,"id":10},{"protect":0,"level":1,"protect_exp":0,"level_exp":2000,"protect_max_exp":1,"level_max_exp":20000,"id":7},{"protect":0,"level":1,"protect_exp":0,"level_exp":5000,"protect_max_exp":1,"level_max_exp":20000,"id":8},{"protect":0,"level":1,"protect_exp":0,"level_exp":5000,"protect_max_exp":1,"level_max_exp":20000,"id":5},{"protect":0,"level":1,"protect_exp":0,"level_exp":4000,"protect_max_exp":1,"level_max_exp":20000,"id":4}],"iBBReFengXiu":10,"iReFengXiu":24,"org_skill_list":[{"skill_lv":60,"skill_id":200006},{"skill_lv":0,"skill_id":200003},{"skill_lv":90,"skill_id":200004},{"skill_lv":103,"skill_id":200001},{"skill_lv":30,"skill_id":200011},{"skill_lv":77,"skill_id":200002},{"skill_lv":0,"skill_id":200005},{"skill_lv":1,"skill_id":200012},{"skill_lv":61,"skill_id":200007},{"skill_lv":17,"skill_id":200009},{"skill_lv":0,"skill_id":200010},{"skill_lv":0,"skill_id":200008}],"work_list":[{"active":0,"grade":1,"work":1},{"active":1,"grade":4,"work":9},{"active":0,"grade":2,"work":7},{"active":1,"grade":2,"work":4}],"iShapeCardLv1":6,"iBBAttackXiu":25,"iShapeCardLv3":5,"iShapeCardLv2":1,"sch_skill_list":[{"skill_lv":115,"skill_id":3001},{"skill_lv":115,"skill_id":3003},{"skill_lv":115,"skill_id":3004},{"skill_lv":115,"skill_id":3005},{"skill_lv":115,"skill_id":3006},{"skill_lv":115,"skill_id":3002},{"skill_lv":115,"skill_id":3008},{"skill_lv":115,"skill_id":3007},{"skill_lv":3,"skill_id":3013}],"iAttackXiu":25,"iMagDefXiu":25,"iBBPhyDefXiu":18,"iPhyDefXiu":25,"iBBMagDefXiu":13}
     */

    private JingmaiBeanX jingmai;
    private MountBean mount;
    private SummonChildBean summon_child;
    private OtherBean other;
    private ItemEquipBean item_equip;
    private BasicBean basic;
    private FabaoBean fabao;
    private SkillBeans skill;

    @NoArgsConstructor
    @Data
    public static class JingmaiBeanX {
        /**
         * jingmai : {"cur_scheme_no":1,"jm_scheme_list":[{"use_qyd_num":12,"active_info":[{"xcs_self_effect_ratio":37,"equip_seq":21,"xc_stone_itemtype":24213,"xc_stone_last":16,"jm_no":11},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":18},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":2},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":6},{"xcs_self_effect_ratio":33,"equip_seq":19,"xc_stone_itemtype":24213,"xc_stone_last":0,"jm_no":20},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":1},{"xcs_self_effect_ratio":50,"equip_seq":20,"xc_stone_itemtype":24214,"xc_stone_last":31,"jm_no":3},{"xcs_self_effect_ratio":99,"equip_seq":12,"xc_stone_itemtype":24217,"xc_stone_last":0,"jm_no":10},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":7},{"xcs_self_effect_ratio":36,"equip_seq":18,"xc_stone_itemtype":24213,"xc_stone_last":0,"jm_no":19},{"xcs_self_effect_ratio":32,"equip_seq":17,"xc_stone_itemtype":24213,"xc_stone_last":0,"jm_no":5},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":4}],"scheme_no":1,"active_effect_ratio":100,"equip_effect_ratio":100}],"qyd_info":{"accu_activeness":0,"accu_exp":0,"own_qyd_num":12,"need_activeness":0,"need_exp":0,"make_qyd_st":1},"equip_info_list":[{"xcs_self_effect_ratio":32,"equip_seq":17,"xc_stone_itemtype":24213,"xc_stone_last":0},{"xcs_self_effect_ratio":36,"equip_seq":18,"xc_stone_itemtype":24213,"xc_stone_last":0},{"xcs_self_effect_ratio":99,"equip_seq":12,"xc_stone_itemtype":24217,"xc_stone_last":0},{"xcs_self_effect_ratio":37,"equip_seq":21,"xc_stone_itemtype":24213,"xc_stone_last":16},{"xcs_self_effect_ratio":33,"equip_seq":19,"xc_stone_itemtype":24213,"xc_stone_last":0},{"xcs_self_effect_ratio":50,"equip_seq":20,"xc_stone_itemtype":24214,"xc_stone_last":31}],"max_scheme_num":2}
         */

        private JingmaiBean jingmai;

        @NoArgsConstructor
        @Data
        public static class JingmaiBean {
            /**
             * cur_scheme_no : 1
             * jm_scheme_list : [{"use_qyd_num":12,"active_info":[{"xcs_self_effect_ratio":37,"equip_seq":21,"xc_stone_itemtype":24213,"xc_stone_last":16,"jm_no":11},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":18},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":2},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":6},{"xcs_self_effect_ratio":33,"equip_seq":19,"xc_stone_itemtype":24213,"xc_stone_last":0,"jm_no":20},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":1},{"xcs_self_effect_ratio":50,"equip_seq":20,"xc_stone_itemtype":24214,"xc_stone_last":31,"jm_no":3},{"xcs_self_effect_ratio":99,"equip_seq":12,"xc_stone_itemtype":24217,"xc_stone_last":0,"jm_no":10},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":7},{"xcs_self_effect_ratio":36,"equip_seq":18,"xc_stone_itemtype":24213,"xc_stone_last":0,"jm_no":19},{"xcs_self_effect_ratio":32,"equip_seq":17,"xc_stone_itemtype":24213,"xc_stone_last":0,"jm_no":5},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":4}],"scheme_no":1,"active_effect_ratio":100,"equip_effect_ratio":100}]
             * qyd_info : {"accu_activeness":0,"accu_exp":0,"own_qyd_num":12,"need_activeness":0,"need_exp":0,"make_qyd_st":1}
             * equip_info_list : [{"xcs_self_effect_ratio":32,"equip_seq":17,"xc_stone_itemtype":24213,"xc_stone_last":0},{"xcs_self_effect_ratio":36,"equip_seq":18,"xc_stone_itemtype":24213,"xc_stone_last":0},{"xcs_self_effect_ratio":99,"equip_seq":12,"xc_stone_itemtype":24217,"xc_stone_last":0},{"xcs_self_effect_ratio":37,"equip_seq":21,"xc_stone_itemtype":24213,"xc_stone_last":16},{"xcs_self_effect_ratio":33,"equip_seq":19,"xc_stone_itemtype":24213,"xc_stone_last":0},{"xcs_self_effect_ratio":50,"equip_seq":20,"xc_stone_itemtype":24214,"xc_stone_last":31}]
             * max_scheme_num : 2
             */

            private int cur_scheme_no;
            private QydInfoBean qyd_info;
            private int max_scheme_num;
            private List<JmSchemeListBean> jm_scheme_list;
            private List<EquipInfoListBean> equip_info_list;

            @NoArgsConstructor
            @Data
            public static class QydInfoBean {
                /**
                 * accu_activeness : 0
                 * accu_exp : 0
                 * own_qyd_num : 12
                 * need_activeness : 0
                 * need_exp : 0
                 * make_qyd_st : 1
                 */

                private int accu_activeness;
                private int accu_exp;
                private int own_qyd_num;
                private int need_activeness;
                private int need_exp;
                private int make_qyd_st;
            }

            @NoArgsConstructor
            @Data
            public static class JmSchemeListBean {
                /**
                 * use_qyd_num : 12
                 * active_info : [{"xcs_self_effect_ratio":37,"equip_seq":21,"xc_stone_itemtype":24213,"xc_stone_last":16,"jm_no":11},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":18},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":2},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":6},{"xcs_self_effect_ratio":33,"equip_seq":19,"xc_stone_itemtype":24213,"xc_stone_last":0,"jm_no":20},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":1},{"xcs_self_effect_ratio":50,"equip_seq":20,"xc_stone_itemtype":24214,"xc_stone_last":31,"jm_no":3},{"xcs_self_effect_ratio":99,"equip_seq":12,"xc_stone_itemtype":24217,"xc_stone_last":0,"jm_no":10},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":7},{"xcs_self_effect_ratio":36,"equip_seq":18,"xc_stone_itemtype":24213,"xc_stone_last":0,"jm_no":19},{"xcs_self_effect_ratio":32,"equip_seq":17,"xc_stone_itemtype":24213,"xc_stone_last":0,"jm_no":5},{"xcs_self_effect_ratio":0,"equip_seq":0,"xc_stone_itemtype":0,"xc_stone_last":0,"jm_no":4}]
                 * scheme_no : 1
                 * active_effect_ratio : 100
                 * equip_effect_ratio : 100
                 */

                private int use_qyd_num;
                private int scheme_no;
                private int active_effect_ratio;
                private int equip_effect_ratio;
                private List<ActiveInfoBean> active_info;

                @NoArgsConstructor
                @Data
                public static class ActiveInfoBean {
                    /**
                     * xcs_self_effect_ratio : 37
                     * equip_seq : 21
                     * xc_stone_itemtype : 24213
                     * xc_stone_last : 16
                     * jm_no : 11
                     */

                    private int xcs_self_effect_ratio;
                    private int equip_seq;
                    private int xc_stone_itemtype;
                    private int xc_stone_last;
                    private int jm_no;
                }
            }

            @NoArgsConstructor
            @Data
            public static class EquipInfoListBean {
                /**
                 * xcs_self_effect_ratio : 32
                 * equip_seq : 17
                 * xc_stone_itemtype : 24213
                 * xc_stone_last : 0
                 */

                private int xcs_self_effect_ratio;
                private int equip_seq;
                private int xc_stone_itemtype;
                private int xc_stone_last;
            }
        }
    }

    @NoArgsConstructor
    @Data
    public static class MountBean {
        private List<MountListBean> mount_list;

        @NoArgsConstructor
        @Data
        public static class MountListBean {
            /**
             * info : {"pendantDye":[],"cSn":"","iType":4114,"iDyeExpire":0,"badgeList":[],"iBirthTime":1529358941,"cName":"刺果猬","iDye":0,"iSendTime":0,"iBadgeStatus":0,"iGrowth":0,"iIsRaised":0,"iSkill":0,"iMountStatus":1,"cSendName":"","iSpecMount":0,"iRare":1,"iStage":3,"iExpire":0}
             * mount_id : 1001_1529358941_1
             */

            private InfoBean info;
            private String mount_id;

            @NoArgsConstructor
            @Data
            public static class InfoBean {
                /**
                 * pendantDye : []
                 * cSn :
                 * iType : 4114
                 * iDyeExpire : 0
                 * badgeList : []
                 * iBirthTime : 1529358941
                 * cName : 刺果猬
                 * iDye : 0
                 * iSendTime : 0
                 * iBadgeStatus : 0
                 * iGrowth : 0
                 * iIsRaised : 0
                 * iSkill : 0
                 * iMountStatus : 1
                 * cSendName :
                 * iSpecMount : 0
                 * iRare : 1
                 * iStage : 3
                 * iExpire : 0
                 */

                private String cSn;
                private int iType;
                private int iDyeExpire;
                private int iBirthTime;
                private String cName;
                private int iDye;
                private int iSendTime;
                private int iBadgeStatus;
                private int iGrowth;
                private int iIsRaised;
                private int iSkill;
                private int iMountStatus;
                private String cSendName;
                private int iSpecMount;
                private int iRare;
                private int iStage;
                private int iExpire;
                private List<?> pendantDye;
                private List<?> badgeList;
            }
        }
    }

    @NoArgsConstructor
    @Data
    public static class SummonChildBean {
        /**
         * child_list : []
         * iMaxBSlot : 10
         * recycle_summon_list : [{"pMag":19,"qDef":1258,"drugskill":[],"qDam":1382,"pStr":16,"life":7000,"pMagBorn":19,"growupProm":0,"cName":"羽云仙子","iGrade":0,"pMagScheme2":0,"quali_dan_limit":10,"equip":[],"skill":[{"id":419},{"id":402},{"id":404}],"iPointFreeScheme2":100,"pRes":26,"iEquipUnlock":0,"iHp_Max":190,"qMagDamProm":0,"iDefense":81,"iType":2057,"qCorProm":0,"qSpe":1298,"cFashion":"","iHp":190,"pDexScheme2":0,"qCorPromCnt":0,"quali_dan_remain":10,"pResBorn":26,"mark":2156,"iUpExp":0,"supersum":0,"qMagDam":1820,"pCor":21,"fashion_id":0,"iMp_Max":123,"pDex":18,"lszz_remain":5,"iPointFree":0,"qDamPromCnt":0,"bianyi":0,"upgrade_cnt":0,"iFengDodge":1,"ryd_used":0,"iPointScheme":1,"precioussum":0,"iDamage":33,"iMagDam":32,"iMagDef":44,"pCorBorn":21,"jpyx_use_cnt":2,"growup":1288,"iMp":123,"elementalsum":0,"dye":0,"qSpePromCnt":0,"pStrBorn":16,"growupPromCnt":0,"use_animal_yx":[],"qDamProm":0,"pResScheme2":0,"lockskill":0,"iPromoteGrade":0,"ignore_skill_confirm":0,"ryd_remain_cnt":5,"qDefPromCnt":0,"qCor":5135,"fashion_expire":0,"qMagDamPromCnt":0,"qSpeProm":0,"pDexBorn":18,"max_animal_yx":3,"wild":0,"iSpeed":38,"zhuan_shen":0,"qDefProm":0,"pCorScheme2":0,"pStrScheme2":0},{"pMag":71,"qDef":1323,"drugskill":[],"qDam":945,"pStr":51,"life":8110,"pMagBorn":30,"growupProm":0,"cName":"蚌仙子","iGrade":41,"pMagScheme2":0,"quali_dan_limit":10,"equip":[],"skill":[{"id":523},{"id":332},{"id":431},{"id":301}],"iPointFreeScheme2":510,"pRes":63,"iEquipUnlock":0,"iHp_Max":895,"qMagDamProm":0,"iDefense":349,"iType":2013,"qCorProm":0,"qSpe":756,"cFashion":"","iHp":895,"pDexScheme2":0,"qCorPromCnt":0,"quali_dan_remain":10,"pResBorn":22,"mark":1632,"iUpExp":0,"supersum":0,"qMagDam":1688,"pCor":57,"fashion_id":0,"iMp_Max":538,"pDex":63,"lszz_remain":5,"iPointFree":205,"qDamPromCnt":0,"bianyi":0,"upgrade_cnt":0,"iFengDodge":620,"ryd_used":0,"iPointScheme":1,"precioussum":0,"iDamage":188,"iMagDam":161,"iMagDef":162,"pCorBorn":16,"jpyx_use_cnt":2,"growup":1109,"iMp":538,"elementalsum":0,"dye":0,"qSpePromCnt":0,"pStrBorn":10,"growupPromCnt":0,"use_animal_yx":[],"qDamProm":0,"pResScheme2":0,"lockskill":0,"iPromoteGrade":0,"ignore_skill_confirm":0,"ryd_remain_cnt":5,"qDefPromCnt":0,"qCor":3812,"fashion_expire":0,"qMagDamPromCnt":0,"qSpeProm":0,"pDexBorn":22,"max_animal_yx":3,"wild":0,"iSpeed":177,"zhuan_shen":0,"qDefProm":0,"pCorScheme2":0,"pStrScheme2":0}]
         * ware_summon_list : [{"pMag":216,"qDef":1119,"drugskill":[],"qDam":986,"pStr":62,"life":4000,"pMagBorn":18,"growupProm":0,"cName":"珍露童子","iGrade":33,"pMagScheme2":0,"quali_dan_limit":10,"equip":[],"skill":[{"id":410},{"id":527},{"id":422},{"id":323}],"iPointFreeScheme2":430,"pRes":48,"iEquipUnlock":0,"iHp_Max":906,"qMagDamProm":0,"iDefense":265,"iType":2078,"qCorProm":0,"qSpe":1135,"cFashion":"","iHp":906,"pDexScheme2":0,"qCorPromCnt":0,"quali_dan_remain":10,"pResBorn":15,"mark":1880,"iUpExp":0,"supersum":0,"qMagDam":2675,"pCor":51,"fashion_id":0,"iMp_Max":1511,"pDex":53,"lszz_remain":5,"iPointFree":0,"qDamPromCnt":0,"bianyi":0,"upgrade_cnt":0,"iFengDodge":460,"ryd_used":0,"iPointScheme":1,"precioussum":0,"iDamage":204,"iMagDam":419,"iMagDef":369,"pCorBorn":18,"jpyx_use_cnt":2,"growup":1228,"iMp":1511,"elementalsum":0,"dye":0,"qSpePromCnt":0,"pStrBorn":29,"growupPromCnt":0,"use_animal_yx":[],"qDamProm":0,"pResScheme2":0,"lockskill":0,"iPromoteGrade":0,"ignore_skill_confirm":0,"ryd_remain_cnt":5,"qDefPromCnt":0,"qCor":4903,"fashion_expire":0,"qMagDamPromCnt":0,"qSpeProm":0,"pDexBorn":20,"max_animal_yx":3,"wild":0,"iSpeed":183,"zhuan_shen":0,"qDefProm":0,"pCorScheme2":0,"pStrScheme2":0},{"pMag":19,"qDef":1162,"drugskill":[],"qDam":1646,"pStr":43,"life":8000,"pMagBorn":11,"growupProm":0,"cName":"鬼剑","iGrade":8,"pMagScheme2":0,"quali_dan_limit":10,"equip":[],"skill":[{"id":404},{"id":431},{"id":302},{"id":503}],"iPointFreeScheme2":180,"pRes":20,"iEquipUnlock":0,"iHp_Max":315,"qMagDamProm":0,"iDefense":92,"iType":2056,"qCorProm":0,"qSpe":1548,"cFashion":"","iHp":315,"pDexScheme2":0,"qCorPromCnt":0,"quali_dan_remain":10,"pResBorn":12,"mark":2358,"iUpExp":0,"supersum":0,"qMagDam":2153,"pCor":22,"fashion_id":0,"iMp_Max":156,"pDex":36,"lszz_remain":5,"iPointFree":40,"qDamPromCnt":0,"bianyi":0,"upgrade_cnt":0,"iFengDodge":1,"ryd_used":0,"iPointScheme":1,"precioussum":0,"iDamage":120,"iMagDam":46,"iMagDef":69,"pCorBorn":14,"jpyx_use_cnt":2,"growup":1264,"iMp":156,"elementalsum":0,"dye":0,"qSpePromCnt":0,"pStrBorn":35,"growupPromCnt":0,"use_animal_yx":[],"qDamProm":0,"pResScheme2":0,"lockskill":0,"iPromoteGrade":0,"ignore_skill_confirm":0,"ryd_remain_cnt":5,"qDefPromCnt":0,"qCor":5167,"fashion_expire":0,"qMagDamPromCnt":0,"qSpeProm":0,"pDexBorn":28,"max_animal_yx":3,"wild":0,"iSpeed":99,"zhuan_shen":0,"qDefProm":0,"pCorScheme2":0,"pStrScheme2":0},{"pMag":20,"qDef":1095,"drugskill":[],"qDam":1128,"pStr":20,"life":8000,"pMagBorn":20,"growupProm":0,"cName":"布雨神君","iGrade":0,"pMagScheme2":0,"quali_dan_limit":10,"equip":[],"skill":[{"id":527},{"id":428},{"id":429}],"iPointFreeScheme2":100,"pRes":20,"iEquipUnlock":0,"iHp_Max":183,"qMagDamProm":0,"iDefense":63,"iType":2042,"qCorProm":0,"qSpe":1388,"cFashion":"","iHp":183,"pDexScheme2":0,"qCorPromCnt":0,"quali_dan_remain":10,"pResBorn":20,"mark":1773,"iUpExp":0,"supersum":0,"qMagDam":2778,"pCor":20,"fashion_id":0,"iMp_Max":131,"pDex":20,"lszz_remain":5,"iPointFree":0,"qDamPromCnt":0,"bianyi":0,"upgrade_cnt":0,"iFengDodge":1,"ryd_used":0,"iPointScheme":1,"precioussum":0,"iDamage":42,"iMagDam":34,"iMagDef":46,"pCorBorn":20,"jpyx_use_cnt":2,"growup":1300,"iMp":131,"elementalsum":0,"dye":0,"qSpePromCnt":0,"pStrBorn":20,"growupPromCnt":0,"use_animal_yx":[],"qDamProm":0,"pResScheme2":0,"lockskill":0,"iPromoteGrade":0,"ignore_skill_confirm":0,"ryd_remain_cnt":5,"qDefPromCnt":0,"qCor":4881,"fashion_expire":0,"qMagDamPromCnt":0,"qSpeProm":0,"pDexBorn":20,"max_animal_yx":3,"wild":0,"iSpeed":42,"zhuan_shen":0,"qDefProm":0,"pCorScheme2":0,"pStrScheme2":0}]
         * summon_list : [{"pMag":764,"drugskill":[{"status":1,"gongmingIds":[],"iPos":0,"iHight":2,"id":9218,"iLevel":3},{"status":0,"gongmingIds":[],"iPos":2,"iHight":0,"id":9511,"iLevel":5},{"status":0,"gongmingIds":[{"id":9513,"iPos":0},{"id":9511,"iPos":1},{"id":9501,"iPos":2},{"id":9504,"iPos":3}],"iPos":0,"iHight":1,"id":9015,"iLevel":5},{"status":0,"gongmingIds":[],"iPos":0,"iHight":0,"id":9508,"iLevel":5},{"status":0,"gongmingIds":[],"iPos":1,"iHight":0,"id":9510,"iLevel":5}],"pStr":149,"lljg_lefttime":0,"iSpeed":637,"equip":[{"AddPoint":"","iGood":0,"iType":25422,"pos":1,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"5:10","iScore":10,"Special":"","iLevel":105},{"AddPoint":"","iGood":0,"iType":25428,"pos":3,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:42","iScore":10,"Special":"","iLevel":105},{"AddPoint":"","iGood":0,"iType":25425,"pos":2,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"7:10","iScore":10,"Special":"","iLevel":105}],"skill":[{"id":409},{"id":526},{"id":414},{"id":407},{"id":433},{"id":435},{"id":406}],"ignore_skill_confirm":0,"pRes":138,"qMagDamProm":0,"supersum":0,"qMagDam":2113,"pCor":152,"iMp_Max":4928,"iPointFree":0,"qDamPromCnt":0,"qDamProm":0,"dye":0,"iTrainRemain":0,"qSpe":1372,"pCorScheme2":0,"qDam":1272,"growupProm":0,"iGrade":125,"quali_dan_limit":15,"iPointFreeScheme2":1350,"fashion_id":0,"use_animal_yx":[],"cFashion":"","quali_dan_remain":0,"ryd_used":0,"precioussum":0,"growup":1146,"iMagDef":1018,"jpyx_use_cnt":1,"iMp":4928,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":1,"lockskill":526,"pResBorn":13,"unique_drug_st":2,"qDefPromCnt":0,"iBound":0,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":3311,"pDexBorn":22,"pStrBorn":24,"iType":2024,"dye_expire":0,"mark":3385,"pDex":147,"fight_status":0,"life":2310,"iPointScheme":1,"iDamage":671,"pResScheme2":0,"mount_skill_id":0,"iTrade":1592654699,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":768,"pDexScheme2":0,"cName":"一沙＂一净土","pStrScheme2":0,"bianyi":0,"lszz_remain":0,"iMaxPointScheme":1,"iDefense":700,"iPromoteGrade":0,"iHp":3311,"iUpExp":328840,"upgrade_cnt":0,"iFengDodge":2300,"iMagDam":1434,"pCorBorn":27,"pMagBorn":14,"qCorProm":0,"ryd_remain_cnt":5,"qCor":5121,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":1,"zhuan_shen":0,"qDefProm":0},{"pMag":779,"drugskill":[{"status":1,"gongmingIds":[],"iPos":0,"iHight":1,"id":9006,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":2,"iHight":0,"id":9511,"iLevel":3},{"status":1,"gongmingIds":[],"iPos":0,"iHight":0,"id":9508,"iLevel":2},{"status":1,"gongmingIds":[],"iPos":1,"iHight":0,"id":9514,"iLevel":3},{"status":1,"gongmingIds":[],"iPos":0,"iHight":2,"id":9237,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":3,"iHight":0,"id":9510,"iLevel":2}],"pStr":138,"lljg_lefttime":0,"iSpeed":641,"equip":[{"AddPoint":"","iGood":0,"iType":25422,"pos":1,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"5:10","iScore":10,"Special":"","iLevel":105}],"skill":[{"id":306},{"id":307},{"id":525},{"id":309},{"id":314}],"ignore_skill_confirm":0,"pRes":136,"qMagDamProm":0,"supersum":0,"qMagDam":3345,"pCor":147,"iMp_Max":5896,"iPointFree":0,"qDamPromCnt":0,"qDamProm":0,"dye":50529027,"iTrainRemain":0,"qSpe":1229,"pCorScheme2":0,"qDam":1347,"growupProm":0,"iGrade":125,"quali_dan_limit":10,"iPointFreeScheme2":1351,"fashion_id":0,"use_animal_yx":[{"max_cnt":3,"cnt":1,"iType":31999}],"cFashion":"","quali_dan_remain":0,"ryd_used":0,"precioussum":0,"growup":1290,"iMagDef":1223,"jpyx_use_cnt":2,"iMp":5896,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":1,"lockskill":525,"pResBorn":11,"unique_drug_st":2,"qDefPromCnt":0,"iBound":0,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":3496,"pDexBorn":26,"pStrBorn":13,"iType":2044,"dye_expire":0,"mark":2547,"pDex":151,"fight_status":0,"life":226,"iPointScheme":1,"iDamage":706,"pResScheme2":0,"mount_skill_id":0,"iTrade":1586430681,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":1637,"pDexScheme2":0,"cName":"亲宝守护者","pStrScheme2":0,"bianyi":1,"lszz_remain":4,"iMaxPointScheme":1,"iDefense":1104,"iPromoteGrade":0,"iHp":3496,"iUpExp":117260,"upgrade_cnt":0,"iFengDodge":2300,"iMagDam":1706,"pCorBorn":22,"pMagBorn":28,"qCorProm":0,"ryd_remain_cnt":5,"qCor":5400,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":1,"zhuan_shen":0,"qDefProm":0},{"pMag":490,"drugskill":[],"pStr":108,"lljg_lefttime":0,"iSpeed":295,"equip":[],"skill":[{"id":403},{"id":415},{"id":525},{"id":409},{"id":307}],"ignore_skill_confirm":0,"pRes":100,"qMagDamProm":0,"supersum":0,"qMagDam":1008,"pCor":102,"iMp_Max":2619,"iPointFree":0,"qDamPromCnt":0,"qDamProm":0,"dye":0,"iTrainRemain":0,"qSpe":809,"pCorScheme2":0,"qDam":1116,"growupProm":0,"iGrade":80,"quali_dan_limit":10,"iPointFreeScheme2":900,"fashion_id":0,"use_animal_yx":[],"cFashion":"","quali_dan_remain":10,"ryd_used":0,"precioussum":0,"growup":1000,"iMagDef":540,"jpyx_use_cnt":2,"iMp":2619,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":0,"lockskill":0,"pResBorn":20,"unique_drug_st":0,"qDefPromCnt":0,"iBound":0,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":1159,"pDexBorn":20,"pStrBorn":20,"iType":2097,"dye_expire":0,"mark":1791,"pDex":100,"fight_status":0,"life":7469,"iPointScheme":1,"iDamage":493,"pResScheme2":0,"mount_skill_id":0,"iTrade":0,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":748,"pDexScheme2":0,"cName":"海毛虫","pStrScheme2":0,"bianyi":0,"lszz_remain":5,"iMaxPointScheme":1,"iDefense":440,"iPromoteGrade":0,"iHp":1159,"iUpExp":81131,"upgrade_cnt":0,"iFengDodge":1400,"iMagDam":705,"pCorBorn":20,"pMagBorn":20,"qCorProm":0,"ryd_remain_cnt":5,"qCor":1924,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":0,"zhuan_shen":0,"qDefProm":0},{"pMag":758,"drugskill":[],"pStr":143,"lljg_lefttime":0,"iSpeed":583,"equip":[],"skill":[{"id":525},{"id":309},{"id":310},{"id":307},{"id":306}],"ignore_skill_confirm":0,"pRes":143,"qMagDamProm":0,"supersum":0,"qMagDam":2964,"pCor":143,"iMp_Max":5573,"iPointFree":0,"qDamPromCnt":0,"qDamProm":0,"dye":0,"iTrainRemain":0,"qSpe":1140,"pCorScheme2":0,"qDam":1254,"growupProm":0,"iGrade":123,"quali_dan_limit":10,"iPointFreeScheme2":1330,"fashion_id":0,"use_animal_yx":[],"cFashion":"","quali_dan_remain":10,"ryd_used":0,"precioussum":0,"growup":1270,"iMagDef":1158,"jpyx_use_cnt":2,"iMp":5573,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":0,"lockskill":0,"pResBorn":20,"unique_drug_st":1,"qDefPromCnt":0,"iBound":1,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":3095,"pDexBorn":20,"pStrBorn":20,"iType":2044,"dye_expire":0,"mark":2094,"pDex":143,"fight_status":0,"life":6227,"iPointScheme":1,"iDamage":677,"pResScheme2":0,"mount_skill_id":0,"iTrade":2147483632,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":1482,"pDexScheme2":0,"cName":"灵符女娲","pStrScheme2":0,"bianyi":0,"lszz_remain":5,"iMaxPointScheme":1,"iDefense":1044,"iPromoteGrade":0,"iHp":3095,"iUpExp":635869,"upgrade_cnt":0,"iFengDodge":2260,"iMagDam":1556,"pCorBorn":20,"pMagBorn":20,"qCorProm":0,"ryd_remain_cnt":5,"qCor":5130,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":0,"zhuan_shen":0,"qDefProm":0},{"pMag":740,"drugskill":[{"status":0,"gongmingIds":[],"iPos":2,"iHight":0,"id":9505,"iLevel":1},{"status":0,"gongmingIds":[],"iPos":0,"iHight":1,"id":9013,"iLevel":1},{"status":0,"gongmingIds":[],"iPos":0,"iHight":0,"id":9517,"iLevel":1},{"status":0,"gongmingIds":[],"iPos":1,"iHight":0,"id":9512,"iLevel":1},{"status":0,"gongmingIds":[],"iPos":3,"iHight":0,"id":9523,"iLevel":1}],"pStr":138,"lljg_lefttime":0,"iSpeed":647,"equip":[],"skill":[{"id":527},{"id":306},{"id":307},{"id":333},{"id":309}],"ignore_skill_confirm":0,"pRes":138,"qMagDamProm":0,"supersum":0,"qMagDam":2990,"pCor":193,"iMp_Max":5589,"iPointFree":0,"qDamPromCnt":0,"qDamProm":0,"dye":0,"iTrainRemain":0,"qSpe":1356,"pCorScheme2":0,"qDam":1122,"growupProm":0,"iGrade":125,"quali_dan_limit":10,"iPointFreeScheme2":1350,"fashion_id":0,"use_animal_yx":[],"cFashion":"","quali_dan_remain":5,"ryd_used":0,"precioussum":0,"growup":1300,"iMagDef":1258,"jpyx_use_cnt":2,"iMp":5589,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":1,"lockskill":527,"pResBorn":13,"unique_drug_st":1,"qDefPromCnt":0,"iBound":0,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":3566,"pDexBorn":16,"pStrBorn":13,"iType":2042,"dye_expire":0,"mark":2293,"pDex":141,"fight_status":0,"life":6722,"iPointScheme":1,"iDamage":638,"pResScheme2":0,"mount_skill_id":0,"iTrade":1589939071,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":1152,"pDexScheme2":0,"cName":"一水\u201d一秋波","pStrScheme2":0,"bianyi":0,"lszz_remain":5,"iMaxPointScheme":1,"iDefense":911,"iPromoteGrade":0,"iHp":3566,"iUpExp":19688,"upgrade_cnt":0,"iFengDodge":2400,"iMagDam":1563,"pCorBorn":13,"pMagBorn":45,"qCorProm":0,"ryd_remain_cnt":5,"qCor":5010,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":1,"zhuan_shen":0,"qDefProm":0},{"pMag":764,"drugskill":[{"status":1,"gongmingIds":[],"iPos":0,"iHight":2,"id":9236,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":0,"iHight":1,"id":9006,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":1,"iHight":0,"id":9511,"iLevel":4},{"status":1,"gongmingIds":[],"iPos":0,"iHight":0,"id":9512,"iLevel":4},{"status":1,"gongmingIds":[],"iPos":2,"iHight":0,"id":9508,"iLevel":2},{"status":1,"gongmingIds":[],"iPos":3,"iHight":0,"id":9510,"iLevel":2}],"pStr":154,"lljg_lefttime":0,"iSpeed":680,"equip":[{"AddPoint":"4:6","iGood":0,"iType":25421,"pos":1,"Effect":"","iSystemBind":0,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"5:13","iScore":25,"Special":"","iLevel":85},{"AddPoint":"","iGood":0,"iType":25428,"pos":3,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:42","iScore":10,"Special":"","iLevel":105},{"AddPoint":"1:7","iGood":0,"iType":25424,"pos":2,"Effect":"","iSystemBind":0,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:28","iScore":21,"Special":"","iLevel":85}],"skill":[{"id":331},{"id":307},{"id":525},{"id":306},{"id":309}],"ignore_skill_confirm":0,"pRes":145,"qMagDamProm":0,"supersum":0,"qMagDam":2998,"pCor":142,"iMp_Max":5633,"iPointFree":0,"qDamPromCnt":0,"qDamProm":0,"dye":50529027,"iTrainRemain":0,"qSpe":1479,"pCorScheme2":0,"qDam":1419,"growupProm":0,"iGrade":125,"quali_dan_limit":10,"iPointFreeScheme2":1350,"fashion_id":0,"use_animal_yx":[],"cFashion":"","quali_dan_remain":10,"ryd_used":0,"precioussum":0,"growup":1270,"iMagDef":1180,"jpyx_use_cnt":2,"iMp":5633,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":1,"lockskill":525,"pResBorn":20,"unique_drug_st":2,"qDefPromCnt":0,"iBound":0,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":3788,"pDexBorn":20,"pStrBorn":29,"iType":2046,"dye_expire":0,"mark":2622,"pDex":145,"fight_status":1,"life":502,"iPointScheme":1,"iDamage":757,"pResScheme2":0,"mount_skill_id":0,"iTrade":1591655080,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":1719,"pDexScheme2":0,"cName":"一方\u2033一净土","pStrScheme2":0,"bianyi":1,"lszz_remain":0,"iMaxPointScheme":1,"iDefense":1177,"iPromoteGrade":0,"iHp":3788,"iUpExp":2034,"upgrade_cnt":0,"iFengDodge":2300,"iMagDam":1627,"pCorBorn":17,"pMagBorn":14,"qCorProm":0,"ryd_remain_cnt":5,"qCor":6279,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":1,"zhuan_shen":0,"qDefProm":0},{"pMag":137,"drugskill":[{"status":1,"gongmingIds":[],"iPos":0,"iHight":2,"id":9239,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":0,"iHight":1,"id":9004,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":2,"iHight":0,"id":9503,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":3,"iHight":0,"id":9501,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":1,"iHight":0,"id":9502,"iLevel":1},{"status":1,"gongmingIds":[],"iPos":0,"iHight":0,"id":9504,"iLevel":1}],"pStr":769,"lljg_lefttime":0,"iSpeed":738,"equip":[{"AddPoint":"5:6|4:3","iGood":1,"iType":25422,"pos":1,"Effect":"","iSystemBind":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"7:26","iScore":44,"Special":"","iLevel":105},{"AddPoint":"","iGood":0,"iType":25428,"pos":3,"Effect":"","iSystemBind":0,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"4:13","iScore":9,"Special":"","iLevel":105},{"AddPoint":"4:5","iGood":0,"iType":25423,"pos":2,"Effect":"","iSystemBind":0,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:29","iScore":17,"Special":"","iLevel":65}],"skill":[{"id":412},{"id":305},{"id":402},{"id":301}],"ignore_skill_confirm":0,"pRes":145,"qMagDamProm":0,"supersum":0,"qMagDam":1952,"pCor":146,"iMp_Max":1390,"iPointFree":1,"qDamPromCnt":0,"qDamProm":0,"dye":0,"iTrainRemain":0,"qSpe":1428,"pCorScheme2":0,"qDam":1669,"growupProm":0,"iGrade":125,"quali_dan_limit":10,"iPointFreeScheme2":1351,"fashion_id":0,"use_animal_yx":[{"max_cnt":3,"cnt":1,"iType":31999}],"cFashion":"","quali_dan_remain":0,"ryd_used":0,"precioussum":0,"growup":1287,"iMagDef":851,"jpyx_use_cnt":2,"iMp":1390,"elementalsum":0,"qSpePromCnt":0,"qCorPromCnt":0,"iGood":1,"lockskill":0,"pResBorn":20,"unique_drug_st":2,"qDefPromCnt":0,"iBound":0,"qSpeProm":0,"max_animal_yx":3,"iHp_Max":3250,"pDexBorn":28,"pStrBorn":19,"iType":2057,"dye_expire":0,"mark":2814,"pDex":153,"fight_status":0,"life":7631,"iPointScheme":1,"iDamage":2126,"pResScheme2":0,"mount_skill_id":0,"iTrade":1591704023,"wild":0,"growupPromCnt":0,"pMagScheme2":0,"qDef":1431,"pDexScheme2":0,"cName":"一往＂一情深","pStrScheme2":0,"bianyi":0,"lszz_remain":0,"iMaxPointScheme":1,"iDefense":1082,"iPromoteGrade":0,"iHp":3250,"iUpExp":355656,"upgrade_cnt":0,"iFengDodge":2300,"iMagDam":433,"pCorBorn":21,"pMagBorn":12,"qCorProm":0,"ryd_remain_cnt":5,"qCor":5276,"fashion_expire":0,"qMagDamPromCnt":0,"iEquipUnlock":1,"zhuan_shen":0,"qDefProm":0}]
         */

        private int iMaxBSlot;
        private List<?> child_list;
        private List<RecycleSummonListBean> recycle_summon_list;
        private List<WareSummonListBean> ware_summon_list;
        private List<SummonListBean> summon_list;

        @NoArgsConstructor
        @Data
        public static class RecycleSummonListBean {
            /**
             * pMag : 19
             * qDef : 1258
             * drugskill : []
             * qDam : 1382
             * pStr : 16
             * life : 7000
             * pMagBorn : 19
             * growupProm : 0
             * cName : 羽云仙子
             * iGrade : 0
             * pMagScheme2 : 0
             * quali_dan_limit : 10
             * equip : []
             * skill : [{"id":419},{"id":402},{"id":404}]
             * iPointFreeScheme2 : 100
             * pRes : 26
             * iEquipUnlock : 0
             * iHp_Max : 190
             * qMagDamProm : 0
             * iDefense : 81
             * iType : 2057
             * qCorProm : 0
             * qSpe : 1298
             * cFashion :
             * iHp : 190
             * pDexScheme2 : 0
             * qCorPromCnt : 0
             * quali_dan_remain : 10
             * pResBorn : 26
             * mark : 2156
             * iUpExp : 0
             * supersum : 0
             * qMagDam : 1820
             * pCor : 21
             * fashion_id : 0
             * iMp_Max : 123
             * pDex : 18
             * lszz_remain : 5
             * iPointFree : 0
             * qDamPromCnt : 0
             * bianyi : 0
             * upgrade_cnt : 0
             * iFengDodge : 1
             * ryd_used : 0
             * iPointScheme : 1
             * precioussum : 0
             * iDamage : 33
             * iMagDam : 32
             * iMagDef : 44
             * pCorBorn : 21
             * jpyx_use_cnt : 2
             * growup : 1288
             * iMp : 123
             * elementalsum : 0
             * dye : 0
             * qSpePromCnt : 0
             * pStrBorn : 16
             * growupPromCnt : 0
             * use_animal_yx : []
             * qDamProm : 0
             * pResScheme2 : 0
             * lockskill : 0
             * iPromoteGrade : 0
             * ignore_skill_confirm : 0
             * ryd_remain_cnt : 5
             * qDefPromCnt : 0
             * qCor : 5135
             * fashion_expire : 0
             * qMagDamPromCnt : 0
             * qSpeProm : 0
             * pDexBorn : 18
             * max_animal_yx : 3
             * wild : 0
             * iSpeed : 38
             * zhuan_shen : 0
             * qDefProm : 0
             * pCorScheme2 : 0
             * pStrScheme2 : 0
             */

            private int pMag;
            private int qDef;
            private int qDam;
            private int pStr;
            private int life;
            private int pMagBorn;
            private int growupProm;
            private String cName;
            private int iGrade;
            private int pMagScheme2;
            private int quali_dan_limit;
            private int iPointFreeScheme2;
            private int pRes;
            private int iEquipUnlock;
            private int iHp_Max;
            private int qMagDamProm;
            private int iDefense;
            private int iType;
            private int qCorProm;
            private int qSpe;
            private String cFashion;
            private int iHp;
            private int pDexScheme2;
            private int qCorPromCnt;
            private int quali_dan_remain;
            private int pResBorn;
            private int mark;
            private int iUpExp;
            private int supersum;
            private int qMagDam;
            private int pCor;
            private int fashion_id;
            private int iMp_Max;
            private int pDex;
            private int lszz_remain;
            private int iPointFree;
            private int qDamPromCnt;
            private int bianyi;
            private int upgrade_cnt;
            private int iFengDodge;
            private int ryd_used;
            private int iPointScheme;
            private int precioussum;
            private int iDamage;
            private int iMagDam;
            private int iMagDef;
            private int pCorBorn;
            private int jpyx_use_cnt;
            private int growup;
            private int iMp;
            private int elementalsum;
            private int dye;
            private int qSpePromCnt;
            private int pStrBorn;
            private int growupPromCnt;
            private int qDamProm;
            private int pResScheme2;
            private int lockskill;
            private int iPromoteGrade;
            private int ignore_skill_confirm;
            private int ryd_remain_cnt;
            private int qDefPromCnt;
            private int qCor;
            private int fashion_expire;
            private int qMagDamPromCnt;
            private int qSpeProm;
            private int pDexBorn;
            private int max_animal_yx;
            private int wild;
            private int iSpeed;
            private int zhuan_shen;
            private int qDefProm;
            private int pCorScheme2;
            private int pStrScheme2;
            private List<?> drugskill;
            private List<?> equip;
            private List<SkillBean> skill;
            private List<?> use_animal_yx;

            @NoArgsConstructor
            @Data
            public static class SkillBean {
                /**
                 * id : 419
                 */

                private int id;
            }
        }

        @NoArgsConstructor
        @Data
        public static class WareSummonListBean {
            /**
             * pMag : 216
             * qDef : 1119
             * drugskill : []
             * qDam : 986
             * pStr : 62
             * life : 4000
             * pMagBorn : 18
             * growupProm : 0
             * cName : 珍露童子
             * iGrade : 33
             * pMagScheme2 : 0
             * quali_dan_limit : 10
             * equip : []
             * skill : [{"id":410},{"id":527},{"id":422},{"id":323}]
             * iPointFreeScheme2 : 430
             * pRes : 48
             * iEquipUnlock : 0
             * iHp_Max : 906
             * qMagDamProm : 0
             * iDefense : 265
             * iType : 2078
             * qCorProm : 0
             * qSpe : 1135
             * cFashion :
             * iHp : 906
             * pDexScheme2 : 0
             * qCorPromCnt : 0
             * quali_dan_remain : 10
             * pResBorn : 15
             * mark : 1880
             * iUpExp : 0
             * supersum : 0
             * qMagDam : 2675
             * pCor : 51
             * fashion_id : 0
             * iMp_Max : 1511
             * pDex : 53
             * lszz_remain : 5
             * iPointFree : 0
             * qDamPromCnt : 0
             * bianyi : 0
             * upgrade_cnt : 0
             * iFengDodge : 460
             * ryd_used : 0
             * iPointScheme : 1
             * precioussum : 0
             * iDamage : 204
             * iMagDam : 419
             * iMagDef : 369
             * pCorBorn : 18
             * jpyx_use_cnt : 2
             * growup : 1228
             * iMp : 1511
             * elementalsum : 0
             * dye : 0
             * qSpePromCnt : 0
             * pStrBorn : 29
             * growupPromCnt : 0
             * use_animal_yx : []
             * qDamProm : 0
             * pResScheme2 : 0
             * lockskill : 0
             * iPromoteGrade : 0
             * ignore_skill_confirm : 0
             * ryd_remain_cnt : 5
             * qDefPromCnt : 0
             * qCor : 4903
             * fashion_expire : 0
             * qMagDamPromCnt : 0
             * qSpeProm : 0
             * pDexBorn : 20
             * max_animal_yx : 3
             * wild : 0
             * iSpeed : 183
             * zhuan_shen : 0
             * qDefProm : 0
             * pCorScheme2 : 0
             * pStrScheme2 : 0
             */

            private int pMag;
            private int qDef;
            private int qDam;
            private int pStr;
            private int life;
            private int pMagBorn;
            private int growupProm;
            private String cName;
            private int iGrade;
            private int pMagScheme2;
            private int quali_dan_limit;
            private int iPointFreeScheme2;
            private int pRes;
            private int iEquipUnlock;
            private int iHp_Max;
            private int qMagDamProm;
            private int iDefense;
            private int iType;
            private int qCorProm;
            private int qSpe;
            private String cFashion;
            private int iHp;
            private int pDexScheme2;
            private int qCorPromCnt;
            private int quali_dan_remain;
            private int pResBorn;
            private int mark;
            private int iUpExp;
            private int supersum;
            private int qMagDam;
            private int pCor;
            private int fashion_id;
            private int iMp_Max;
            private int pDex;
            private int lszz_remain;
            private int iPointFree;
            private int qDamPromCnt;
            private int bianyi;
            private int upgrade_cnt;
            private int iFengDodge;
            private int ryd_used;
            private int iPointScheme;
            private int precioussum;
            private int iDamage;
            private int iMagDam;
            private int iMagDef;
            private int pCorBorn;
            private int jpyx_use_cnt;
            private int growup;
            private int iMp;
            private int elementalsum;
            private int dye;
            private int qSpePromCnt;
            private int pStrBorn;
            private int growupPromCnt;
            private int qDamProm;
            private int pResScheme2;
            private int lockskill;
            private int iPromoteGrade;
            private int ignore_skill_confirm;
            private int ryd_remain_cnt;
            private int qDefPromCnt;
            private int qCor;
            private int fashion_expire;
            private int qMagDamPromCnt;
            private int qSpeProm;
            private int pDexBorn;
            private int max_animal_yx;
            private int wild;
            private int iSpeed;
            private int zhuan_shen;
            private int qDefProm;
            private int pCorScheme2;
            private int pStrScheme2;
            private List<?> drugskill;
            private List<?> equip;
            private List<SkillBeanX> skill;
            private List<?> use_animal_yx;

            @NoArgsConstructor
            @Data
            public static class SkillBeanX {
                /**
                 * id : 410
                 */

                private int id;
            }
        }

        @NoArgsConstructor
        @Data
        public static class SummonListBean {
            /**
             * pMag : 764
             * drugskill : [{"status":1,"gongmingIds":[],"iPos":0,"iHight":2,"id":9218,"iLevel":3},{"status":0,"gongmingIds":[],"iPos":2,"iHight":0,"id":9511,"iLevel":5},{"status":0,"gongmingIds":[{"id":9513,"iPos":0},{"id":9511,"iPos":1},{"id":9501,"iPos":2},{"id":9504,"iPos":3}],"iPos":0,"iHight":1,"id":9015,"iLevel":5},{"status":0,"gongmingIds":[],"iPos":0,"iHight":0,"id":9508,"iLevel":5},{"status":0,"gongmingIds":[],"iPos":1,"iHight":0,"id":9510,"iLevel":5}]
             * pStr : 149
             * lljg_lefttime : 0
             * iSpeed : 637
             * equip : [{"AddPoint":"","iGood":0,"iType":25422,"pos":1,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"5:10","iScore":10,"Special":"","iLevel":105},{"AddPoint":"","iGood":0,"iType":25428,"pos":3,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:42","iScore":10,"Special":"","iLevel":105},{"AddPoint":"","iGood":0,"iType":25425,"pos":2,"Effect":"","iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"7:10","iScore":10,"Special":"","iLevel":105}]
             * skill : [{"id":409},{"id":526},{"id":414},{"id":407},{"id":433},{"id":435},{"id":406}]
             * ignore_skill_confirm : 0
             * pRes : 138
             * qMagDamProm : 0
             * supersum : 0
             * qMagDam : 2113
             * pCor : 152
             * iMp_Max : 4928
             * iPointFree : 0
             * qDamPromCnt : 0
             * qDamProm : 0
             * dye : 0
             * iTrainRemain : 0
             * qSpe : 1372
             * pCorScheme2 : 0
             * qDam : 1272
             * growupProm : 0
             * iGrade : 125
             * quali_dan_limit : 15
             * iPointFreeScheme2 : 1350
             * fashion_id : 0
             * use_animal_yx : []
             * cFashion :
             * quali_dan_remain : 0
             * ryd_used : 0
             * precioussum : 0
             * growup : 1146
             * iMagDef : 1018
             * jpyx_use_cnt : 1
             * iMp : 4928
             * elementalsum : 0
             * qSpePromCnt : 0
             * qCorPromCnt : 0
             * iGood : 1
             * lockskill : 526
             * pResBorn : 13
             * unique_drug_st : 2
             * qDefPromCnt : 0
             * iBound : 0
             * qSpeProm : 0
             * max_animal_yx : 3
             * iHp_Max : 3311
             * pDexBorn : 22
             * pStrBorn : 24
             * iType : 2024
             * dye_expire : 0
             * mark : 3385
             * pDex : 147
             * fight_status : 0
             * life : 2310
             * iPointScheme : 1
             * iDamage : 671
             * pResScheme2 : 0
             * mount_skill_id : 0
             * iTrade : 1592654699
             * wild : 0
             * growupPromCnt : 0
             * pMagScheme2 : 0
             * qDef : 768
             * pDexScheme2 : 0
             * cName : 一沙＂一净土
             * pStrScheme2 : 0
             * bianyi : 0
             * lszz_remain : 0
             * iMaxPointScheme : 1
             * iDefense : 700
             * iPromoteGrade : 0
             * iHp : 3311
             * iUpExp : 328840
             * upgrade_cnt : 0
             * iFengDodge : 2300
             * iMagDam : 1434
             * pCorBorn : 27
             * pMagBorn : 14
             * qCorProm : 0
             * ryd_remain_cnt : 5
             * qCor : 5121
             * fashion_expire : 0
             * qMagDamPromCnt : 0
             * iEquipUnlock : 1
             * zhuan_shen : 0
             * qDefProm : 0
             */

            private int pMag;
            private int pStr;
            private int lljg_lefttime;
            private int iSpeed;
            private int ignore_skill_confirm;
            private int pRes;
            private int qMagDamProm;
            private int supersum;
            private int qMagDam;
            private int pCor;
            private int iMp_Max;
            private int iPointFree;
            private int qDamPromCnt;
            private int qDamProm;
            private int dye;
            private int iTrainRemain;
            private int qSpe;
            private int pCorScheme2;
            private int qDam;
            private int growupProm;
            private int iGrade;
            private int quali_dan_limit;
            private int iPointFreeScheme2;
            private int fashion_id;
            private String cFashion;
            private int quali_dan_remain;
            private int ryd_used;
            private int precioussum;
            private int growup;
            private int iMagDef;
            private int jpyx_use_cnt;
            private int iMp;
            private int elementalsum;
            private int qSpePromCnt;
            private int qCorPromCnt;
            private int iGood;
            private int lockskill;
            private int pResBorn;
            private int unique_drug_st;
            private int qDefPromCnt;
            private int iBound;
            private int qSpeProm;
            private int max_animal_yx;
            private int iHp_Max;
            private int pDexBorn;
            private int pStrBorn;
            private int iType;
            private int dye_expire;
            private int mark;
            private int pDex;
            private int fight_status;
            private int life;
            private int iPointScheme;
            private int iDamage;
            private int pResScheme2;
            private int mount_skill_id;
            private int iTrade;
            private int wild;
            private int growupPromCnt;
            private int pMagScheme2;
            private int qDef;
            private int pDexScheme2;
            private String cName;
            private int pStrScheme2;
            private int bianyi;
            private int lszz_remain;
            private int iMaxPointScheme;
            private int iDefense;
            private int iPromoteGrade;
            private int iHp;
            private int iUpExp;
            private int upgrade_cnt;
            private int iFengDodge;
            private int iMagDam;
            private int pCorBorn;
            private int pMagBorn;
            private int qCorProm;
            private int ryd_remain_cnt;
            private int qCor;
            private int fashion_expire;
            private int qMagDamPromCnt;
            private int iEquipUnlock;
            private int zhuan_shen;
            private int qDefProm;
            private List<DrugskillBean> drugskill;
            private List<EquipBean> equip;
            private List<SkillBeanXX> skill;
            private List<?> use_animal_yx;

            @NoArgsConstructor
            @Data
            public static class DrugskillBean {
                /**
                 * status : 1
                 * gongmingIds : []
                 * iPos : 0
                 * iHight : 2
                 * id : 9218
                 * iLevel : 3
                 */

                private int status;
                private int iPos;
                private int iHight;
                private int id;
                private int iLevel;
                private List<?> gongmingIds;
            }

            @NoArgsConstructor
            @Data
            public static class EquipBean {
                /**
                 * AddPoint :
                 * iGood : 0
                 * iType : 25422
                 * pos : 1
                 * Effect :
                 * iSystemBind : 1
                 * iTrade : 0
                 * cMaker : Amoヽ晴天灬|159979203
                 * cProp : 5:10
                 * iScore : 10
                 * Special :
                 * iLevel : 105
                 */

                private String AddPoint;
                private int iGood;
                private int iType;
                private int pos;
                private String Effect;
                private int iSystemBind;
                private int iTrade;
                private String cMaker;
                private String cProp;
                private int iScore;
                private String Special;
                private int iLevel;
            }

            @NoArgsConstructor
            @Data
            public static class SkillBeanXX {
                /**
                 * id : 409
                 */

                private int id;
            }
        }
    }

    @NoArgsConstructor
    @Data
    public static class OtherBean {
        /**
         * live_house : 100224042
         * yard_lv : 3
         * icon_frame_list : [32544]
         * house_id : 100224042
         * house_lv : 3
         * iDyeCost : 0
         * iClosetCnt : 2
         * house_fengshui : 1
         * bubble_list : []
         * addon_list : [40005,40004,40013]
         * foot_list : []
         * title_effect_list : []
         * iClosetDyeCost : 30
         * head_list : [36063,36072,36284,36235,36000]
         * cloth_list : []
         * house_environ : 30
         */

        private int live_house;
        private int yard_lv;
        private int house_id;
        private int house_lv;
        private int iDyeCost;
        private int iClosetCnt;
        private int house_fengshui;
        private int iClosetDyeCost;
        private int house_environ;
        private List<Integer> icon_frame_list;
        private List<?> bubble_list;
        private List<Integer> addon_list;
        private List<?> foot_list;
        private List<?> title_effect_list;
        private List<Integer> head_list;
        private List<?> cloth_list;
    }

    @NoArgsConstructor
    @Data
    public static class ItemEquipBean {
        /**
         * item_list : [{"exinfo":{"iGood":0,"iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"5:5","iScore":5,"iPos":1,"iLevel":65},"iAmount":1,"iType":25420},{"exinfo":{"iTrade":0},"iAmount":1,"iType":22865},{"exinfo":{"iGood":0,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"4:5","iScore":4,"iPos":3,"iLevel":65},"iAmount":1,"iType":25426},{"exinfo":{"iTrade":0},"iAmount":2,"iType":5033},{"exinfo":{"iTrade":0},"iAmount":1,"iType":5032},{"exinfo":{"iTrade":0},"iAmount":1,"iType":31004},{"exinfo":{"iTrade":0},"iAmount":1,"iType":22839},{"exinfo":{"iTrade":0},"iAmount":1,"iType":22848},{"exinfo":{"iTrade":0},"iAmount":2,"iType":5031},{"exinfo":{"iTrade":0},"iAmount":1,"iType":20024},{"exinfo":{"iTrade":0},"iAmount":29,"iType":31002}]
         * ware_equip_list : []
         * iWarehouseOwn : 11
         * recycle_item_list : []
         * ware_item_list : [{"exinfo":{"ymsg":"法术伤害+54","iAmount":1,"iLevel":9},"iAmount":1,"iType":5409},{"exinfo":{"ymsg":"强化打造装备","iAmount":4},"iAmount":4,"iType":5031},{"exinfo":{"ymsg":"强化打造装备","iAmount":7},"iAmount":7,"iType":5033},{"exinfo":{"ymsg":"强化打造装备","iAmount":12},"iAmount":12,"iType":5034},{"exinfo":{"ymsg":"35级后可使用","iAmount":99},"iAmount":99,"iType":31002},{"exinfo":{"ymsg":"强化打造装备","iAmount":12},"iAmount":12,"iType":5032},{"exinfo":{"ymsg":"35级后可使用","iAmount":99},"iAmount":99,"iType":31002},{"exinfo":{"ymsg":"升级变化之术","iAmount":2,"iTrade":2147483632},"iAmount":2,"iType":22825},{"exinfo":{"ymsg":"法宝进阶","iAmount":2},"iAmount":2,"iType":8419},{"exinfo":{"ymsg":"增加宠物资质","iAmount":17},"iAmount":17,"iType":31004}]
         * equip_list : [{"exinfo":{"iDyeCnt":0,"iGood":1,"iKaifeng":0,"iRefineSuit":0,"cExProp":"4:4","iPkTmplId":0,"iEquipDye":0,"iLast":184,"iAdvanced":1,"iEquipDyeExpire":0,"ifail":2,"iTrade":1586430681,"cProp":"4:108|2:691","cMaker":"七喜_|100544083","iBind":0,"iScore":324,"iPos":1,"Gem":"3:10|3:10","iLevel":100},"iAmount":1,"iType":3011,"iWear":1},{"exinfo":{"iDyeCnt":0,"iGood":1,"iKaifeng":0,"iRefineSuit":0,"cExProp":"5:2|6:2","iPkTmplId":0,"iEquipDye":0,"iLast":171,"iAdvanced":1,"iEquipDyeExpire":0,"ifail":2,"iTrade":1586430681,"cProp":"5:203|6:106","cMaker":"一点乔蓝|101558","iBind":0,"iScore":628,"iPos":2,"Gem":"4:10|4:10","iLevel":100},"iAmount":1,"iType":3211,"iWear":1},{"exinfo":{"ifail":3,"cProp":"3:674|10:256|5:158","iDyeCnt":1,"iOriType":1411,"iKaifeng":1,"iRefineSuit":0,"cExProp":"3:20|10:-10|5:26","iEquipDye":4,"cExAddPoint":"4:-2|2:2","iEquipDyeExpire":0,"Gem":"4:11|4:11","iLevel":100,"iLast":115,"iBind":0,"iGood":1,"AddPoint":"4:23|2:24","iPkTmplId":0,"iAdvanced":1,"iTrade":1586430681,"cMaker":"森林女巫|148850","iScore":1173,"iPos":3},"iAmount":1,"iType":1211,"iWear":1},{"exinfo":{"iDyeCnt":0,"cProp":"1:590|4:178","iGood":1,"iKaifeng":0,"iRefineSuit":0,"AddPoint":"1:18|2:16","ifail":1,"iPkTmplId":0,"iEquipDye":0,"iLast":116,"iAdvanced":1,"iEquipDyeExpire":0,"iTrade":1586430681,"cExAddPoint":"2:3","cMaker":"冷月灬若雪|92412990","iBind":0,"iScore":551,"iPos":4,"Gem":"3:10|3:10","iLevel":100},"iAmount":1,"iType":3311,"iWear":1},{"exinfo":{"iDyeCnt":0,"iGood":1,"iKaifeng":0,"iRefineSuit":0,"cExProp":"1:14|4:2","iPkTmplId":0,"iEquipDye":0,"iLast":184,"iAdvanced":1,"iEquipDyeExpire":0,"ifail":2,"iTrade":1586430681,"cProp":"1:857|4:73","cMaker":"雨曦°|106072667","iBind":0,"iScore":478,"iPos":5,"Gem":"6:10|6:10","iLevel":100},"iAmount":1,"iType":3511,"iWear":1},{"exinfo":{"iDyeCnt":0,"iGood":1,"iKaifeng":0,"iRefineSuit":0,"cExProp":"7:1","iPkTmplId":0,"iEquipDye":0,"iLast":100,"Effect":"3|","iAdvanced":1,"iEquipDyeExpire":0,"ifail":0,"iTrade":1586430681,"cProp":"7:59|6:68","cMaker":"Adorei|181172124","iBind":0,"iScore":397,"iPos":6,"Gem":"6:9|6:9","iLevel":70},"iAmount":1,"iType":3608,"iWear":1}]
         * iMaxBag : 90
         * recycle_equip_list : [{"exinfo":{"ymsg":"70","AddPoint":"1:34|3:-7","iAmount":1,"iScore":213,"droptime":1584757654,"iLast":500,"iAdvanced":1,"cMaker":"一方＂一净土|159979203","cProp":"1:387|4:122","iGood":1,"iLevel":70},"iAmount":1,"iType":3308},{"exinfo":{"ymsg":"70","AddPoint":"3:22|2:-5","iAmount":1,"iScore":203,"droptime":1520168417,"iLast":500,"iAdvanced":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:361|4:136","iGood":1,"iLevel":70},"iAmount":1,"iType":3308},{"exinfo":{"AddPoint":"3:23","iAmount":1,"iScore":210,"iLast":500,"droptime":1502187670,"iAdvanced":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"1:397|4:125","iGood":1,"iLevel":70},"iAmount":1,"iType":3308},{"exinfo":{"AddPoint":"5:19","iAmount":1,"iScore":277,"iLast":500,"droptime":1512305922,"Effect":"15|","iAdvanced":1,"iTrade":1586430681,"cProp":"1:443|4:143","cMaker":"Amoヽ晴天灬|159979203","iBind":1,"iGood":1,"iLevel":80},"iAmount":1,"iType":3309},{"exinfo":{"iAmount":1,"iScore":561,"iLast":500,"droptime":1492914810,"iAdvanced":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"5:126|3:460|10:130","iGood":1,"iLevel":70},"iAmount":1,"iType":1408},{"exinfo":{"ymsg":"70","AddPoint":"1:-4|5:20","iAmount":1,"iGood":1,"droptime":1555297601,"iLast":500,"iAdvanced":1,"iTrade":1586430681,"cProp":"3:502|10:140|5:107","cMaker":"Amoヽ晴天灬|159979203","iBind":1,"iScore":526,"iLevel":70},"iAmount":1,"iType":1408},{"exinfo":{"ymsg":"70","AddPoint":"1:25","iAmount":1,"iScore":491,"droptime":1527481116,"iLast":500,"iAdvanced":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"3:454|10:123|5:102","iGood":1,"iLevel":70},"iAmount":1,"iType":1808},{"exinfo":{"ymsg":"70","iAmount":1,"iScore":497,"iLast":500,"droptime":1519658229,"iAdvanced":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"3:497|10:155|5:103","iGood":1,"iLevel":70},"iAmount":1,"iType":1008},{"exinfo":{"ymsg":"70","iAmount":1,"iGood":1,"iLast":500,"droptime":1555297634,"iAdvanced":1,"iTrade":1586430681,"cProp":"5:132|6:73","cMaker":"Amoヽ晴天灬|159979203","iBind":1,"iScore":292,"Special":"20005|","iLevel":70},"iAmount":1,"iType":3208},{"exinfo":{"iAmount":1,"iScore":502,"iLast":500,"droptime":1511594901,"iAdvanced":1,"iTrade":1586430681,"cMaker":"Amoヽ晴天灬|159979203","cProp":"3:502|10:116|5:102","iGood":1,"iLevel":70},"iAmount":1,"iType":1808},{"exinfo":{"iAmount":1,"iScore":60,"iLast":200,"droptime":1507895855,"iAdvanced":1,"iTrade":1586430681,"cMaker":"回憶、過去|56280436","cProp":"4:81|2:471","iGood":1,"iLevel":70},"iAmount":1,"iType":3008}]
         */

        private int iWarehouseOwn;
        private int iMaxBag;
        private List<ItemListBean> item_list;
        private List<?> ware_equip_list;
        private List<?> recycle_item_list;
        private List<WareItemListBean> ware_item_list;
        private List<EquipListBean> equip_list;
        private List<RecycleEquipListBean> recycle_equip_list;

        @NoArgsConstructor
        @Data
        public static class ItemListBean {
            /**
             * exinfo : {"iGood":0,"iSystemBind":1,"iTrade":0,"cMaker":"Amoヽ晴天灬|159979203","cProp":"5:5","iScore":5,"iPos":1,"iLevel":65}
             * iAmount : 1
             * iType : 25420
             */

            private ExinfoBean exinfo;
            private int iAmount;
            private int iType;

            @NoArgsConstructor
            @Data
            public static class ExinfoBean {
                /**
                 * iGood : 0
                 * iSystemBind : 1
                 * iTrade : 0
                 * cMaker : Amoヽ晴天灬|159979203
                 * cProp : 5:5
                 * iScore : 5
                 * iPos : 1
                 * iLevel : 65
                 */

                private int iGood;
                private int iSystemBind;
                private int iTrade;
                private String cMaker;
                private String cProp;
                private int iScore;
                private int iPos;
                private int iLevel;
            }
        }

        @NoArgsConstructor
        @Data
        public static class WareItemListBean {
            /**
             * exinfo : {"ymsg":"法术伤害+54","iAmount":1,"iLevel":9}
             * iAmount : 1
             * iType : 5409
             */

            private ExinfoBeanX exinfo;
            private int iAmount;
            private int iType;

            @NoArgsConstructor
            @Data
            public static class ExinfoBeanX {
                /**
                 * ymsg : 法术伤害+54
                 * iAmount : 1
                 * iLevel : 9
                 */

                private String ymsg;
                private int iAmount;
                private int iLevel;
            }
        }

        @NoArgsConstructor
        @Data
        public static class EquipListBean {
            /**
             * exinfo : {"iDyeCnt":0,"iGood":1,"iKaifeng":0,"iRefineSuit":0,"cExProp":"4:4","iPkTmplId":0,"iEquipDye":0,"iLast":184,"iAdvanced":1,"iEquipDyeExpire":0,"ifail":2,"iTrade":1586430681,"cProp":"4:108|2:691","cMaker":"七喜_|100544083","iBind":0,"iScore":324,"iPos":1,"Gem":"3:10|3:10","iLevel":100}
             * iAmount : 1
             * iType : 3011
             * iWear : 1
             */

            private ExinfoBeanXX exinfo;
            private int iAmount;
            private int iType;
            private int iWear;

            @NoArgsConstructor
            @Data
            public static class ExinfoBeanXX {
                /**
                 * iDyeCnt : 0
                 * iGood : 1
                 * iKaifeng : 0
                 * iRefineSuit : 0
                 * cExProp : 4:4
                 * iPkTmplId : 0
                 * iEquipDye : 0
                 * iLast : 184
                 * iAdvanced : 1
                 * iEquipDyeExpire : 0
                 * ifail : 2
                 * iTrade : 1586430681
                 * cProp : 4:108|2:691
                 * cMaker : 七喜_|100544083
                 * iBind : 0
                 * iScore : 324
                 * iPos : 1
                 * Gem : 3:10|3:10
                 * iLevel : 100
                 */

                private int iDyeCnt;
                private int iGood;
                private int iKaifeng;
                private int iRefineSuit;
                private String cExProp;
                private int iPkTmplId;
                private int iEquipDye;
                private int iLast;
                private int iAdvanced;
                private int iEquipDyeExpire;
                private int ifail;
                private int iTrade;
                private String cProp;
                private String cMaker;
                private int iBind;
                private int iScore;
                private int iPos;
                private String Gem;
                private int iLevel;
            }
        }

        @NoArgsConstructor
        @Data
        public static class RecycleEquipListBean {
            /**
             * exinfo : {"ymsg":"70","AddPoint":"1:34|3:-7","iAmount":1,"iScore":213,"droptime":1584757654,"iLast":500,"iAdvanced":1,"cMaker":"一方＂一净土|159979203","cProp":"1:387|4:122","iGood":1,"iLevel":70}
             * iAmount : 1
             * iType : 3308
             */

            private ExinfoBeanXXX exinfo;
            private int iAmount;
            private int iType;

            @NoArgsConstructor
            @Data
            public static class ExinfoBeanXXX {
                /**
                 * ymsg : 70
                 * AddPoint : 1:34|3:-7
                 * iAmount : 1
                 * iScore : 213
                 * droptime : 1584757654
                 * iLast : 500
                 * iAdvanced : 1
                 * cMaker : 一方＂一净土|159979203
                 * cProp : 1:387|4:122
                 * iGood : 1
                 * iLevel : 70
                 */

                private String ymsg;
                private String AddPoint;
                private int iAmount;
                private int iScore;
                private int droptime;
                private int iLast;
                private int iAdvanced;
                private String cMaker;
                private String cProp;
                private int iGood;
                private int iLevel;
            }
        }
    }

    @NoArgsConstructor
    @Data
    public static class BasicBean {
        /**
         * pMag : 709
         * iExpAllHi : 11
         * iLineupScore : 200
         * iGold : 233520
         * iCritical : 0
         * iXianYu : 0
         * wuxun : 2118
         * fish : 444
         * iFengAttack : 0
         * iSchool : 3
         * pDexExtra : 0
         * ptfruit_pStr : 1
         * iYingFuExp : 3000000
         * cName : 一方＂一净土
         * iGrade : 115
         * iSilverHi : 0
         * marrier_name :
         * iAchPoint : 642
         * pCorExtra : 18
         * iUpExp : 176387719
         * pRes : 116
         * iSkillScore : 1461
         * iMagCritical : 30
         * liangshi : 246
         * iExpAll : 279873173
         * iUpExpHi : 0
         * ptfruit_pMag : 9
         * ptfruit_pCor : 3
         * tt_moon_use_cnt : 23
         * pStrExtra : 0
         * ptfruit_pDex : 0
         * pCor : 117
         * iDefense : 1251
         * iTotalScore : 35633
         * pDex : 115
         * iXiuScore : 5775
         * iPointFree : 0
         * iIcon : 3
         * fruit_num : 17
         * orgtitle :
         * iFengDodge : 2300
         * hero : 0
         * pResExtra : 21
         * iEquipScore : 7102
         * hpsupply : 910203
         * iDamage : 911
         * iMagDam : 1731
         * iMagDef : 1455
         * perm_parnter_list : [1052,1033,1006,1054,1036,1058,1005,1001,1044,1050,1003]
         * pMagExtra : 45
         * change_sch_list : [7]
         * beast : 1
         * orgsc : 0
         * iMp_Max : 5561
         * cOrg :
         * fabao_sc : 0
         * iHeal : 246
         * iGradeScore : 3450
         * iSilver : 4311765
         * jieri : 0
         * iHp_Max : 4033
         * ptfruit_pRes : 4
         * iFabaoScore : 1055
         * shenqi : 0
         * iScore : 19878
         * iPtfruitScore : 55
         * iBeastScore : 15755
         * pStr : 116
         * guaji_point : 3000
         * iSex : 1
         * shimen : 88
         * iReMagCritical : 0
         * marrier : -1
         * xiayi : 7975
         * mpsupply : 438508
         * change_icon_list : [5]
         * fitbeast_sc : 48
         * iReCritical : 0
         * iSpeed : 682
         * perm_title_list : [15401,126406,28005,104903,24505,12203,105802,127601,16902,24600,22901,10202]
         * fashion : 0
         * point_scheme_dict : {"pMag":709,"pStr":116,"pCor":117,"pRes":116,"pDex":115}
         */

        private int pMag;
        private int iExpAllHi;
        private int iLineupScore;
        private int iGold;
        private int iCritical;
        private int iXianYu;
        private int wuxun;
        private int fish;
        private int iFengAttack;
        private int iSchool;
        private int pDexExtra;
        private int ptfruit_pStr;
        private int iYingFuExp;
        private String cName;
        private int iGrade;
        private int iSilverHi;
        private String marrier_name;
        private int iAchPoint;
        private int pCorExtra;
        private int iUpExp;
        private int pRes;
        private int iSkillScore;
        private int iMagCritical;
        private int liangshi;
        private int iExpAll;
        private int iUpExpHi;
        private int ptfruit_pMag;
        private int ptfruit_pCor;
        private int tt_moon_use_cnt;
        private int pStrExtra;
        private int ptfruit_pDex;
        private int pCor;
        private int iDefense;
        private int iTotalScore;
        private int pDex;
        private int iXiuScore;
        private int iPointFree;
        private int iIcon;
        private int fruit_num;
        private String orgtitle;
        private int iFengDodge;
        private int hero;
        private int pResExtra;
        private int iEquipScore;
        private int hpsupply;
        private int iDamage;
        private int iMagDam;
        private int iMagDef;
        private int pMagExtra;
        private int beast;
        private int orgsc;
        private int iMp_Max;
        private String cOrg;
        private int fabao_sc;
        private int iHeal;
        private int iGradeScore;
        private int iSilver;
        private int jieri;
        private int iHp_Max;
        private int ptfruit_pRes;
        private int iFabaoScore;
        private int shenqi;
        private int iScore;
        private int iPtfruitScore;
        private int iBeastScore;
        private int pStr;
        private int guaji_point;
        private int iSex;
        private int shimen;
        private int iReMagCritical;
        private int marrier;
        private int xiayi;
        private int mpsupply;
        private int fitbeast_sc;
        private int iReCritical;
        private int iSpeed;
        private int fashion;
        private PointSchemeDictBean point_scheme_dict;
        private List<Integer> perm_parnter_list;
        private List<Integer> change_sch_list;
        private List<Integer> change_icon_list;
        private List<Integer> perm_title_list;

        @NoArgsConstructor
        @Data
        public static class PointSchemeDictBean {
            /**
             * pMag : 709
             * pStr : 116
             * pCor : 117
             * pRes : 116
             * pDex : 115
             */

            private int pMag;
            private int pStr;
            private int pCor;
            private int pRes;
            private int pDex;
        }
    }

    @NoArgsConstructor
    @Data
    public static class FabaoBean {
        private List<FabaoListBean> fabao_list;

        @NoArgsConstructor
        @Data
        public static class FabaoListBean {
            /**
             * iId : 8103
             * iGrade : 1
             * iFourAttr : 0
             * stage : []
             */

            private int iId;
            private int iGrade;
            private int iFourAttr;
            private List<?> stage;
        }
    }

    @NoArgsConstructor
    @Data
    public static class SkillBeans {
        /**
         * lineup_list : [{"protect":0,"level":1,"protect_exp":0,"level_exp":2000,"protect_max_exp":1,"level_max_exp":20000,"id":9},{"protect":0,"level":2,"protect_exp":0,"level_exp":16600,"protect_max_exp":1,"level_max_exp":60000,"id":6},{"protect":0,"level":1,"protect_exp":0,"level_exp":2600,"protect_max_exp":1,"level_max_exp":20000,"id":2},{"protect":0,"level":1,"protect_exp":0,"level_exp":2200,"protect_max_exp":1,"level_max_exp":20000,"id":1},{"protect":0,"level":1,"protect_exp":0,"level_exp":0,"protect_max_exp":1,"level_max_exp":20000,"id":3},{"protect":0,"level":1,"protect_exp":0,"level_exp":5000,"protect_max_exp":1,"level_max_exp":20000,"id":10},{"protect":0,"level":1,"protect_exp":0,"level_exp":2000,"protect_max_exp":1,"level_max_exp":20000,"id":7},{"protect":0,"level":1,"protect_exp":0,"level_exp":5000,"protect_max_exp":1,"level_max_exp":20000,"id":8},{"protect":0,"level":1,"protect_exp":0,"level_exp":5000,"protect_max_exp":1,"level_max_exp":20000,"id":5},{"protect":0,"level":1,"protect_exp":0,"level_exp":4000,"protect_max_exp":1,"level_max_exp":20000,"id":4}]
         * iBBReFengXiu : 10
         * iReFengXiu : 24
         * org_skill_list : [{"skill_lv":60,"skill_id":200006},{"skill_lv":0,"skill_id":200003},{"skill_lv":90,"skill_id":200004},{"skill_lv":103,"skill_id":200001},{"skill_lv":30,"skill_id":200011},{"skill_lv":77,"skill_id":200002},{"skill_lv":0,"skill_id":200005},{"skill_lv":1,"skill_id":200012},{"skill_lv":61,"skill_id":200007},{"skill_lv":17,"skill_id":200009},{"skill_lv":0,"skill_id":200010},{"skill_lv":0,"skill_id":200008}]
         * work_list : [{"active":0,"grade":1,"work":1},{"active":1,"grade":4,"work":9},{"active":0,"grade":2,"work":7},{"active":1,"grade":2,"work":4}]
         * iShapeCardLv1 : 6
         * iBBAttackXiu : 25
         * iShapeCardLv3 : 5
         * iShapeCardLv2 : 1
         * sch_skill_list : [{"skill_lv":115,"skill_id":3001},{"skill_lv":115,"skill_id":3003},{"skill_lv":115,"skill_id":3004},{"skill_lv":115,"skill_id":3005},{"skill_lv":115,"skill_id":3006},{"skill_lv":115,"skill_id":3002},{"skill_lv":115,"skill_id":3008},{"skill_lv":115,"skill_id":3007},{"skill_lv":3,"skill_id":3013}]
         * iAttackXiu : 25
         * iMagDefXiu : 25
         * iBBPhyDefXiu : 18
         * iPhyDefXiu : 25
         * iBBMagDefXiu : 13
         */

        private int iBBReFengXiu;
        private int iReFengXiu;
        private int iShapeCardLv1;
        private int iBBAttackXiu;
        private int iShapeCardLv3;
        private int iShapeCardLv2;
        private int iAttackXiu;
        private int iMagDefXiu;
        private int iBBPhyDefXiu;
        private int iPhyDefXiu;
        private int iBBMagDefXiu;
        private List<LineupListBean> lineup_list;
        private List<OrgSkillListBean> org_skill_list;
        private List<WorkListBean> work_list;
        private List<SchSkillListBean> sch_skill_list;

        @NoArgsConstructor
        @Data
        public static class LineupListBean {
            /**
             * protect : 0
             * level : 1
             * protect_exp : 0
             * level_exp : 2000
             * protect_max_exp : 1
             * level_max_exp : 20000
             * id : 9
             */

            private int protect;
            private int level;
            private int protect_exp;
            private int level_exp;
            private int protect_max_exp;
            private int level_max_exp;
            private int id;
        }

        @NoArgsConstructor
        @Data
        public static class OrgSkillListBean {
            /**
             * skill_lv : 等级
             * skill_id : 200006：药术 200001：强身 200002冥想 200004烹饪 200012强壮
             */

            private int skill_lv;
            private int skill_id;
        }

        @NoArgsConstructor
        @Data
        public static class WorkListBean {
            /**
             * active : 0
             * grade : 1
             * work : 1
             */

            private int active;
            private int grade;
            private int work;
        }

        @NoArgsConstructor
        @Data
        public static class SchSkillListBean {
            /**
             * skill_lv : 115
             * skill_id : 3001
             */

            private int skill_lv;
            private int skill_id;
        }
    }
}
