package majorcanexam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSON;

/**
 *  
 *  说明：二级建造师执业资格考试可以考试的专业和年限
 *  数据来源：http://www.wangxiao.cn/news/2704874.html
 *  @author:heshengjin qq:2356899074
 *  @date 2019年11月1日 上午10:18:43
 */
@SuppressWarnings("serial")
public class MajorCanExamTest {
	
	private static int  YEAR2= 2;
	private static int  YEAR5= 5;
	
	private static String listMajorCanExamStr2 = "矿井建设,土木工程,矿井建设,矿井建设,建筑工程技术,基础工程技术,建筑装饰工程技术,中国古建筑工程技术,地下工程与隧道工程技术,建筑工程,土建结构工程,工业与民用建筑工程,岩土工程,城镇规划,市政工程技术,城镇建设,城镇建设,公路运输与管理,高等级公路维护与管理,公路监理,道路桥梁工程技术,高速铁道技术,电气化铁道技术,铁路工程技术,城市轨道交通工程技术,交通土建工程,铁道工程,公路与城市道路工程,地下工程与隧道工程,桥梁工程,工业设备安装工程,工业设备安装工程,饭店工程,涉外建筑工程,土木工程,建筑设计技术,室内设计技术,建筑学,建筑学,建筑学,室内设计,电子信息科学与技术,无线电物理学,无线电物理学,物理电子学,无线电波传播与天线,电子学与信息系统,电子学与信息系统,生物医学与信息系统,信息与电子科学,电子科学与技术,电子材料与元器件,电子材料与元器件,磁性物理与器件,微电子技术,半导体物理与器件,物理电子技术,物理电子技术,物理电子技术,电光源,光电子技术,光电子技术,光电子技术,红外技术,光电成像技术,物理电子和光电子技术,物理电子和光电子技术,计算机科学与技术,计算机控制技术,计算机应用技术,计算机网络技术,计算机多媒体技术,计算机系统维护,计算机科学与技术,计算机及应用,计算机及应用,计算机软件,计算机软件,计算机科学教育,计算机科学教育,软件工程,计算机器件及设备,计算机科学与技术,采矿工程,煤矿开采技术,金属矿开采技术,非金属矿开采技术,矿山机电,采矿工程,采矿工程,采矿工程,露天开采,矿山工程物理,矿物加工工程,选矿机电技术,矿物加工工程,选矿工程,选矿工程,矿物加工技术,矿物加工工程,勘察技术与工程,煤田地质与勘查技术,油气地质与勘查技术,金属矿产地质与勘查技术,非金属矿产地质与勘查技术,,勘察技术与工程,水文地质与工程地质,水文地质与工程地质,工程地质勘查,应用地球化学,地球化学与勘察,水文地质与勘查技术,应用地球物理,勘查地球物理,矿场地球物理,勘察工程,探矿工程,测绘工程,测绘工程,大地测量,大地测量,工程测量技术,工程测量与监理,矿山测量,测量工程,测量学,工程测量,矿山测量,摄影测量与遥感,摄影测量与遥感,地图学,地图制图,交通工程,交通工程,交通工程,交通工程,公路、道路及机场工程,总图设计与运输工程,总图设计与运输,道路交通事故防治工程,港口航道与海岸工程,港口航道与治河工程,河务工程与管理,港口航道与海岸工程,港口航道及治河工程,港口及航道工程,河流泥沙及治河工程,港口水工建筑工程,水道及港口工程,航道（或整治）工程,港口工程技术,管道工程技术,管道工程施工,航道工程技术,海岸与海洋工程,海洋工程,港口、海岸及近岸工程,港口航道及海岸工程,船舶与海洋工程,船舶工程技术,船舶与海洋工程,船舶工程,船舶工程,造船工艺及设备,海岸与海洋工程,海洋工程,水利水电工程,水利工程,水利工程施工技术,水利水电建筑工程,水利水电工程管理,水利工程监理,水利水电工程,水利水电建筑工程,水利水电工程施工,水利水电工程建筑,城市水利,水利水电工程,河川枢纽及水电站建筑物,水工结构工程,水文与水资源工程,水文与水资源工程,水文与水资源利用,陆地水文,海洋工程水文,水资源规划及利用,热能与动力工程,热能动力设备与应用,城市热能应用技术,热能与动力工程,热力发动机,热能动力机械与装置,内燃机,热力涡轮机,军用车辆发动机,水下动力机械工程,流体机械及流体工程,流体机械,压缩机,水力机械,热能工程与动力机械,热能工程,工程热物理,热能工程,电厂热能动力工程,锅炉,制冷与低温技术,制冷设备与低温技术,能源工程,工程热物理,水利水电动力工程,水利水电动力工程,冷冻冷藏工程,制冷与冷藏技术,冶金工程,冶金工程,钢铁冶金,钢铁冶金,有色金属冶金,有色金属冶金,冶金物理化学,冶金物理化学,冶金,环境工程,环境工程,环境工程,环境工程,环境监测与治理技术,城市检测与工程技术,环境监测与评价,环境监测,环境监测,资源环境与城市管理,环境规划与管理,环境规划与管理,水环境监测与保护,城市水净化技术,水文地质与工程地质,水文地质与工程地质,环境艺术设计,农业环境保护,农业环境保护,安全工程,安全工程,矿山通风与安全,矿山通风与安全,工业环保与安全技术,安全技术管理,安全工程,安全工程,金属材料工程,金属材料工程,金属材料与热处理,金属材料与热处理,金属压力加工,金属压力加工,粉末冶金,粉末冶金,复合材料,复合材料,腐蚀与防护,腐蚀与防护,铸造,铸造,塑性成形工艺及设备,锻压工艺及设备,焊接工艺及设备,焊接工艺及设备,无机非金属材料工程,无机非金属材料工程,无机非金属材料,无机非金属材料,建筑材料与制品,硅酸盐工程,硅酸盐工程,复合材料,复合材料,材料成形及控制工程,材料工程技术,建筑装饰材料及检测,材料成形及控制工程,金属材料与热处理,金属材料与热处理,热加工工艺及设备,热加工工艺及设备,铸造,铸造,材料成型与控制技术,塑性成形工艺及设备,锻压工艺及设备,焊接工艺及设备,焊接工艺及设备,石油工程,石油工程,石油工程,钻井工程,采油工程,油藏工程,油气储运工程,油气储运工程,石油天然气储运工程,石油储运,化学工程与工艺,化学工程与工艺,化学工程,化学工程,石油加工,工业化学,核化工,化工工艺,无机化工,有机化工,煤化工,高分子化工,高分子化工,精细化工,精细化工,感光材料,生物化工,生物化工,工业分析,工业分析,电化学工程,电化学生产工艺,工业催化,工业催化,化学工程与工艺,高分子材料及化工,生物化学工程,生物工程,生物工程,生物化工,生物化工,微生物制药,微生物制药,生物化学工程,发酵工程,发酵工程,制药工程,制药工程,化学制药,化学制药,生物制药,生物制药,中药制药,中药制药,制药工程,给水排水工程,给排水工程技术,水工业技术,灌溉与排水技术,给水排水工程,给水排水工程,给水排水工程,建筑环境与设备工程,建筑设备工程技术,供热通风与空调工程技术,建筑环境与设备工程,供热通风与空调工程,供热通风与空调工程,建筑电气工程技术,城市燃气工程技术,城市燃气工程,城市燃气工程,楼宇智能化工程技术,供热空调与燃气工程,通信工程,通信技术,移动通信技术,程控交换技术,通信网络与设备,通信系统运行与管理,通信工程,通信工程,通信工程,无线通信,计算机通信,计算机通信,航空通信技术,计算机通信,电子信息工程,电子测量技术与仪器,电子仪器仪表与维修,电子设备与运行管理,微电子技术,无线电技术,电子信息工程,电子工程,无线电技术,广播电视工程,电子视监,电子工程,水声电子工程,船舶通信导航,大气探测技术,微电子电路与系统,水下引导电子技术,应用电子技术,应用电子技术,电子技术,图文信息技术,信息工程,信息工程,图象传输与处理,信息处理显示与识别,电磁场与微波技术,电磁场与微波技术,广播电视网络技术,有线电视工程技术,广播电视技术,影视多媒体技术,广播电视工程,电子信息工程技术,电子信息工程,无线电技术与信息系统,电子与信息技术,摄影测量与遥感,摄影测量与遥感,信息安全技术,公共安全图像技术,刑事照相,机械设计制造及其自动化,机械制造与自动化,室内检测与控制技术,数控技术,精密机械技术,机械设计制造及其自动化,机械制造工艺与设备,机械制造工艺与设备,机械制造工程,精密机械与仪器制造,精密机械工程,机械设计与制造,工业设计,计算机辅助设计与制造,机械设计及制造,机械设计及制造,矿业机械,冶金机械,起重运输与工程机械,高分子材料加工机械,纺织机械,仪器机械,印刷机械,农业机械,工程机械控制技术,工程机械运用与维护,机车车辆工程,铁道车辆,汽车与拖拉机,汽车与拖拉机,液压与气动技术,流体传动及控制,流体传动及控制,流体控制与操纵系统,真空技术及设备,真空技术及设备,机械电子工程,电子精密机械,电子设备结构,机械自动化及机器人,机械制造电子控制与检测,机械电子工程,设备工程与管理,设备工程与管理,林产化工技术,木材加工技术,林业与木工机械,林业机械,测控技术与仪器,测控技术与仪器,精密仪器,精密仪器,时间计控技术及仪器,分析仪器,科学仪器工程,光学技术与光电仪器,应用光学,光学材料,光学工艺与测试,光学仪器,检测技术及仪器仪表,检测技术及仪器,电磁测量及仪表,工业自动化仪表,仪表及测试系统,无损检测,电子仪器及测量技术,电子仪器及测量技术,几何量计量测试,几何量计量测试,热工计量测试,热工计量测试,力学计量测试,力学计量测试,无线电计量测试,无线电计量测试,检测技术与精密仪器,测控技术与仪器,过程装备与控制工程,过程装备与控制工程,化工设备与机械,化工设备与机械,电气工程及其自动化,发电厂及电力系统,电厂设备运行与维护,小型水电站及电力网,供用电技术,电网监控技术,农村电气化技术,电力系统自动化技术,水电站动力设备与管理,电气工程及其自动化,电气工程及其自动化,电力系统及其自动化,电力系统及其自动化,继电保护与自动远动技术,高电压与绝缘技术,高电压技术及设备,电气绝缘与电缆,电气绝缘材料,电气技术,电气技术,船舶电气管理,铁道电气化,电机与电气,机电一体化技术、机电设备维修与管理,机电设备运行与维护,航空机电设备维修,航空电子设备维修,电机电器及其控制,电机,电器,微特电机及控制电器,光源与照明,电气工程及其自动化,工程管理,建筑工程管理,建筑经济管理,工程监理,工程造价,工程管理,管理工程,工业管理工程,建筑管理工程,邮电管理工程,物资管理工程,基本建设管理工程,消防工程技术,涉外建筑工程营造与管理,国际工程管理,工业工程,工业工程,工业工程";
	private static String listMajorCanExamStr5 = "航海技术,海洋船舶驾驶,海洋船舶驾驶,轮机工程,轮机管理,轮机管理,轮机工程技术,交通运输,交通运输,铁道运输,交通运输管理工程,载运工具运用工程,汽车运用工程,道路交通管理工程,电气自动化技术,生产过程自动化技术,自动化生产设备应用,自动化,工业自动化,工业自动化,工业电气自动化,生产过程自动化,电力牵引与传动控制,自动化,港口物流设备与自动控制,自动控制,自动控制,交通信号与控制,水下自航器自动控制,飞行器制导与控制,飞行器自动控制,导弹制导,惯性导航与仪表,生物医学工程,生物医学工程,生物医学工程,生物医学工程与仪器,核工程与核技术,核技术,同位素分离,核材料,核电子学与核技术应用,核工程,核反应堆工程,核动力装置,工程力学,工程力学,工程力学,园林,观赏园艺,观赏园艺,园林工程技术,园林技术,园林,园林,风景园林,风景园林,工商管理,工商行政管理,工商行政管理,物业管理,物业设施管理,企业管理,企业管理,国际企业管理,国际企业管理,房地产经营管理,工商管理,投资经济,投资经济管理,技术经济,技术经济,邮电通信管理,林业技术,林业经济管理,林业经济管理" ;
	private static List<MajorCanExam> listMajorCanExam;
	static{
		listMajorCanExam = new ArrayList<MajorCanExam>(){{
		  //两年专业
		  String[] listMajorCanExamStr2Arr = listMajorCanExamStr2.split(",");
          for(String majorCanExamStr2 : listMajorCanExamStr2Arr){
        	  add(new MajorCanExam(majorCanExamStr2,true,YEAR2));
          }
		  //五年专业
          String[] listMajorCanExamStr5Arr = listMajorCanExamStr5.split(",");
          for(String majorCanExamStr5 : listMajorCanExamStr5Arr){
        	  add(new MajorCanExam(majorCanExamStr5,true,YEAR5));
          }
    	}};
	}
    public static void main(String[] args) {
    	if(!ObjectUtils.isEmpty(listMajorCanExam)){
			for(MajorCanExam majorCanExam : listMajorCanExam){
				System.out.println(JSON.toJSONString(majorCanExam));
			}
		}
	}

}
