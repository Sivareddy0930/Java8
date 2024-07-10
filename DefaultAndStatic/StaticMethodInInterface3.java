package DefaultAndStatic;

interface StaticTest{
	static void m1() {
		System.out.println("This is static method m1 of Interface of Test");
	}
	static void m2() {
		System.out.println("This is static method m2 of Interface of Test");
	}
}
public class StaticMethodInInterface3 implements StaticTest {

	public static void main(String[] args) {
		//we can only access using interfaceName.
		
		StaticMethodInInterface3 obj =new StaticMethodInInterface3();
//		obj.m1(); //we cannot access static methods with object.
		Test.m1();
		Test.m2();
//		m1();// we cannot access static method directly as well....		
		

	}
}
