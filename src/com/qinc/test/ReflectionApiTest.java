package com.qinc.test;

import java.lang.reflect.Constructor;
/**java����API
 * @author PC
 * ����֪��ɶԭ�򡣡�������
 */
public class ReflectionApiTest {
	public static void main(String[] args) {
			try {
				Class<?> cls = Class.forName("src.com.qinc.test.Student");
				Constructor<?> cons = cls.getConstructor(Integer.class,String.class);
				Student student = (Student) cons.newInstance(24,"qinc");
				System.out.println(student.getName());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
	}
}
