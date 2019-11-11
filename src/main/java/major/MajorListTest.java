package major;

import java.util.List;

import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSON;

/**
 * 
 *  说明：专业（全部）
 *  数据来源：http://member.jianshe99.com/zhuanti/onlineSearch/getOnlineInit.shtm?jsonpCallback=success_jsonpCallback&searchType=3&_=1572515405147
 *  @author:heshengjin qq:2356899074
 *  @date 2019年11月1日 上午9:55:01
 */
public class MajorListTest {
	
	private final static String majorListTest = "{\'MajorList\':[{\'optionName\':\'安全工程\',\'idx\':1146,\'simpleFlag\':\'A\',\'type\':3},{\'optionName\':\'半导体物理与器件\',\'idx\':1054,\'simpleFlag\':\'B\',\'type\':3},{\'optionName\':\'材料成形及控制工程\',\'idx\':1157,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'采矿工程\',\'idx\':1066,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'采油工程\',\'idx\':1166,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'测绘工程\',\'idx\':1079,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'测控技术与仪器\',\'idx\':1253,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'测量工程\',\'idx\':1081,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'测量学\',\'idx\':1083,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'城市燃气工程\',\'idx\':1200,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'城镇建设\',\'idx\':1026,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'船舶电气管理\',\'idx\':1287,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'船舶工程\',\'idx\':1101,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'船舶通信导航\',\'idx\':1215,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'船舶与海洋工程\',\'idx\':1100,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'磁性物理与器件\',\'idx\':1053,\'simpleFlag\':\'C\',\'type\':3},{\'optionName\':\'大地测量\',\'idx\':1080,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'大气探测技术\',\'idx\':1216,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'导弹制导\',\'idx\':1325,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'道路交通管理工程\',\'idx\':1308,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'道路交通事故防治工程\',\'idx\':1089,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'地球化学与勘察\',\'idx\':1075,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'地图学\',\'idx\':1082,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'地图制图\',\'idx\':1086,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'地下工程与隧道工程\',\'idx\':1035,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电厂热能动力工程\',\'idx\':1131,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电磁测量及仪表\',\'idx\':1271,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电磁场与微波技术\',\'idx\':1224,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电光源\',\'idx\':1056,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电化学工程\',\'idx\':1173,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电化学生产工艺\',\'idx\':1186,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电机\',\'idx\':1289,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电机电器及其控制\',\'idx\':1280,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电力牵引与传动控制\',\'idx\':1321,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电力系统及其自动化\',\'idx\':1277,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电气工程及其自动化\',\'idx\':1282,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电气技术\',\'idx\':1279,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电气绝缘材料\',\'idx\':1286,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电气绝缘与电缆\',\'idx\':1285,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电器\',\'idx\':1290,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电子材料与元器件\',\'idx\':1052,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电子工程\',\'idx\':1213,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电子技术\',\'idx\':1220,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电子精密机械\',\'idx\':1247,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电子科学与技术\',\'idx\':1049,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电子设备结构\',\'idx\':1248,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电子视监\',\'idx\':1212,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电子信息工程\',\'idx\':1205,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电子信息科学与技术\',\'idx\':1042,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电子学与信息系统\',\'idx\':1047,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电子仪器及测量技术\',\'idx\':1257,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'电子与信息技术\',\'idx\':1207,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'锻压工艺及设备\',\'idx\':1163,\'simpleFlag\':\'D\',\'type\':3},{\'optionName\':\'发酵工程\',\'idx\':1192,\'simpleFlag\':\'F\',\'type\':3},{\'optionName\':\'饭店工程\',\'idx\':1028,\'simpleFlag\':\'F\',\'type\':3},{\'optionName\':\'房地产经营管理\',\'idx\':1344,\'simpleFlag\':\'F\',\'type\':3},{\'optionName\':\'纺织机械\',\'idx\':1240,\'simpleFlag\':\'F\',\'type\':3},{\'optionName\':\'飞行器制导与控制\',\'idx\':1316,\'simpleFlag\':\'F\',\'type\':3},{\'optionName\':\'飞行器自动控制\',\'idx\':1324,\'simpleFlag\':\'F\',\'type\':3},{\'optionName\':\'分析仪器\',\'idx\':1264,\'simpleFlag\':\'F\',\'type\':3},{\'optionName\':\'粉末冶金\',\'idx\':1150,\'simpleFlag\':\'F\',\'type\':3},{\'optionName\':\'风景园林\',\'idx\':1340,\'simpleFlag\':\'F\',\'type\':3},{\'optionName\':\'腐蚀与防护\',\'idx\':1151,\'simpleFlag\':\'F\',\'type\':3},{\'optionName\':\'复合材料\',\'idx\':1155,\'simpleFlag\':\'F\',\'type\':3},{\'optionName\':\'感光材料\',\'idx\':1184,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'钢铁冶金\',\'idx\':1137,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'港口、海岸及近岸工程\',\'idx\':1099,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'港口航道及治河工程\',\'idx\':1093,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'港口航道与海岸工程\',\'idx\':1092,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'港口及航道工程\',\'idx\':1094,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'港口水工建筑工程\',\'idx\':1096,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'高电压技术及设备\',\'idx\':1284,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'高电压与绝缘技术\',\'idx\':1278,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'高分子材料及化工\',\'idx\':1175,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'高分子材料加工机械\',\'idx\':1239,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'高分子化工\',\'idx\':1182,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'给水排水工程\',\'idx\':1197,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工程测量\',\'idx\':1084,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工程管理\',\'idx\':1301,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工程力学\',\'idx\':1337,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工程热物理\',\'idx\':1130,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工商管理\',\'idx\':1345,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工商行政管理\',\'idx\':1341,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工业催化\',\'idx\':1187,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工业电气自动化\',\'idx\':1319,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工业分析\',\'idx\':1185,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工业工程\',\'idx\':1297,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工业管理工程\',\'idx\':1292,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工业化学\',\'idx\':1177,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工业设备安装工程\',\'idx\':1039,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工业与民用建筑工程\',\'idx\':1033,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工业自动化\',\'idx\':1314,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'工业自动化仪表\',\'idx\':1272,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'公共安全图像技术\',\'idx\':1209,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'公路、道路及机场工程\',\'idx\':1090,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'公路与城市道路工程\',\'idx\':1037,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'供热空调与燃气工程\',\'idx\':1201,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'供热通风与空调工程\',\'idx\':1199,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'观赏园艺\',\'idx\':1338,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'管理工程\',\'idx\':1300,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'惯性导航与仪表\',\'idx\':1326,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'光电成像技术\',\'idx\':1059,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'光电子技术\',\'idx\':1057,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'光学材料\',\'idx\':1267,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'光学工艺与测试\',\'idx\':1268,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'光学技术与光电仪器\',\'idx\':1255,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'光学仪器\',\'idx\':1269,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'光源与照明\',\'idx\':1281,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'广播电视工程\',\'idx\':1211,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'硅酸盐工程\',\'idx\':1154,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'锅炉\',\'idx\':1132,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'国际工程管理\',\'idx\':1298,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'国际企业管理\',\'idx\':1343,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'过程装备与控制工程\',\'idx\':1275,\'simpleFlag\':\'G\',\'type\':3},{\'optionName\':\'海岸与海洋工程\',\'idx\':1102,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'海洋船舶驾驶\',\'idx\':1303,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'海洋工程\',\'idx\':1104,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'海洋工程水文\',\'idx\':1114,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'焊接工艺及设备\',\'idx\':1162,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'航道（或整治）工程\',\'idx\':1098,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'航海技术\',\'idx\':1302,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'河川枢纽及水电站建筑物\',\'idx\':1109,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'河流泥沙及治河工程\',\'idx\':1095,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'核材料\',\'idx\':1333,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'核电子学与核技术应用\',\'idx\':1334,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'核动力装置\',\'idx\':1336,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'核反应堆工程\',\'idx\':1335,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'核工程\',\'idx\':1331,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'核工程与核技术\',\'idx\':1329,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'核化工\',\'idx\':1178,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'核技术\',\'idx\':1330,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'红外技术\',\'idx\':1058,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'化工工艺\',\'idx\':1172,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'化工设备与机械\',\'idx\':1276,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'化学工程\',\'idx\':1171,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'化学工程与工艺\',\'idx\':1174,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'化学制药\',\'idx\':1194,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'环境工程\',\'idx\':1141,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'环境规划与管理\',\'idx\':1143,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'环境监测\',\'idx\':1142,\'simpleFlag\':\'H\',\'type\':3},{\'optionName\':\'机车车辆工程\',\'idx\':1227,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'机械电子工程\',\'idx\':1251,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'机械设计及制造\',\'idx\':1235,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'机械设计制造及其自动化\',\'idx\':1226,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'机械制造电子控制与检测\',\'idx\':1250,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'机械制造工程\',\'idx\':1232,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'机械制造工艺与设备\',\'idx\':1231,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'机械自动化及机器人\',\'idx\':1249,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'基本建设管理工程\',\'idx\':1296,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'几何量计量测试\',\'idx\':1258,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'计算机及应用\',\'idx\':1063,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'计算机科学教育\',\'idx\':1065,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'计算机科学与技术\',\'idx\':1062,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'计算机器件及设备\',\'idx\':1061,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'计算机软件\',\'idx\':1064,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'计算机通信\',\'idx\':1203,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'技术经济\',\'idx\':1347,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'继电保护与自动远动技术\',\'idx\':1283,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'检测技术及仪器\',\'idx\':1270,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'检测技术及仪器仪表\',\'idx\':1256,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'检测技术与精密仪器\',\'idx\':1262,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'建筑材料与制品\',\'idx\':1156,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'建筑工程\',\'idx\':1025,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'建筑管理工程\',\'idx\':1293,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'建筑环境与设备工程\',\'idx\':1198,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'建筑学\',\'idx\':1040,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'交通工程\',\'idx\':1087,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'交通土建工程\',\'idx\':1027,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'交通信号与控制\',\'idx\':1322,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'交通运输\',\'idx\':1306,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'交通运输管理工程\',\'idx\':1310,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'金属材料工程\',\'idx\':1148,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'金属材料与热处理\',\'idx\':1158,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'金属压力加工\',\'idx\':1149,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'精密机械工程\',\'idx\':1234,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'精密机械与仪器制造\',\'idx\':1233,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'精密仪器\',\'idx\':1254,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'精细化工\',\'idx\':1183,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'军用车辆发动机\',\'idx\':1127,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'勘查地球物理\',\'idx\':1076,\'simpleFlag\':\'K\',\'type\':3},{\'optionName\':\'勘察工程\',\'idx\':1074,\'simpleFlag\':\'K\',\'type\':3},{\'optionName\':\'勘察技术与工程\',\'idx\':1071,\'simpleFlag\':\'K\',\'type\':3},{\'optionName\':\'科学仪器工程\',\'idx\':1265,\'simpleFlag\':\'K\',\'type\':3},{\'optionName\':\'矿场地球物理\',\'idx\':1077,\'simpleFlag\':\'K\',\'type\':3},{\'optionName\':\'矿井建设\',\'idx\':1031,\'simpleFlag\':\'K\',\'type\':3},{\'optionName\':\'矿山测量\',\'idx\':1085,\'simpleFlag\':\'K\',\'type\':3},{\'optionName\':\'矿山工程物理\',\'idx\':1068,\'simpleFlag\':\'K\',\'type\':3},{\'optionName\':\'矿山通风与安全\',\'idx\':1147,\'simpleFlag\':\'K\',\'type\':3},{\'optionName\':\'矿物加工工程\',\'idx\':1070,\'simpleFlag\':\'K\',\'type\':3},{\'optionName\':\'矿业机械\',\'idx\':1236,\'simpleFlag\':\'K\',\'type\':3},{\'optionName\':\'冷冻冷藏工程\',\'idx\':1123,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'力学计量测试\',\'idx\':1260,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'林业机械\',\'idx\':1252,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'林业经济管理\',\'idx\':1349,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'林业与木工机械\',\'idx\':1230,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'流体传动及控制\',\'idx\':1313,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'流体机械\',\'idx\':1317,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'流体机械及流体工程\',\'idx\':1118,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'流体控制与操纵系统\',\'idx\':1246,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'露天开采\',\'idx\':1067,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'陆地水文\',\'idx\':1113,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'轮机工程\',\'idx\':1304,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'轮机管理\',\'idx\':1305,\'simpleFlag\':\'L\',\'type\':3},{\'optionName\':\'煤化工\',\'idx\':1181,\'simpleFlag\':\'M\',\'type\':3},{\'optionName\':\'内燃机\',\'idx\':1125,\'simpleFlag\':\'N\',\'type\':3},{\'optionName\':\'能源工程\',\'idx\':1122,\'simpleFlag\':\'N\',\'type\':3},{\'optionName\':\'农业环境保护\',\'idx\':1145,\'simpleFlag\':\'N\',\'type\':3},{\'optionName\':\'农业机械\',\'idx\':1243,\'simpleFlag\':\'N\',\'type\':3},{\'optionName\':\'企业管理\',\'idx\':1342,\'simpleFlag\':\'Q\',\'type\':3},{\'optionName\':\'起重运输与工程机械\',\'idx\':1238,\'simpleFlag\':\'Q\',\'type\':3},{\'optionName\':\'汽车与拖拉机\',\'idx\':1245,\'simpleFlag\':\'Q\',\'type\':3},{\'optionName\':\'汽车运用工程\',\'idx\':1311,\'simpleFlag\':\'Q\',\'type\':3},{\'optionName\':\'桥梁工程\',\'idx\':1038,\'simpleFlag\':\'Q\',\'type\':3},{\'optionName\':\'热工计量测试\',\'idx\':1259,\'simpleFlag\':\'R\',\'type\':3},{\'optionName\':\'热加工工艺及设备\',\'idx\':1159,\'simpleFlag\':\'J\',\'type\':3},{\'optionName\':\'热力发动机\',\'idx\':1117,\'simpleFlag\':\'R\',\'type\':3},{\'optionName\':\'热力涡轮机\',\'idx\':1126,\'simpleFlag\':\'R\',\'type\':3},{\'optionName\':\'热能动力机械与装置\',\'idx\':1124,\'simpleFlag\':\'R\',\'type\':3},{\'optionName\':\'热能工程\',\'idx\':1120,\'simpleFlag\':\'R\',\'type\':3},{\'optionName\':\'热能工程与动力机械\',\'idx\':1119,\'simpleFlag\':\'R\',\'type\':3},{\'optionName\':\'热能与动力工程\',\'idx\':1116,\'simpleFlag\':\'R\',\'type\':3},{\'optionName\':\'软件工程\',\'idx\':1060,\'simpleFlag\':\'R\',\'type\':3},{\'optionName\':\'设备工程与管理\',\'idx\':1229,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'涉外建筑工程\',\'idx\':1029,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'涉外建筑工程营造与管理\',\'idx\':1299,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'摄影测量与遥感\',\'idx\':1208,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'生产过程自动化\',\'idx\':1320,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'生物工程\',\'idx\':1188,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'生物化工\',\'idx\':1189,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'生物化学工程\',\'idx\':1191,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'生物医学工程\',\'idx\':1327,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'生物医学工程与仪器\',\'idx\':1328,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'生物医学与信息系统\',\'idx\':1048,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'生物制药\',\'idx\':1195,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'石油储运\',\'idx\':1170,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'石油工程\',\'idx\':1164,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'石油加工\',\'idx\':1176,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'石油天然气储运工程\',\'idx\':1169,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'时间计控技术及仪器\',\'idx\':1263,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'室内设计\',\'idx\':1041,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水道及港口工程\',\'idx\':1097,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水工结构工程\',\'idx\':1110,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水力机械\',\'idx\':1318,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水利水电动力工程\',\'idx\':1134,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水利水电工程\',\'idx\':1106,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水利水电工程建筑\',\'idx\':1108,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水利水电工程施工\',\'idx\':1107,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水利水电建筑工程\',\'idx\':1105,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水声电子工程\',\'idx\':1214,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水文地质与工程地质\',\'idx\':1144,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水文与水资源工程\',\'idx\':1111,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水文与水资源利用\',\'idx\':1112,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水下动力机械工程\',\'idx\':1128,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水下引导电子技术\',\'idx\':1218,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水下自航器自动控制\',\'idx\':1323,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'水资源规划及利用\',\'idx\':1115,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'塑性成形工艺及设备\',\'idx\':1161,\'simpleFlag\':\'S\',\'type\':3},{\'optionName\':\'探矿工程\',\'idx\':1078,\'simpleFlag\':\'T\',\'type\':3},{\'optionName\':\'铁道车辆\',\'idx\':1244,\'simpleFlag\':\'T\',\'type\':3},{\'optionName\':\'铁道电气化\',\'idx\':1288,\'simpleFlag\':\'T\',\'type\':3},{\'optionName\':\'铁道工程\',\'idx\':1036,\'simpleFlag\':\'T\',\'type\':3},{\'optionName\':\'铁道运输\',\'idx\':1309,\'simpleFlag\':\'T\',\'type\':3},{\'optionName\':\'通信工程\',\'idx\':1202,\'simpleFlag\':\'T\',\'type\':3},{\'optionName\':\'同位素分离\',\'idx\':1332,\'simpleFlag\':\'T\',\'type\':3},{\'optionName\':\'投资经济\',\'idx\':1346,\'simpleFlag\':\'T\',\'type\':3},{\'optionName\':\'投资经济管理\',\'idx\':1350,\'simpleFlag\':\'T\',\'type\':3},{\'optionName\':\'图像传输与处理\',\'idx\':1222,\'simpleFlag\':\'T\',\'type\':3},{\'optionName\':\'土建结构工程\',\'idx\':1032,\'simpleFlag\':\'T\',\'type\':3},{\'optionName\':\'土木工程\',\'idx\':1030,\'simpleFlag\':\'T\',\'type\':3},{\'optionName\':\'微电子电路与系统\',\'idx\':1217,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'微电子技术\',\'idx\':1050,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'微生物制药\',\'idx\':1190,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'微特电机及控制电器\',\'idx\':1291,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'无机非金属材料\',\'idx\':1153,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'无机非金属材料工程\',\'idx\':1152,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'无机化工\',\'idx\':1179,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'无损检测\',\'idx\':1274,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'无线电波传播与天线\',\'idx\':1046,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'无线电计量测试\',\'idx\':1261,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'无线电技术\',\'idx\':1210,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'无线电技术与信息系统\',\'idx\':1206,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'无线电物理学\',\'idx\':1044,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'无线通信\',\'idx\':1204,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'物理电子和光电子技术\',\'idx\':1051,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'物理电子技术\',\'idx\':1055,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'物理电子学\',\'idx\':1045,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'物资管理工程\',\'idx\':1295,\'simpleFlag\':\'W\',\'type\':3},{\'optionName\':\'信息处理显示与识别\',\'idx\':1223,\'simpleFlag\':\'X\',\'type\':3},{\'optionName\':\'信息工程\',\'idx\':1221,\'simpleFlag\':\'X\',\'type\':3},{\'optionName\':\'信息与电子科学\',\'idx\':1043,\'simpleFlag\':\'X\',\'type\':3},{\'optionName\':\'刑事照相\',\'idx\':1225,\'simpleFlag\':\'X\',\'type\':3},{\'optionName\':\'选矿工程\',\'idx\':1069,\'simpleFlag\':\'X\',\'type\':3},{\'optionName\':\'压缩机\',\'idx\':1129,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'岩土工程\',\'idx\':1034,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'冶金\',\'idx\':1140,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'冶金工程\',\'idx\':1136,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'冶金机械\',\'idx\':1237,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'冶金物理化学\',\'idx\':1139,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'仪表及测试系统\',\'idx\':1273,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'仪器机械\',\'idx\':1241,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'印刷机械\',\'idx\':1242,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'应用地球化学\',\'idx\':1072,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'应用地球物理\',\'idx\':1073,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'应用电子技术\',\'idx\':1219,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'应用光学\',\'idx\':1266,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'邮电管理工程\',\'idx\':1294,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'邮电通信管理\',\'idx\':1348,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'油藏工程\',\'idx\':1167,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'油气储运工程\',\'idx\':1168,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'有机化工\',\'idx\':1180,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'有色金属冶金\',\'idx\':1138,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'园林\',\'idx\':1339,\'simpleFlag\':\'Y\',\'type\':3},{\'optionName\':\'载运工具运用工程\',\'idx\':1307,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'造船工艺及设备\',\'idx\':1103,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'真空技术及设备\',\'idx\':1228,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'制冷设备与低温技术\',\'idx\':1133,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'制冷与低温技术\',\'idx\':1121,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'制冷与冷藏技术\',\'idx\':1135,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'制药工程\',\'idx\':1193,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'中药制药\',\'idx\':1196,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'铸造\',\'idx\':1160,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'自动化\',\'idx\':1312,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'自动控制\',\'idx\':1315,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'总图设计与运输\',\'idx\':1091,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'总图设计与运输工程\',\'idx\':1088,\'simpleFlag\':\'Z\',\'type\':3},{\'optionName\':\'钻井工程\',\'idx\':1165,\'simpleFlag\':\'Z\',\'type\':3}]}";
    
	public static void main(String[] args) {
		MajorList majorList = JSON.parseObject(MajorListTest.majorListTest, MajorList.class);
		List<Major> list = majorList.getMajorList();
		if(!ObjectUtils.isEmpty(list)){
			for(Major major : list){
				System.out.println(JSON.toJSONString(major));
			}
		}
	}
}
