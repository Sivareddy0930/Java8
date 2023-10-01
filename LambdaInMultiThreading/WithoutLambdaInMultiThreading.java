package LambdaInMultiThreading;

import java.util.Iterator;



class MyRunnable implements Runnable{
	
	//Here Runnable is a functional interface and run is abstract method .so, I provided implementation 
	  public void run() {
		  for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	  }
	
}


public class WithoutLambdaInMultiThreading {

	public static void main(String[] args) {//thread 1
		
		MyRunnable r=new MyRunnable();
		
		Thread t=new Thread(r);//thread 2
		
		t.start();
		for (int i = 0; i <10; i++) {
			System.out.println("Main thread");
		}
			

	}

}
