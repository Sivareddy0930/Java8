package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Demo5{
	public static void main(String[] args) {
		String s=null;
		
		Optional<String> optional=Optional.ofNullable(s);
		System.out.println(optional);
	}
}
