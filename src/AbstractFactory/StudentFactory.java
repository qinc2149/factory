package AbstractFactory;

public class StudentFactory implements FactoryFace {

	@Override
	public BuyBook produce() {
	
		return new Student();
	}

	

}
