package BiPredicate;

import java.util.function.BiPredicate;

public class CreateBiPredicate {

	public static void main(String[] args) {
		
		//If you need to pass two arguments.
		
		BiPredicate<Integer,Integer> bp=(a,b)->(a+b)%2==0;
		
		System.out.println(bp.test(10,20));

	}

}
