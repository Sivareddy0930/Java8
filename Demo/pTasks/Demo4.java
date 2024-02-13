package Demo.pTasks;

import java.util.Arrays;
import java.util.Iterator;

public class Demo4 {

	public static void main(String[] args) {
		
		int m=4;
		
		if(m <=12 && m>=1) {
			if(m==2 || m==3) {
				System.out.println("Vasanta");
			}
			else if(m==4 || m==5){
				System.out.println("Grishma / Summer");
			}
			else if(m==6 || m==7){
				System.out.println("Monsoon / Rainy");
			}
			else if(m==8 || m==9){
				System.out.println("Sharada");
			}
			else if(m==10 || m==11){
				System.out.println("Hemanta");
			}
			else if(m==12 || m==1){
				System.out.println("Shishira / Winter");
			}
		}
		else {
			System.out.println("please enter correct month!");
		}

	}

}
