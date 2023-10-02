package DefaultAndStatic;

interface D{
	
	default void m1() {
		System.out.println("This is default method  from interface D");
	}
	
	
	//A default method cannot override a method from java.lang.Object 
	
	
//	default int hashCode() {
//		return 10;
//	}
}


public class OverridingObjectClassMethodsInInterface implements D {
	//Because all Object class method are available for all class.so no need to override in interface and use here for every class.
	public static void main(String[] args) {
		OverridingObjectClassMethodsInInterface obj=new OverridingObjectClassMethodsInInterface();
		obj.m1();
		
	}

}
