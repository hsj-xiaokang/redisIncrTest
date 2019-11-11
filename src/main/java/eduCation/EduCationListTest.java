package eduCation;

import java.util.List;

import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSON;

/**
 * 
 *  说明：学历（全部）
 *  数据来源：http://member.jianshe99.com/zhuanti/onlineSearch/getOnlineInit.shtm?jsonpCallback=success_jsonpCallback&searchType=3&_=1572515405147
 *  @author:heshengjin qq:2356899074
 *  @date 2019年11月1日 上午9:41:48
 */
public class EduCationListTest {
	
   private final static String eduCationList = "{\'EduCationList\':[{\'optionName\':\'中专\',\'idx\':26,\'type\':3},{\'optionName\':\'大学专科\',\'idx\':27,\'type\':3},{\'optionName\':\'大学本科\',\'idx\':28,\'type\':3},{\'optionName\':\'双学士学位\',\'idx\':29,\'type\':3},{\'optionName\':\'研究生班毕业\',\'idx\':30,\'type\':3},{\'optionName\':\'硕士学位\',\'idx\':31,\'type\':3},{\'optionName\':\'博士学位\',\'idx\':32,\'type\':3}]}";
   
   public static void main(String[] args) {
	   
	   EduCationList eduCationList = JSON.parseObject(EduCationListTest.eduCationList, EduCationList.class);
	   List<EduCation> list = eduCationList.getEduCationList();
	   if(!ObjectUtils.isEmpty(list)){
			for(EduCation education : list){
				System.out.println(JSON.toJSONString(education));
			}
		}
   }

}
