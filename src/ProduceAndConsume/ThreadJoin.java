package ProduceAndConsume;
/**
 * @author Qinc
 * ��ʾjoin
 * ûд��,��һ��
 * 
 * 
 * �ڶ����ύ��ʵ��һ�ºϲ���֧�Ĳ���
 *
 */

public class ThreadJoin {
	public static void main(String[] args) {
		task tk = new task();
		Thread t1= new Thread(tk);
		t1.start();
		//Thread.
		System.out.println(Thread.currentThread()+"���߳���ִ�н�����");
	}	
}
class task implements Runnable{

	public void run() {
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()+"���߳���ִ�У�");
		}
		
	}
	
}