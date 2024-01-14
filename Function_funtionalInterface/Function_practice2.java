package Function_funtionalInterface;

import java.util.function.Function;

public class Function_practice2 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		
		Function<Integer, Integer> f1 = n->n+2;
		Function<Integer, Integer> f2= n->n*2;
		
		//function chaining or joining.
		
		//andThen()
		for (int i : a) {
			System.out.println(f1.andThen(f2).apply(i));// f1 is applied first and then f2 is appied to specific value
		}
		System.out.println("---------------------------------------------");
		
		//compse()
		for (int i : a) {
			System.out.println(f1.compose(f2).apply(i));//f2 is applied first and then f1 is appied to specific value
		}
		
		
		
	}
	
}
