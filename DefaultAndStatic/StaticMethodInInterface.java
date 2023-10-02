package DefaultAndStatic;

interface Test{
	static void m1() {
		System.out.println("This is static method m1 of Interface of Test");
	}
	static void m2() {
		System.out.println("This is static method m2 of Interface of Test");
	}
}
public class StaticMethodInInterface implements Test {

	public static void main(String[] args) {
		//we can only access using interfaceName.
		Test.m1();
		Test.m2();
		

	}

}
