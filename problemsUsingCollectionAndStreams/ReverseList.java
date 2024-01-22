package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseList {

	public static void main(String[] args) {
		
	//Reverse List
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(12);
		list.add(2);
		list.add(8);
		list.add(5);
		
	    List<Integer> reverse= list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
	    System.out.println(reverse);
		
	    List<Integer> reverse1= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    System.out.println(reverse1);

	}

}
