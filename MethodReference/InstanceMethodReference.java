package MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class PrimeOrNot {
	
	public String CheckPrimeOrNot(int a) {
		if(a==0 || a==1) {
			return "Not a prime Number";
		}
		else {
			int count=0;
			for (int i = 2; i <= a; i++) {
				if(a%i==0) {
					count++;
				}			
		}
			if (count==1) {
				return "prime";
			}
			else {
				return "Not a prime Number";
			}		
		}
			
	}
	
}

public class InstanceMethodReference {

	public static void main(String[] args) {
		
		PrimeOrNot obj=new PrimeOrNot();
		
		//instance methods reference
		
		System.out.println("using lambda expression:-");
		Function<Integer,String> f1 = i->obj.CheckPrimeOrNot(i);
		System.out.println(f1.apply(4));
		
		System.out.println("using method references:-");
		Function<Integer,String> f2 = obj::CheckPrimeOrNot;
		System.out.println(f2.apply(5));
				

	}

}
