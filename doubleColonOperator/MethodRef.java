package doubleColonOperator;

//method reference is used to refer the method of  functional interface.
//it is easy form or alternative form of LAMBDA expression.

//REference of static method ====> ClassNAme::MethodName;
//Reference of Instance Method ===> object of Corresponding class :: methodName;
//Reference of a constructor  ===>ClassNAme::new;


//Arguments are must be same in both interface method and provided method(method we are referring).
//no need to check about rest of things like AccesModifier and return type and name of method.

//example:
//public void run();   ==>available  in Runnable interface.
//public static void m1()   ==>normal method that we are referring.

public class MethodRef {
	
	public static void m1() {
		System.out.println("m1() method ");
	}

	public static void main(String[] args) {
		
			Runnable r = MethodRef :: m1;
			Thread t=new Thread(r);
			t.start();
	}

}
