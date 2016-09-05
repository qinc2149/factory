package ProduceAndConsume;
/**
 * @author Qinc
<<<<<<< HEAD
 * ÑÝÊ¾join
 * Ã»Ð´Íê,ÊÔÒ»ÏÂ
 * 
 * 
 * µÚ¶þ´ÎÌá½»£¬ÊµÑéÒ»ÏÂºÏ²¢·ÖÖ§µÄ²Ù×÷
=======
 * æ¼”ç¤ºjoin
 * æ²¡å†™å®Œ,è¯•ä¸€ä¸‹
 * 
 * 
 * ç¬¬äºŒæ¬¡æäº¤ï¼Œå®žéªŒä¸€ä¸‹åˆå¹¶åˆ†æ”¯çš„æ“ä½œ
 * 
 * ç¬¬ä¸‰æ¬¡äº†å•¦å•¦å•¦å•¦å•¦å•¦
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
		System.out.println(Thread.currentThread()+"Ö÷Ïß³ÌÔÚÖ´ÐÐ½áÊø£¡");
=======
		System.out.println(Thread.currentThread()+"ä¸»çº¿ç¨‹åœ¨æ‰§è¡Œç»“æŸï¼");
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
			System.out.println(Thread.currentThread()+"×ÓÏß³ÌÔÚÖ´ÐÐ£»");
=======
			System.out.println(Thread.currentThread()+"å­çº¿ç¨‹åœ¨æ‰§è¡Œï¼›");
>>>>>>> myTest
		}
		
	}
	
}