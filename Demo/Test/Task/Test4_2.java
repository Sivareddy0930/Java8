 package Demo.Test.Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test4_2 {
	 static boolean m1(Integer value) {
		return value%2 != 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Integer> al=Arrays.asList(1,7,3,9);
		boolean b=al.stream().allMatch(value -> value%2 !=0);
		if(b) {
			System.out.println("all are odds");
		}
		else {
			System.out.println("not all are odds");
		}
	
		
	}

}
