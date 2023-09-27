package NewFeatures.Lambda;

interface A{
	void test();
}
public class WithoutLambda implements A {

	public void test() {
		System.out.println("This is test() method");
	}
	
	public static void main(String[] args) {
		
		A obj= new WithoutLambda();
		
		obj.test();
		
		

	}

}
