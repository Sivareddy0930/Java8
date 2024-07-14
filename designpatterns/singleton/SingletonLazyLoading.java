package designpatterns.singleton;




public class SingletonLazyLoading {
	//Lazy Initialization
	// In tis approach , the singleton instance is created only when it is requested for the first time.
	
	//Declare a static instance, but don't initialize it yet.
	private static  SingletonLazyLoading instanceObj;
	
	// Private constructor to prevent instantiation from other classes.
	private SingletonLazyLoading() {
		
	}
	
	
	//Public method to provide access to the instance
	public static SingletonLazyLoading getInstance() {
		if(instanceObj == null) {
			return new SingletonLazyLoading();
		}
		return instanceObj;
	}
	
	

}
