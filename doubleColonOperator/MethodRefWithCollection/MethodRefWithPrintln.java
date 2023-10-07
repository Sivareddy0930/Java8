package doubleColonOperator.MethodRefWithCollection;

import java.util.ArrayList;

public class MethodRefWithPrintln {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Siva");
		al.add("Munny");
		al.add("Bunny");
		al.add("Cunny");
		al.add("Kunny");
		
		//al.forEach((name)->{System.out.println(name);});
		
		al.forEach(System.out::println);
		//forEach is used to iterate over the elements.
		//System.out::println This is a method reference to the println method of the System.out object.
		//It is equivalent to writing a lambda expression like (name) -> System.out.println(name). 
		//This method reference is used as the action to be performed on each element during iteration.

	}

}
