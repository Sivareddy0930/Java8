package Consumer;

//Condition: i want to add Grades to all Students and required only students whose marks>70 and print data


import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import Function_funtionalInterface.ObjectsWithFunctionAndPredicate;

class Students{
	String name;
	int marks;
	public Students(String name, int salary) {
		
		this.name = name;
		this.marks = salary;
	}
	
	
}
public class ConsumerWithObjectsAndFunctionAndPredicate {

	public static void main(String[] args) {
		
		ArrayList<Students> al=new ArrayList<Students>();
		al.add(new Students("Siva",94));
		al.add(new Students("Bunny",65));
		al.add(new Students("munny",79));
		al.add(new Students("chinny",46));
		al.add(new Students("dumbu",38));
		
		//Adding grades to all students
		
		Function<Students,String> f=obj->{
			

			if(obj.marks>=90) {
				return "Grade:-A";
			}
			else if(obj.marks>=80 && obj.marks<90 ){
				return "Grade:-B";
			}
			else if(obj.marks>=60 && obj.marks<80) {
				return "Grade:-C";
			}
			else if(obj.marks>=45 && obj.marks<60) {
				return "Grade:-D";
			}
			else  {
				return "Grade:-E";
			}	
			
		};
		
		
		//Only marks >70
		
		Predicate<Students> p=obj1->obj1.marks>70;
		
		
		//to take data that we required we use consumer
		// it just take my data or accept data
		
		
		Consumer<Students> c=obj->{
			System.out.println(obj.name);
			System.out.println(obj.marks);
			System.out.println(f.apply(obj));
			};
		
			
			
		for(Students obj:al) {
			if(p.test(obj)) {
				c.accept(obj);
			}
		}
		
		

	}

}
