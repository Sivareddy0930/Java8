package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxAndMinInAList {

	public static void main(String[] args) {
		
	//Reverse List
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(12);
		list.add(3);
		list.add(0);
		list.add(100);
		list.add(8);
		list.add(5);
		
		//min 
	    Optional<Integer> value= list.stream().min(Comparator.naturalOrder());
	    System.out.println(value.get());
	    
	    //max 
	    Optional<Integer> value1 = list.stream().max(Comparator.naturalOrder());
	    System.out.println(value1.get());

	}

}
