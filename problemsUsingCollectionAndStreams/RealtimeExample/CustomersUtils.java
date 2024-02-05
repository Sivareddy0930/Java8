package problemsUsingCollectionAndStreams.RealtimeExample;

import java.util.Arrays;
import java.util.List;

public class CustomersUtils {
	
	public static List<Customers> getCustomers(){
		
		Address permanentAddress = new Address(1234,"goldenstreet");
		Address localAddress = new Address(5678,"silverstreet");
		
		Customers c1 = new Customers(101,"aunny",100000,Arrays.asList(permanentAddress,localAddress));
		Customers c2 = new Customers(102,"bunny",70000,Arrays.asList(permanentAddress,localAddress));
		Customers c3 = new Customers(103,"cunny",35000,Arrays.asList(permanentAddress,localAddress));
		Customers c4 = new Customers(104,"dunny",24000,Arrays.asList(permanentAddress,localAddress));
		Customers c5 = new Customers(105,"eunny",45000,Arrays.asList(permanentAddress,localAddress));
		Customers c6 = new Customers(106,"funny",30000,Arrays.asList(permanentAddress,localAddress));
		Customers c7 = new Customers(107,"gunny",25000,Arrays.asList(permanentAddress,localAddress));
		
		return Arrays.asList(c1,c2,c3,c4,c5,c6,c7);
	}
	

}
