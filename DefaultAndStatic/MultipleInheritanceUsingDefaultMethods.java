package DefaultAndStatic;

interface E{
	
	default void m1() {
		System.out.println("This is default method  from interface E");
	}
	
}

interface F{
	
	default void m1() {
		
		System.out.println("This is default method  from interface F");
	}
	
}


public class MultipleInheritanceUsingDefaultMethods implements E,F {
	//without overridden method we get error
	public void m1() {
		
		System.out.println("This is overridden method");
		
		E.super.m1();
		F.super.m1();
		
		
	}
	
	
	public static void main(String[] args) {
		MultipleInheritanceUsingDefaultMethods obj=new MultipleInheritanceUsingDefaultMethods();
		obj.m1();
		
	}

}
