package Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class CreateSupplier {

	
	//it always give some output.it don't take any input.
	//it has only one method get().
	//Supplier chaining is not possible.
	public static void main(String[] args) {
		
		Supplier<Date> s=()->new Date();
		
		System.out.println(s.get());

	}

}
