package factoryMethod;

import java.io.UnsupportedEncodingException;

public class testUtf8 {
	public static void main(String[] args){
		String str="\u003cscript language\u003d\"javascript\"\u003ewindow.onload\u003dfunction(){document.pay_form.submit();}\u003c/script\u003e\n\u003cform id\u003d\"pay_form\" name\u003d\"pay_form\" action\u003d\"https://b.alipay.com/order/pidAndKey.htm\" method\u003d\"get\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"orderCode\" id\u003d\"orderCode\" value\u003d\"60003146674977732210005247\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"subject\" id\u003d\"subject\" value\u003d\"×ÔÈçÍøÖ§¸¶\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"sign_type\" id\u003d\"sign_type\" value\u003d\"MD5\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"cityCode\" id\u003d\"cityCode\" value\u003d\"110000\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"out_trade_no\" id\u003d\"out_trade_no\" value\u003d\"ALW146674977908510005248110000\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"total_fee\" id\u003d\"total_fee\" value\u003d\"1\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"partner\" id\u003d\"partner\" value\u003d\"2088121077631747\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"tradeAmount\" id\u003d\"tradeAmount\" value\u003d\"1\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"payAmount\" id\u003d\"payAmount\" value\u003d\"100\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"tradeNo\" id\u003d\"tradeNo\" value\u003d\"ALW146674977908510005248110000\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"tradeDesc\" id\u003d\"tradeDesc\" value\u003d\"GJK00100100110000402\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"notify_url\" id\u003d\"notify_url\" value\u003d\"http://127.0.0.1:8080/ZRPay/pay/33/110000/payNotify.do\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"domainName\" id\u003d\"domainName\" value\u003d\"http://127.0.0.1:8080/ZRPay/pay/33/110000/paySubmit.do\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"orderTime\" id\u003d\"orderTime\" value\u003d\"20160624142939\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"payChannel\" id\u003d\"payChannel\" value\u003d\"ALW\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"ip\" id\u003d\"ip\" value\u003d\"127.0.0.1\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"return_url\" id\u003d\"return_url\" value\u003d\"http://127.0.0.1:8080/ZRPay/pay/33/110000/payReturn.do\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"sign\" id\u003d\"sign\" value\u003d\"0f77b802db9a663810ead32fe7c9a3a7\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"_input_charset\" id\u003d\"_input_charset\" value\u003d\"utf-8\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"service\" id\u003d\"service\" value\u003d\"alipay.wap.create.direct.pay.by.user\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"seller_id\" id\u003d\"seller_id\" value\u003d\"2088121077631747\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"tradeValidTime\" id\u003d\"tradeValidTime\" value\u003d\"86398\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"payment_type\" id\u003d\"payment_type\" value\u003d\"1\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"show_url\" id\u003d\"show_url\" value\u003d\"\"\u003e\n\u003cinput type\u003d\"hidden\" name\u003d\"openId\" id\u003d\"openId\" value\u003d\"null\"\u003e\n\u003c/form\u003e\n";
		
			System.out.println(sunescapeUnicode(str));
	

	}

	private static char[] sunescapeUnicode(String str) {
		// TODO Auto-generated method stub
		return null;
	}
}
