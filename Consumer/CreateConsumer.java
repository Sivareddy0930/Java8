package Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class CreateConsumer {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		//it just consume or accept data or object and perform operations if required and just print data but don't return any thing.
		//Example:-if you want add data to database that don't required anything to return .Then Consumer is used.
		Consumer<Integer> c=a->{System.out.println(a);};
		
		for(Integer i:al) {
			c.accept(i);
		}
		
		

	}

}
