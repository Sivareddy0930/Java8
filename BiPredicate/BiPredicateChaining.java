package BiPredicate;

import java.util.ArrayList;
import java.util.function.BiPredicate;


class Employee1{
	String name;
	int salary;
	int sideIncome;
	public Employee1(String name, int salary, int sideIncome) {
		super();
		this.name = name;
		this.salary = salary;
		this.sideIncome = sideIncome;
	}
		
}
public class BiPredicateChaining {

	public static void main(String[] args) {
		
		ArrayList<Employee1> al=new ArrayList();
		
		al.add(new Employee1("siva",8000,20000));
		al.add(new Employee1("munnny",7000,10000));
		al.add(new Employee1("Bunny",11000,200));
		al.add(new Employee1("Lunny",10000,16));
		
		
		
		BiPredicate<Integer,Integer> bp=(a,b)->a<b;//salary < sideIncome.
		
		BiPredicate<Integer,Integer> bp1=(a,b)->(a+b)>15000;
		
		//find the people with more side income and whose total money >15000.
		for(Employee1 emp:al) {
			if(bp.and(bp1).test(emp.salary,emp.sideIncome)) {
				System.out.println("Name:-"+emp.name);
				System.out.println(emp.salary+"  "+emp.sideIncome);
			}
			
		}

	}

}
