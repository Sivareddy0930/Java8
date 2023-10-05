package Function_funtionalInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class ObjectsWithFunctionAndPredicate {
	
	String name;
	int marks;
	ObjectsWithFunctionAndPredicate(String name,int marks){
		this.name=name;
		this.marks=marks;
	}

	public static void main(String[] args) {
			
		
		
		
		ArrayList<ObjectsWithFunctionAndPredicate> al=new ArrayList();
		al.add(new ObjectsWithFunctionAndPredicate("Siva",94));
		al.add(new ObjectsWithFunctionAndPredicate("Bunny",65));
		al.add(new ObjectsWithFunctionAndPredicate("munny",79));
		al.add(new ObjectsWithFunctionAndPredicate("chinny",46));
		al.add(new ObjectsWithFunctionAndPredicate("dumbu",38));
		
		//Assign Grading for corresponding marks.===========>Function is used.
		//And i need Students whose marks >70.   ===========>Predicate is used.
		
		
		
		Function<Integer,String> fi=s->{
											if(s>=90) {
												return "Grade:-A";
											}
											else if(s>=80 && s<90 ){
												return "Grade:-B";
											}
											else if(s>=60 && s<80) {
												return "Grade:-C";
											}
											else if(s>=45 && s<60) {
												return "Grade:-D";
											}
											else  {
												return "Grade:-E";
											}
									   };
		
		Predicate<Integer> p=k->k>70;
		
		for(ObjectsWithFunctionAndPredicate obj:al) {
			if(p.test(obj.marks)) {
				System.out.println(obj.name);
				System.out.println(obj.marks);
				System.out.println(fi.apply(obj.marks));
				System.out.println("---------------------------");
			}
		}
		
	}

}
