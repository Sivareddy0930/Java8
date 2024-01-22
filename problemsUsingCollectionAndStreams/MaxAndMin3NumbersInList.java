package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxAndMin3NumbersInList {

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
		
		//min 3
	    list.stream().sorted().limit(3).forEach(System.out::println);
	    
	    //max 3
	    list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

	}

}
