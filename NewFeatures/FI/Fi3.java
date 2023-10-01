package NewFeatures.FI;

import java.util.function.Predicate;

public class Fi3 {

	public static void main(String[] args) {
		Predicate<Integer> i=(a)->(a<100);
		
		System.out.println(i.test(10));
	}

}
