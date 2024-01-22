package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MultipulesOf5 {

	public static void main(String[] args) {
		
	//Reverse List
		List<Integer> list=new ArrayList<>();
		list.add(15);
		list.add(4);
		list.add(50);
		list.add(12);
		list.add(25);
		list.add(8);
		list.add(5);
		
	    List<Integer> newlist= list.stream().filter(n -> n%5==0).collect(Collectors.toList());
	    System.out.println(newlist);
		

	}

}
