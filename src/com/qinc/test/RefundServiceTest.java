//package com.qinc.test;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Random;
//
//import org.apache.log4j.Logger;
//import org.jdom.JDOMException;
//
//import net.sf.json.JSONObject;
//
//import com.ziroom.common.util.NetUtil;
//import com.ziroom.common.util.XMLUtils;
//import com.ziroom.common.util.encryption.MD5Util;
//import com.ziroom.common.util.encryption.SignUtil;
//import com.ziroom.factory.impl.PayProcessorFactory;
//import com.ziroom.factory.impl.RefundProcessorFactory;
//import com.ziroom.factory.interfaces.IPayProcessor;
//import com.ziroom.pay.action.PayAction;
//import com.ziroom.paycommon.api.common.Const.SysConstant;
//import com.ziroom.paycommon.api.common.Const.BasePayConf.YBSPayConf;
//import com.ziroom.paycommon.api.common.exception.PayException;
//import com.ziroom.refund.utils.Config;
//import com.ziroom.refund.utils.XmlUtil;
//
//public class RefundServiceTest {
//	private final static transient Logger log = Logger.getLogger(RefundServiceTest.class);
//	private Map<String,String> paraMap=null;
//	public RefundServiceTest(Map m){
//	  paraMap= new HashMap<String,String>();
//	  this.paraMap.put("appid", Config.appId);
//	  this.paraMap.put("mch_id", Config.mch_id);
//	  Random random = new Random();
//	  String nonce_str=MD5Util.md5(String.valueOf(random.nextInt(10000)), "", "utf-8");
//	  this.paraMap.put("nonce_str", nonce_str);
//	  this.paraMap.put("op_user_id", Config.mch_id);
//	  this.paraMap.put("device_info", (String) m.get("device_info"));
//	  this.paraMap.put("transaction_id", (String) m.get("transaction_id"));
//	  this.paraMap.put("out_trade_no", (String) m.get("out_trade_no"));
//	  this.paraMap.put("out_refund_no",(String) m.get("out_refund_no"));
//	  this.paraMap.put("total_fee", (String) m.get("total_fee"));
//	  this.paraMap.put("refund_fee", (String) m.get("refund_fee"));
//	}
//	public String createSign() {
//		String sign = null;
//		String[] filter={};
//		String qString=SignUtil.createQString(SignUtil.paraFilter(this.paraMap, filter), true, false);
//		this.paraMap.put("sign", MD5Util.md5(qString, "&key="+Config.key, YBSPayConf.YBS_CHARSET).toUpperCase());
//		return sign;
//
//	}
//  public String postData() throws Exception {
//		// post提交
//		String content = XMLUtils.parseXML(this.paraMap);
//
//		log.info("亚博松�?款接口提交信息：\n"+content);
//		InputStream inputStream = new ByteArrayInputStream(
//				content.getBytes("utf-8"));
//		String backResult = NetUtil.getTextContent(
//				NetUtil.sendXmlRequest(Config.gateway, inputStream, "utf-8"),
//				"utf-8");
//		log.info("亚博松�?款接口返回信息：\n"+backResult);
//
//		Map<String, String> resultMap = XMLUtils.ParseXML(backResult);
//		// 通信标识
//		if (!"SUCCESS".equals((String) resultMap.get("return_code"))) {
//			return "fail";
//		} else {
//			// 交易标识
//			if (!"SUCCESS".equals((String) resultMap.get("result_code"))) {
//				log.info("wxrefund fail errcode = " + resultMap.get("err_code") + " err_code_des = " + resultMap.get("err_code_des"));
//				return "fail";
//			} else {
//				return "success";
//			}
//		}
//	}
//  /**�?��查询�?��*/
//  public RefundServiceTest(String implName,Map m){
//	  paraMap= new HashMap<String,String>();
//	  this.paraMap.put("appid", Config.appId);
//	  this.paraMap.put("mch_id", Config.mch_id);
//	  Random random = new Random();
//	  String nonce_str=MD5Util.md5(String.valueOf(random.nextInt(10000)), "", "utf-8");
//	  this.paraMap.put("nonce_str", nonce_str);
//	  this.paraMap.put("device_info", (String) m.get("device_info"));
//	  this.paraMap.put("out_trade_no", (String) m.get("out_trade_no"));
//	}
//  public String postQuery() throws Exception {	
//	  	// post提交
//		String content = XMLUtils.parseXML(this.paraMap);
//		log.info("亚博松�?款查询提交信息：\n"+content);
//		InputStream inputStream = new ByteArrayInputStream(
//				content.getBytes("utf-8"));
//		String backResult = NetUtil.getTextContent(
//				NetUtil.sendXmlRequest(Config.refndqu, inputStream, "utf-8"),
//				"utf-8");
//		log.info("亚博松�?款查询接口返回信息：\n"+backResult);
//		Map<String, String> resultMap = XmlUtil.ParseXML(backResult);
//		// 通信标识
//		if (!"SUCCESS".equals((String) resultMap.get("return_code"))) {
//			log.info("失败原因�?+resultMap.get("return_msg"));
//			return "fail";
//		}else{
//			if (!"SUCCESS".equals((String) resultMap.get("result_code"))) {
//				log.info("�?��申请接收失败:"+resultMap.get("err_code"));
//				return "fail";
//			}else{
//				return resultMap.get("refund_status_0");
//			}
//		}
//	}
//  public void refundState(String state){
//	  if("SUCCESS".equals(state)){
//		  log.info("�?��成功 ");
//	  }else if("FAIL".equals(state)){
//		  log.info("�?��失败");
//	  }else if("PROCESSING".equals(state)){
//		  log.info("�?��处理�?);
//	  }else if("NOTSURE".equals(state)){
//		  log.info("未确定，�?��商户原�?款单号重新发�?");
//	  }else if("CHANGE".equals(state)){
//		  log.info("�?��商户人工干预，�?过线下或者财付�?转账的方式进行�?款�?");
//	  }
//  }
//	/*public static void main(String[] args) throws JDOMException, IOException {
//		
//		String backResult="<xml><appid>wx484d02e10be8f5c9</appid><cash_fee>1</cash_fee><mch_id>1350459001</mch_id><nonce_str>UbViB4R1TtLfZ9d8</nonce_str><out_refund_no_0>wx201672111133391ybs</out_refund_no_0><out_trade_no>WXO146889537280510002253110000</out_trade_no><refund_channel_0>ORIGINAL</refund_channel_0><refund_count>1</refund_count><refund_fee>1</refund_fee><refund_fee_0>1</refund_fee_0><refund_id_0>2004782001201607210335602679</refund_id_0><refund_recv_accout_0>交�?银行储蓄�?436</refund_recv_accout_0><refund_status_0>SUCCESS</refund_status_0><result_code>SUCCESS</result_code><return_code>SUCCESS</return_code><return_msg>OK</return_msg><total_fee>1</total_fee><transaction_id>4004782001201607199288001512</transaction_id><sign>983A0402E593713093DDF43E391C386D</sign></xml>";
//		Map<String, String> resultMap = XMLUtils.ParseXML(backResult);
//		System.out.println(resultMap);
//	}*/
// 
//}
