
package Function_funtionalInterface;

import java.util.function.Function;

public class CreateFunction {

	
	public static void main(String[] args) { 
		
		//if your requirement is take some data  and return some data.then we need to use Function.
		//it consist of apply(T)
		
		//Find length of the String.
		
		Function<String,Integer> f=s->s.length();
		
		System.out.println(f.apply("Siva"));
		

	}

}
