package DefaultAndStatic;

interface Test1{
	static void m1() {
		System.out.println("This is static method m1 of Interface Test1");
	}
	static void m2() {
		System.out.println("This is static method m2 of Interface Test1");
	}
}
public class StaticMethodInInterface2 {

	public static void main(String[] args) {
		//we can only access using interfaceName.
		Test1.m1();
		Test1.m2();
		

	}

}
