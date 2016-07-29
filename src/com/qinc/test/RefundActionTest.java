//package com.qinc.test;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.log4j.Logger;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.ziroom.refund.service.RefundServiceTest;
//@Controller
//@RequestMapping("/refund")
//public class RefundActionTest {
//	private final static transient Logger log = Logger.getLogger(RefundServiceTest.class);
//	@RequestMapping("/toRefund.do")
//	public String toRefund(){
//		return "payView/index";
//	}
//	@ResponseBody
//	@RequestMapping("/refundSubmit.do")
//	public String refundSubmit(HttpServletRequest request){
//		System.out.println("--------------");
//		Map<String, String> map= new HashMap<String,String>();
//		map.put("device_info", request.getParameter("device_info"));
//		map.put("transaction_id", request.getParameter("transaction_id"));
//		map.put("out_trade_no", request.getParameter("out_trade_no"));
//		map.put("out_refund_no",request.getParameter("out_refund_no"));//å•†æˆ·é€?¬¾å•å· ç”±ä¸šåŠ¡ç³»ç»Ÿæä¾?
//		map.put("total_fee",  request.getParameter("total_fee"));//æ€»é‡‘é¢?
//		map.put("refund_fee",  request.getParameter("refund_fee"));//é€?¬¾é‡‘é¢
//		RefundServiceTest refundService = new RefundServiceTest(map);
//		String sign=refundService.createSign();
//		String post=null;
//		try {
//			 post=refundService.postData();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(post);
//		return post;
//	}
//	@ResponseBody
//	@RequestMapping("/refundQuery.do")
//	public String refundQuery(HttpServletRequest request){
//		log.info("refundQuery start......");
//		Map<String, String> map= new HashMap<String,String>();
//		map.put("out_trade_no", request.getParameter("out_trade_no"));
//		map.put("device_info", request.getParameter("device_info"));
//		RefundServiceTest refundService = new RefundServiceTest("refundQuery",map);
//		String sign=refundService.createSign();
//		String post=null;
//		try {
//			 post=refundService.postQuery();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		refundService.refundState(post);
//		return post;
//	}
//}
