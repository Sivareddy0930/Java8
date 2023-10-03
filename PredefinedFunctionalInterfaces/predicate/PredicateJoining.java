package PredefinedFunctionalInterfaces.predicate;

import java.util.function.Predicate;
import java.util.*;



public class PredicateJoining {

	public static void main(String[] args) {
		// print only even numbers from array.
		
		int[] arr= {4,8,16,3,5,6,0,19,4,5000,69,16,97,48};
		
		Predicate<Integer> p1=a->a%2==0;
	
		for(Integer i:arr) {
			if(p1.test(i)){
				System.out.println(i);
			}
		}
		//-----------------------------------------------------------------------------------
		// print only  numbers >10 from array.
		System.out.println("----------------------------------------------------------------------------------");
		Predicate<Integer> p2=n->n>10;
		
		for(Integer i:arr) {
			if(p2.test(i)){
				System.out.println(i);
			}
		}
		
		//-------------------------------------------------------------------------------
		System.out.println("------------------------------------------------------------------------------------");
		//print values that is Even and >10 from array.
		
		for(Integer i:arr) {
			if(p1.and(p2).test(i)){
				//if both predicate  satisfy then it will return true.
				//it will check p1 first and then p2.
				System.out.println(i);
			}
		}
		
		//---------------------------------------------------------------
		
		System.out.println("------------------------------------------------------------------------------------");
		//print values that is Even or >10 from array.
		//it will return true if one condition is true from both.
		for(Integer i:arr) {
			if(p1.or(p2).test(i)){
			
				System.out.println(i);
			}
		}
		//----------------------------------------------------------------------------------
		System.out.println("------------------------------------------------------------------------------------");
		//print only odd numbers from array.
		//negate() it will reverse the output.
		
		for(Integer i:arr) {
			if(p1.negate().test(i)){
				//p1 condition is used to check even number or not .but due to negate() it print odd values
				System.out.println(i);
			}
		}
		
		//----------------------------------------------------------------------------------
				System.out.println("------------------------------------------------------------------------------------");
				//print only duplicate elements.(elements available more than one time)
				//isEqual() 
				
				for(Integer i:arr) {
					if(p1.negate().test(i)){
						//p1 condition is used to check even number or not .but due to negate() it print odd values
						System.out.println(i);
					}
				}

		
			
	}

}
