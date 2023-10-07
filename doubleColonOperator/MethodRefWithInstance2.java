package doubleColonOperator;

//we are creating user defined functional interface.

interface interf2{
	public void sum();
}
 class MethodRefWithInstance2 {
	
	public  void m1() {
		System.out.println("instance method m1() which is referring interface method ");
	}

	public static void main(String[] args) {
		
		//MethodRefWithInstance2 obj=new MethodRefWithInstance2();
		
			interf2 r = new MethodRefWithInstance2() :: m1;
			
			r.sum();
	}

}
