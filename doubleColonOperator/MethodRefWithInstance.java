package doubleColonOperator;

//we are creating user defined functional interface.

interface interf1{
	public void sum();
}
 class MethodRefWithInstance {
	
	public void m1() {
		System.out.println("instance method m1() which is referring interface method ");
	}

	public static void main(String[] args) {
		
		MethodRefWithInstance obj=new MethodRefWithInstance();
		
			interf1 r = obj :: m1;
			
			r.sum();
	}

}
