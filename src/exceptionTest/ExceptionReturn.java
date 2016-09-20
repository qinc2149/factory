package exceptionTest;
/**
 * @author Qinc
 */
public class ExceptionReturn {

	 public static void main(String[] args) {
		int x;	
		try{
			x = 1;
			x=x/0;
			System.out.println("抛异常了:"+x);
			return ;
		}catch(ArithmeticException e){
			x=2;
			System.out.println("@@@@@@@:"+x);
			throw new RuntimeException();
			//e.printStackTrace();
			//return ;
		}finally{
			System.out.println("1111");
			//x=3;
			//System.out.println("finally���ִ��:"+x);
			//return ;  
		}
		//System.out.println("@@@@@@"+x);
	}

}

