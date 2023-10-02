package DefaultAndStatic;

interface B{
	
	//without disturbing or effecting implementation class functionality if you want to add a method in interface . In this scenario we use default method. 
	default void m1() {
		System.out.println("This is default method  from interface B");
	}
}


public class DefaultMethodInInterface2 implements B {
	//default methods are not allowed in class.
//	default void m1() {
//		System.out.println("This is default method");
//	}
//	default void m2() {
//		System.out.println("This is default method");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
