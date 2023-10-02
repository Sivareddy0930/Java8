package PredefinedFunctionalInterfaces.predicate;

import java.util.function.Predicate;
import java.util.*;

class Employee{
	String name;
	int salary;
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	
	//To get values i am overriding toString method.
	
	public String toString() {
		
		return name+":"+salary;
	}
	
}

public class PredicateFIWithObjects {

	public static void main(String[] args) {
		// print employee object whose salary is >50000.
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("Siva",80000) );
		al.add(new Employee("Reddy",90000) );
		al.add(new Employee("Tumu",60000) );
		al.add(new Employee("Venkata",100000) );
		al.add(new Employee("Kingu",40000) );
		al.add(new Employee("shankar",45000) );
		al.add(new Employee("gopal",30000) );
		al.add(new Employee("raju",50000) );

		
		
		Predicate<Employee> t=e->e.salary>50000;
		
		for(Employee e1:al) {
			if(t.test(e1)) {
				System.out.println(e1);
			}
		}
		

		
			
	}

}
