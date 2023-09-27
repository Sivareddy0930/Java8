package NewFeatures.FI;

@FunctionalInterface
interface A{
	//public abstract method
	void run();
	//default method
	default void m1() {
		
	}
	//static method
	static void m2() {
		
	}
	
	//Object class methods
	int hashCode();
	String toString();
	boolean equals(Object o);
}

public class Fi implements A {
	
	public void run() {
		System.out.println("Normal Running....");
	}

	public static void main(String[] args) {
		A i=()->{System.out.println("Running....");};
		
		i.run();

	}

}
