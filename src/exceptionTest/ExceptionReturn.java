package exceptionTest;
/**
 * @author Qinc
 * ��ִ�ж�Ӧ��catch��
 * ��һ��ִ��finally�д��룻
 * ��try���쳣֮��Ĵ��벻��ִ�У�
 *
 * ��break/continue/while����������������ʾ��ѭ��������continue��breakʱ��finallyҲ��ִ��
 * ��return����ʹ��try��������ִ����return��finallyҲ��return֮ǰִ����
 * 
 * ��Ϊfinally�������ԣ���������쳣��ʧ������������finally���׳��쳣������finally��ʹ����return������try�����׳����쳣���ᱻϵͳ������
 * 
 * 
 *  ��������ϸ���ܣ�http://www.it165.net/pro/html/201601/59453.html
 */
public class ExceptionReturn {

	 public static void main(String[] args) {
		String wxpayChans[]={"WXPC","WXO","YBS","WXPAY","WXAPP"};
		System.out.println(wxpayChans.clone());
		int x;	
		try{
			x = 1;
			x=x/0;
			System.out.println("����ִ��:"+x);
			
		}catch(ArithmeticException e){
			x=2;
			System.out.println("�����쳣:"+x);
			throw new RuntimeException();
			//e.printStackTrace();
			//return ;
		}finally{
			//x=3;
			//System.out.println("finally���ִ��:"+x);
			//return ;    //return ֮��ϵͳ�ᶪ�����쳣��Ϣ
		}
		System.out.println("�����쳣���뻹������ִ����"+x);
	}

}
/**
 * finally һ���ᱻִ��
 * 
 */
