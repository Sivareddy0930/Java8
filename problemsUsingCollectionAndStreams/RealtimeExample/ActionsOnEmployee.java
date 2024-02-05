package problemsUsingCollectionAndStreams.RealtimeExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ActionsOnEmployee {

	public static void main(String[] args) {
		
		List<Employees> Elist = new ArrayList<>();
		
		Elist.add(new Employees(101, "Siva", 47000));
		Elist.add(new Employees(102, "bunny", 40000));
		Elist.add(new Employees(103, "tunny", 35000));
		Elist.add(new Employees(104, "zunny", 100000));
		Elist.add(new Employees(105, "kunny", 25000));
		Elist.add(new Employees(106, "okay", 17000));
		
		//max salary
		
//		OptionalInt max = Elist.stream().map( Eobj -> Eobj.getSalary()).mapToInt(Integer :: parseInt).max();	
		
		 Optional<Employees> max = Elist.stream().max(Comparator.comparing(Employees::getSalary));
		
		System.out.println(max.get());


	}

}
