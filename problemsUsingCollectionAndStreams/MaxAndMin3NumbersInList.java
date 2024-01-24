package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MaxAndMin3NumbersInList {

	public static void main(String[] args) {
		
	//Max And Min In A List
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(12);
		list.add(3);
		list.add(400);
		list.add(10000);
		list.add(0);
		list.add(100);
		list.add(8);
		list.add(5);
		
		
	    Optional<Integer> Max=list.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
	    System.out.println(Max.get());
	    
	    Optional<Integer> Min=list.stream().collect(Collectors.minBy(Comparator.naturalOrder()));
	    System.out.println(Min.get());
	    
	    //							(OR)
	    
	    Optional<Integer> Max1=list.stream().max(Comparator.naturalOrder());
	    System.out.println(Max1.get());
	    
	    Optional<Integer> Min1=list.stream().min(Comparator.naturalOrder());
	    System.out.println(Min1.get()); 
	    
	    //                       (OR)
	    
	    OptionalInt Max2=list.stream().mapToInt(Integer::intValue).max();
	    System.out.println(Max2.getAsInt());
	    
	    OptionalInt Min2=list.stream().mapToInt(Integer::intValue).min();
	    System.out.println(Min2.getAsInt()); 

	}

}
