package Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

import Function_funtionalInterface.ObjectsWithFunctionAndPredicate;

class Student{
	String name;
	int marks;
	public Student(String name, int salary) {
		
		this.name = name;
		this.marks = salary;
	}
	
	
}
public class ConsumerWithObjects {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("Siva",94));
		al.add(new Student("Bunny",65));
		al.add(new Student("munny",79));
		al.add(new Student("chinny",46));
		al.add(new Student("dumbu",38));
		
		
		//my requirement is just take my data or accept data
		Consumer<Student> c=obj->{
			System.out.println(obj.name);
			System.out.println(obj.marks);
			};
		
		for(Student i:al) {
			c.accept(i);
		}
		
		

	}

}
