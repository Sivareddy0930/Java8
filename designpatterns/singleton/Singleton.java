package designpatterns.singleton;




public class Singleton {
	//Eager Initialization
	// In tis approach , the singleton instance is created at the time of class loading.
	
	//Eagerly create an instance of the Singleton class.
	private static final Singleton instanceObj = new Singleton();
	
	// Private constructor to prevent instantiation from other classes.
	private Singleton() {
		
	}
	
	
	//Public method to provide access to the instance
	public static Singleton getInstance() {
		return instanceObj;
	}
	
	

}
