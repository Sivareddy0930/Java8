package BiPredicate;

import java.util.ArrayList;
import java.util.function.BiPredicate;


class Employee{
	String name;
	int salary;
	int sideIncome;
	public Employee(String name, int salary, int sideIncome) {
		super();
		this.name = name;
		this.salary = salary;
		this.sideIncome = sideIncome;
	}
		
}
public class BiPredicateWithObjects {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList();
		
		al.add(new Employee("siva",4000,20000));
		al.add(new Employee("munnny",3000,10000));
		al.add(new Employee("Bunny",2000,200));
		al.add(new Employee("Lunny",1000,16));
		
		
		
		BiPredicate<Integer,Integer> bp=(a,b)->a<b;//salary < sideIncome.
		
		for(Employee emp:al) {
			System.out.println("salary < sideIncome :-");
			System.out.println(bp.test(emp.salary,emp.sideIncome));
			System.out.println(emp.salary+"  "+emp.sideIncome);
		}

	}

}
