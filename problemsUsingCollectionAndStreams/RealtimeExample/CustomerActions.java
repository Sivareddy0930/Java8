package problemsUsingCollectionAndStreams.RealtimeExample;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class CustomerActions {

	public static void main(String[] args) {

		List<Customers> customerList = CustomersUtils.getCustomers();
		
		Consumer<Customers> c= cobj -> System.out.println(cobj);
		
		customerList.stream().forEach(c);
		
		
		
		
		

	}

}
