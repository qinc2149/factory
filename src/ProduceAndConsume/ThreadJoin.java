package ProduceAndConsume;
/**
 * @author Qinc
 * 演示join
 * 没写完,试一下
 * 
 * 
 * 第二次提交，实验一下合并分支的操作
 *
 */

public class ThreadJoin {
	public static void main(String[] args) {
		task tk = new task();
		Thread t1= new Thread(tk);
		t1.start();
		//Thread.
		System.out.println(Thread.currentThread()+"主线程在执行结束！");
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
			System.out.println(Thread.currentThread()+"子线程在执行；");
		}
		
	}
	
}