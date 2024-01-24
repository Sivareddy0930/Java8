package problemsUsingCollectionAndStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStringsBasedonLength {

	public static void main(String[] args) {
		
	//SortListOfStringsBasedonLength
		List<String> list=new ArrayList<>();
		list.add("okay");
		list.add("I");
		list.add("am");
		list.add("siva");
		list.add("and");
		list.add("I");
		list.add("am");
		list.add("From");
		list.add("Andhra pradesh");
		list.add("okay");
		
		
		List<String> sorted= list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
	    System.out.println(sorted);
	    
	    
	    

	}

}
