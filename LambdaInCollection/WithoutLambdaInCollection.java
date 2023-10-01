package LambdaInCollection;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	class MyComparator implements Comparator<Integer>{
		// here i used integer type as generic because my data is integer elements .Default type is Object.
		
		//Comparator is used to sort data in custom format.it has compare method.
		
		//Syntax
//		public int compare(Object o1, Object o2) {
//			return 0;
//		}
		
		
		public int compare(Integer I1,Integer I2) {
					
//			if(I1<I2) {
//				return -1;
//			}
//			else if(I1>I2) {
//				return +1;
//			}
//			else {
//				return 0;
//			}
//		}
			
			//Using Ternary operator
			
			return (I1<I2)?-1:(I1>I2)?+1:0;

	}

	public class WithoutLambdaInCollection {

		public static void main(String[] args) {
			ArrayList l=new ArrayList();
			l.add(1);
			l.add(8);
			l.add(5);
			l.add(4);
			l.add(0);
			l.add(6);
			l.add(4);
			System.out.println(l);
			Collections.sort(l,new MyComparator());
			System.out.println(l);
			
		}

	}

}



