package ProduceAndConsume;
/**
 * @author Qinc
<<<<<<< HEAD
 * ��ʾjoin
 * ûд��,��һ��
 * 
 * 
 * �ڶ����ύ��ʵ��һ�ºϲ���֧�Ĳ���
=======
 * 演示join
 * 没写完,试一下
 * 
 * 
 * 第二次提交，实验一下合并分支的操作
 * 
 * 第三次了啦啦啦啦啦啦
>>>>>>> myTest
 *
 */

public class ThreadJoin {
	public static void main(String[] args) {
		task tk = new task();
		Thread t1= new Thread(tk);
		t1.start();
		//Thread.
<<<<<<< HEAD
		System.out.println(Thread.currentThread()+"���߳���ִ�н�����");
=======
		System.out.println(Thread.currentThread()+"主线程在执行结束！");
>>>>>>> myTest
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
<<<<<<< HEAD
			System.out.println(Thread.currentThread()+"���߳���ִ�У�");
=======
			System.out.println(Thread.currentThread()+"子线程在执行；");
>>>>>>> myTest
		}
		
	}
	
}