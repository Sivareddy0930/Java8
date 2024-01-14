package Function_funtionalInterface;

import java.util.function.Function;

public class Function_practice {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		Function<Integer, Integer> f = n->n+2;
		
		for(Integer i:a) {
			System.out.println(f.apply(i));
		}
	}
	
}
