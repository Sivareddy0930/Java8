package Function_funtionalInterface;

import java.util.function.Function;

public class FunctionChaining2 {

	public static void main(String[] args) {
		
			
		Function<Integer,Integer> f1=i->i*2;
	
		Function<Integer,Double> f2=i->(i*i*i)/3.4;

		
		//andThen()
		//first f1 is applied and then f2 is applied. 
		System.out.println(f1.andThen(f2).apply(2));//64
		//because here f1 applied first and return integer  ====>that Integer is taken by f2 and then return double value its fine.
		
		
		
		//Compose()
		//first f2 is applied and then f1 .
//		System.out.println(f1.compose(f2).apply(2));//16
		//but here f2 is executed first and then return double value===>that double value have use by F1. but f1 is expecting Integer but not double type.
		//this is error.
		

	}

}
