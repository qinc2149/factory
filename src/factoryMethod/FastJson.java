package factoryMethod;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class FastJson {
	public static void main(String[] args) {
		
		String result="{total:869379,rows:[{id:3,isDel:null,createTime:null,createId:null,lastModifyTime:null,lastModifyId:null,tradeNo:2114503227856056110000,bizCode:10022886,updateTime:2015-12-17 11:27:34.0,amount:100000,channel:21,cityCode:110000,systemId:80002,state:9}";
		
		JSONObject json= JSON.parseObject(result);
		System.out.println(json.values());
	}
}
