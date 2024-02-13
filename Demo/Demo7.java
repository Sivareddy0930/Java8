package Demo;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo7 {
	public static int sumAll(int value) {
//		1234 => 123+4,12+34,+1+234,1+2+3+4,1234 =>1652
//		123 => 1+23, 12+3,1+2+3,123 =>168
		
		int value2=value;
		int value3=value;
		int value4=value;
		int Allsum=0;
		
		int count=0;
		while(value2>0) {
			count++;
			value2=value2/10;
		}
		System.out.println(count);
		
		int i=1;
		int div=10;
		while(i<count) {
			
			Allsum=Allsum+value%div+value3/div;
			i++;
			div=div*10;
		
			
		}
		
		System.out.println(Allsum);
		
		while(count>0) {
			
			Allsum=Allsum+value%10;
			value=value/10;
			count--;
		}
		
		return Allsum + value4;
		
	}
public static void main(String[] args) {
	System.out.println(sumAll(1234));
}
	}


