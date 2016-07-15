package AbstractFactory;

public class Teacher implements BuyBook {

	@Override
	public void getBook() {
		
		System.out.println("teacher buy teacherBook");
	}

}
