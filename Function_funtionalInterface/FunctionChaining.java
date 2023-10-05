package Function_funtionalInterface;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		
			
		Function<Integer,Integer> f1=i->i*2;
		Function<Integer,Integer> f2=i->i*i*i;

		
		//andThen()
		//first f1 is applied and then f2 is applied. 
		System.out.println(f1.andThen(f2).apply(2));//64
		
		
		//Compose()
		//first f2 is applied and then f1 .
		System.out.println(f1.compose(f2).apply(2));//16
		

	}

}
