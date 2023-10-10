package LambdaInMultiThreading;

import java.util.Iterator;



public class WithLambdaInMultiThreading {

	public static void main(String[] args) {//this is thread 1 

		
		Runnable r=()->{
			for (int i = 0; i <10; i++) {
			System.out.println("Child thread  -C");
		}};		
		Thread t=new Thread(r);//thread 2
		
		t.start();
		for (int i = 0; i <10; i++) {
			System.out.println("Main thread -M");
		}
			

	}

}
