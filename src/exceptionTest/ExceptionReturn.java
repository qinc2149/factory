package exceptionTest;
/**
 * @author Qinc
 * ①执行对应的catch；
 * ②一定执行finally中代码；
 * ③try出异常之后的代码不再执行；
 *
 * ①break/continue/while：如下面例子中所示在循环中遇到continue或break时，finally也会执行
 * ②return：即使在try块中正常执行了return，finally也在return之前执行了
 * 
 * 因为finally的特殊性，还会造成异常丢失的情况，如果在finally中抛出异常或者在finally中使用了return，则在try块中抛出的异常将会被系统丢掉。
 * 
 * 
 *  链接有详细介绍：http://www.it165.net/pro/html/201601/59453.html
 */
public class ExceptionReturn {

	 public static void main(String[] args) {
		String wxpayChans[]={"WXPC","WXO","YBS","WXPAY","WXAPP"};
		System.out.println(wxpayChans.clone());
		int x;	
		try{
			x = 1;
			x=x/0;
			System.out.println("正常执行:"+x);
			
		}catch(ArithmeticException e){
			x=2;
			System.out.println("出现异常:"+x);
			throw new RuntimeException();
			//e.printStackTrace();
			//return ;
		}finally{
			//x=3;
			//System.out.println("finally最后执行:"+x);
			//return ;    //return 之后系统会丢弃到异常信息
		}
		System.out.println("出现异常代码还会往下执行吗？"+x);
	}

}
/**
 * finally 一定会被执行
 * 
 */
