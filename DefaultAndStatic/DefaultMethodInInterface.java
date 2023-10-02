package DefaultAndStatic;

interface A{
	
	//without disturbing or effecting implementation class functionality if you want to add a method in interface . In this scenario we use default method. 
	default void m1() {
		System.out.println("This is default method  from interface A");
	}
	default void m2() {
		System.out.println("This is default method  from interface A");
	}
}


public class DefaultMethodInInterface implements A{

	public static void main(String[] args) {
		DefaultMethodInInterface obj=new DefaultMethodInInterface();
		obj.m1();
		obj.m2();

	}

}
