//package com.qinc.test;
//
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStreamWriter;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.util.Map;
//
//
//public class HttpUtil {
//	public static String postJson(String strURL, String params) {
//		try {
//			URL url = new URL(strURL);// 创建连接
//			HttpURLConnection connection = (HttpURLConnection) url
//					.openConnection();
//			connection.setDoOutput(true);
//			connection.setDoInput(true);
//			connection.setUseCaches(false);
//			connection.setInstanceFollowRedirects(true);
//			connection.setRequestMethod("POST"); // 设置请求方式
//			connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
//			connection.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式
//			connection.setRequestProperty("Accept-Encoding", "identity");
//			connection.connect();
//			OutputStreamWriter out = new OutputStreamWriter(
//					connection.getOutputStream(), "UTF-8"); // utf-8编码
//			out.append(params);
//			out.flush();
//			out.close();
//			// 读取响应
//			InputStream is = connection.getInputStream();
//			return convertStreamToString(is);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return ""; // 自定义错误信息
//	}
//
//}
