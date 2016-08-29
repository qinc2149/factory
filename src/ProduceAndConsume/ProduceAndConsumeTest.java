package ProduceAndConsume;
/**
 * @author qinc2149
 * �����ߣ�����������
 * ����wait()��ʹ���̴߳��ڵȴ���(wait blocked pool),ֱ��notify()/notifyAll()��
 * �̱߳����ѱ��ŵ�������(lock blocked pool )���ͷ�ͬ����ʹ�̻߳ص�������״̬��Runnable��
 */
public class ProduceAndConsumeTest {
	public static final int Max_P=4;
	public static final int Min_p=0;
	public int product=0;
	//����
	public synchronized void produce(){
		while(true){
			if(this.product>=Max_P){
				try{
					System.out.println("��Ʒ�������ˣ����Ժ���������");
					wait();
				}catch(Exception e){
					e.printStackTrace();
				}
				//return ;
			}
			this.product++;
			System.out.println("������������" + this.product + "����Ʒ.");
		    notifyAll();   //֪ͨ�ȴ����������߿���ȡ����Ʒ��
		}
		
	}
	//����
	public synchronized void consume(){
		while(true){
			if(this.product<=Min_p){//û����Ʒ���ó�cpuʱ��ص�Blocked״̬
				try{
					System.out.println("��Ʒû�ˣ��������������ˡ�");
					wait();	
				}catch(Exception e){
					e.printStackTrace();
				}
				//return ;
				
			}
			System.out.println("�����������˵�"+product+"����Ʒ");
			this.product--;
			notifyAll(); //֪ͨ�ȴ�������������Ҫ������
		}
	}
	public static void main(String[] args) {
		ProduceAndConsumeTest test= new ProduceAndConsumeTest();
		Produces produces= new Produces(test);
		Consumes consumes= new Consumes(test);
		Thread t1= new Thread(produces);
		Thread t2=new Thread(consumes);
		t1.start();
		t2.start();
	}

}
/*������Ʒ���߳�*/
class Produces implements Runnable{
	private ProduceAndConsumeTest test=null;
	public Produces(ProduceAndConsumeTest test){
		this.test=test;
	}
	public void run() {
		test.produce();
	}
}
/*������Ʒ���߳�*/
class Consumes implements Runnable{
	private ProduceAndConsumeTest test=null;
	public Consumes(ProduceAndConsumeTest test){
		this.test=test;
	}
	@Override
	public void run() {
		test.consume();
		
	}
	
}