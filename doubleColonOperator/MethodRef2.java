package doubleColonOperator;

//we are creating user defined functional interface.

interface interf{
	public void sum();
}
 class MethodRef2 {
	
	public static void m1() {
		System.out.println("m1() method which is referring interface method ");
	}

	public static void main(String[] args) {
		
			interf r = MethodRef2 :: m1;
			
			r.sum();
	}

}
