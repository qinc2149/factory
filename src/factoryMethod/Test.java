package factoryMethod;

public class Test {

	public static void main(String[] args) {
		BuyCadeFactory factory = new BuyCadeFactory();  
		buyCade b1= factory.produce("stu");
		buyCade b2=factory.produce("sstu");
		b1.buyCd();
		b2.buyCd();
	}
}
