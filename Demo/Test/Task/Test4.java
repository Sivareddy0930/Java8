package Demo.Test.Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test4 {
	 static boolean m1(Integer value) {
		return value%2 != 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		List<Integer> al=Arrays.asList(1,7,3,9);
//		Stream.of(al).allMatch(value -> value % 2 !=0 );
		for(int i=0;i<al.size();i++) {
			boolean b= m1(al.get(i));
			if(b) {
				count++;
			}
		}
		if(count==al.size()) {
			System.out.println("all are odds");
		}
		else {
			System.out.println("not all are odds");
		}

	}

}
