package factoryMethod;

public class BuyCadeFactory {

	public buyCade produce(String type){
		if(type.equals("stu")){
			return new Student();
		}else if(type.equals("sstu")){
			return new smallStudent();
		}else{
			return null;
		}
	}
	
}
