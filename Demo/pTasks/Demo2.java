package Demo.pTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo2 {
	
	public static void rangeOfNumbers(int a,int b) {
		for(int j=a;j<=b;j++) {
			
			if(isPrime(j)) {
				System.out.println(j+"Prime Number");
				}
				
			}
		}
	

	public static boolean isPrime(int value) {
		
		int count=0;
		if(value<=1) {
			return false;
		}
		for(int i=2;i<=value;i++) {
			if(value%i==0) {
				count++;
			}
			
		}
		if(count==1) {
			return true;
		}
		else {
			return false;
		}
			
	}
	


	public static void main(String[] args) {
		rangeOfNumbers(1, 10);

	}

}
