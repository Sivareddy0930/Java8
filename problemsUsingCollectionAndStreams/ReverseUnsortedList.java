package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseUnsortedList {

	public static void main(String[] args) {
		
	//sort the list in Reverse order.
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(12);
		list.add(2);
		list.add(8);
		list.add(5);
		
	    
		//reversing by sorting list
	    List<Integer> reverse1= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    System.out.println(reverse1);
	    
	   List<Integer> newList= IntStream.range(0, list.size()).map(i -> list.get(list.size() - 1 - i)).boxed().collect(Collectors.toList());
	   System.out.println(newList);
	   
	   List<Integer> newList1= list.stream()
			   .collect(Collectors
					   .collectingAndThen(Collectors.toList(),
							   result ->{ Collections.reverse(result);
							   return result;
							   }));
	   System.out.println(newList1);

	}

}
