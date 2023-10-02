package DefaultAndStatic;

interface C{
	
	default void m1() {
		System.out.println("This is default method  from interface C");
	}
}


public class OverridingInterfaceDefaultMethodInClass implements C {
	//Overriding Interface Default Method In Class.
	
	public void m1() {
		System.out.println("Overriding Interface Default Method In Class");
	}
	

	public static void main(String[] args) {
		OverridingInterfaceDefaultMethodInClass obj=new OverridingInterfaceDefaultMethodInClass();
		obj.m1();
		
	}

}
