package NewFeatures.Lambda;

interface Bb{
	void test();
}
public class WithLambda  {

//	public void test() {
//		System.out.println("This is test() method");
//	}
//	
	 static Bb i=()->{System.out.println("This is Lambda method");};
	
	public static void main(String[] args) {

//		Bb i=()->{System.out.println("This is Lambda method");};
		
		i.test();
		
		

	}

}
