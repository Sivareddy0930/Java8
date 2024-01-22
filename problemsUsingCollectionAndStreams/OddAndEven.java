package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddAndEven {

	public static void main(String[] args) {
		
	//separate Odd and Even Numbers.
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(12);
		list.add(2);
		list.add(8);
		list.add(5);
		
	    Map<Boolean,List<Integer>> separate= list.stream().collect(Collectors.partitioningBy(n->n%2==0));
	    System.out.println(separate);
		

	}

}
