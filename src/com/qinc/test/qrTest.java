package com.qinc.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
/***
 * @author PC
 * 生成二维码test
 */
public class qrTest {
	 private Integer onColor = 0xFF00cc00;  //前景�? 
	  private Integer offColor = 0xFFFFFFFF; //背景�? 
	public void testEncode() throws WriterException, IOException { 
		
        String filePath = "D://";  
        String fileName = "zxing.png";  
        int width = 200; // 图像宽度  
        int height = 200; // 图像高度  
        String format = "png";// 图像类型  
        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();  
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        MatrixToImageConfig config = new MatrixToImageConfig(onColor, offColor);  
        BitMatrix bitMatrix = new MultiFormatWriter().encode("你好",  
                BarcodeFormat.QR_CODE, width, height, hints);// 生成矩阵  
        Path path = FileSystems.getDefault().getPath(filePath, fileName);  
        MatrixToImageWriter.writeToPath(bitMatrix, format, path,config);// 输出图像  
        System.out.println("输出成功.");  
    } 
	public static void main(String args[]){
		qrTest t= new qrTest();
		try {
			t.testEncode();
		} catch (WriterException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

