//package com.qinc.test;
//
//import java.io.IOException;
//import java.nio.file.FileSystems;
//import java.nio.file.Path;
//import java.util.HashMap;
//import java.util.Map;
//
//import com.google.zxing.BarcodeFormat;
//import com.google.zxing.EncodeHintType;
//import com.google.zxing.MultiFormatWriter;
//import com.google.zxing.WriterException;
//import com.google.zxing.client.j2se.MatrixToImageConfig;
//import com.google.zxing.client.j2se.MatrixToImageWriter;
//import com.google.zxing.common.BitMatrix;
///***
// * @author PC
// * 鐢熸垚浜岀淮鐮乼est
// */
//public class qrTest {
//	 private Integer onColor = 0xFF00cc00;  //鍓嶆櫙锟� jjj
//	  private Integer offColor = 0xFFFFFFFF; //鑳屾櫙锟� 
//	public void testEncode() throws WriterException, IOException { 
//		
//        String filePath = "D://";  
//        String fileName = "zxing.png";  
//        int width = 200; // 鍥惧儚瀹藉害  
//        int height = 200; // 鍥惧儚楂樺害  
//        String format = "png";// 鍥惧儚绫诲瀷  
//        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();  
//        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
//        MatrixToImageConfig config = new MatrixToImageConfig(onColor, offColor);  
//        BitMatrix bitMatrix = new MultiFormatWriter().encode("浣犲ソ",  
//                BarcodeFormat.QR_CODE, width, height, hints);// 鐢熸垚鐭╅樀  
//        Path path = FileSystems.getDefault().getPath(filePath, fileName);  
//        MatrixToImageWriter.writeToPath(bitMatrix, format, path,config);// 杈撳嚭鍥惧儚  
//        System.out.println("杈撳嚭鎴愬姛.");  
//    } 
//	public static void main(String args[]){
//		qrTest t= new qrTest();
//		try {
//			t.testEncode();
//		} catch (WriterException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}
//
