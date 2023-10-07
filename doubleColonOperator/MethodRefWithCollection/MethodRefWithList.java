package doubleColonOperator.MethodRefWithCollection;

import java.util.ArrayList;

interface interf<String>{
	String m1(String s);
}

public class MethodRefWithList {
	private static String returnName(String s) {
		
		return s;
	}

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Siva");
		al.add("Munny");
		al.add("Bunny");
		al.add("Cunny");
		al.add("Kunny");
		
		interf<String> i=MethodRefWithList::returnName;
		
		al.forEach((s)->System.out.println(i.m1(s)));
		
		
		}

}
