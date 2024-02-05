package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo6 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Optional<Integer> max = numbers.stream().max((a, b) -> a.compareTo(b));
		System.out.println(max.get());

	}
}
