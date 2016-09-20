package T_2016_09_12;

/***
 * @author 	Qinc
 * 大家常说的值传递和引用传递:
 * 	 给方法中传递参数。不管参数类型是引用类型还是普通数据类型，其实传递的都是外部变量或者外部应用的副本，然而对象的引用其实也是栈内存中的一个普通变量
 *  例如我传递的是一个对象引用的副本，我在方法里面改变这个对象，方法结束后栈内存被回收，但是对象在堆内存里面，改变了就是改变了
 *  但是如果我将对象引用的副本重新指向了一个新的对象，是不会对面原来的引用有影响的，
 *  最后总结一下，其实就是方法中的变量都是存在不同的方法栈中的，方法执行结束后，栈内存会被回收，所以，在方法内部做的修改都不能影响外面的，
 *  其实java中传递的都是值，引用也是个值啊，至于改不改变对象是看你方法中怎么写了 例如
 *  	st.name="qeeee";	
 *  	st.age=22;	
 *  -------上面是对引用副本指向的对象的操作
 *  -------下面是引用副本指向了一个新的对象，这个对象和外面的没毛线关系
 *  	st=new Student("qweee",11);
 */
public class TestParas {
	public static void main(String[] args) {
		/*Integer i=new Integer(11111);
		add(i);
		System.out.println(i);*/
		Student st= new Student("qinc",24);
		st.say();
		change(st);
		st.say();
	}
/*	public static void add(Integer i){
		i=i+1;
	}*/
	public static void change(Student st){
//		st.name="qeeee";
//		st.age=22;
		st=new Student("qweee",11);
	}
}
class Student {
	public String name;
	public Integer age;
	public Student(String name,Integer age){
		this.name=name;
		this.age=age;
	}
	public void  say(){
		System.out.println(this.name+"---"+this.age);
	}
}