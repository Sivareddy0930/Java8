package Function_funtionalInterface;

import java.util.function.Function;

public class Function2 {

	public static void main(String[] args) {
		

		//Find convert String to capital letters
		
		Function<String,String> f=s->s.toUpperCase();
		
		System.out.println(f.apply("Siva"));
		

	}

}
