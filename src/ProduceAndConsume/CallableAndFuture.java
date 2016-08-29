package ProduceAndConsume;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Qinc
 * cancel��������ȡ���������ȡ������ɹ��򷵻�true�����ȡ������ʧ���򷵻�false������mayInterruptIfRunning��ʾ�Ƿ�����ȡ������ִ��ȴû��ִ����ϵ������������true�����ʾ����ȡ������ִ�й����е�������������Ѿ���ɣ�������mayInterruptIfRunningΪtrue����false���˷����϶�����false�������ȡ���Ѿ���ɵ�����᷵��false�������������ִ�У���mayInterruptIfRunning����Ϊtrue���򷵻�true����mayInterruptIfRunning����Ϊfalse���򷵻�false���������û��ִ�У�������mayInterruptIfRunningΪtrue����false���϶�����true��
 * isCancelled������ʾ�����Ƿ�ȡ���ɹ�������������������ǰ��ȡ���ɹ����򷵻� true��
 * isDone������ʾ�����Ƿ��Ѿ���ɣ���������ɣ��򷵻�true��  
 * get()����������ȡִ�н������������������������һֱ�ȵ�����ִ����ϲŷ��أ�
 * get(long timeout, TimeUnit unit)������ȡִ�н���������ָ��ʱ���ڣ���û��ȡ���������ֱ�ӷ���null��
 */
public class CallableAndFuture {
	public static void main(String[] args) {
		myCallable task1= new myCallable(0);
		myCallable task2= new myCallable(1);
		myCallable task3= new myCallable(2);
		ExecutorService es = Executors.newFixedThreadPool(3);
		Future future=es.submit(task1);
		Future future2=es.submit(task2);
		Future future3=es.submit(task3);
		try {
			String str=(String) future.get();
			System.out.println(str);
			System.out.println("�����Ƿ��Ѿ����:"+future.isDone());
			
			future2.cancel(true);
			
			System.out.println("�����Ƿ��Ѿ���ȡ���ˣ�"+future2.isCancelled());
			
			future3.get();
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("task3�׳��쳣��");
			  
		}
		 es.shutdownNow();
		
	}
	  
}

/*������
 * Callable�ӿ���concurrent�������һ���ӿں�Runnable�ӿ����ƣ�ʵ��Callable�ӿڵ����ʵ��Runnable���඼�ǿɱ������߳�ִ�е�����
 * �����ǣ�
 * 	��Callable�ӿ��е�call�����з���ֵ��Runnable�ӿڵ�run������û�з���ֵ��
 * 	��call���������׳��쳣��run�����ǲ������׳��쳣��	
 * 	����ô��ôʹ��Callable�أ�һ������������ExecutorService��ʹ�õ�	
 * */
class myCallable implements Callable{
	private int flag;
	public myCallable(int flag){
		this.flag=flag;
	}
	@Override
	public String call() throws Exception {
		if(flag==0){
			return "call���������з���ֵ";
		}else if(flag==1){
			while(true){
				Thread.sleep(2000);
				System.out.println("looping");
				
			}
		}else{
			throw new Exception("call�����������׳��쳣");
		}
	}
	
}