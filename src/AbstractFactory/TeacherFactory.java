package AbstractFactory;

public class TeacherFactory implements FactoryFace {

	@Override
	public BuyBook produce() {
		// TODO Auto-generated method stub
		return new Teacher();
	}

}
