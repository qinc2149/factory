package AbstractFactory;

public class test {
public static void main(String[] args) {
	FactoryFace factory= new StudentFactory();
	BuyBook stBuy= factory.produce();
	stBuy.getBook();
}
}
