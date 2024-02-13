package Demo.pTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<String> s=new ArrayList<>(Arrays.asList("Mahesh", "Suresh", "Devesh"));
		
		Collections.reverse(s);
		System.out.println(s);
//		s.add(2,"and");
		System.out.println("hi "+s.get(0)+","+s.get(1)+" and "+s.get(2));

	}

}
