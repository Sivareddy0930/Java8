package problemsUsingCollectionAndStreams.RealtimeExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CustomerActions {

	public static void main(String[] args) {

		List<Customers> customerList = CustomersUtils.getCustomers();
		
		Consumer<Customers> c= cobj -> System.out.println(cobj);
		
		customerList.stream().forEach(c);
		
		System.out.println("//===========================================================================");
		customerList.stream().filter(cobj -> cobj.getName().length()>=6).forEach(System.out::println);
		
		System.out.println("//===========================================================================");
		customerList.stream().filter(cobj -> "aunnyvhfv".equals(cobj.getName())).forEach(System.out::println);
		
		System.out.println("//===========================================================================");
		customerList.stream().map(cobj -> cobj.getSalary()+116 ).filter(salary -> salary > 40000).forEach(System.out::println);
		
		System.out.println("//===========================================================================");
		Optional<Customers> findAny = customerList.stream().findAny();
		System.out.println(findAny.get());
		
		List<String> al=Arrays.asList("siva","appy","zuddy","koan","jsiw");
		
		List<String> collect = al.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		
		

	}

}
