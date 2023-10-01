package NewFeatures.FI;

import java.util.function.Function;

public class Fi4 {

	public static void main(String[] args) {
		Function<Integer,Integer> f=(a)->(a+10);
		
		System.out.println(f.apply(10));
	}

}
