package BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;



class Employee{
	String Name;
	Integer Salary;
	public Employee(String name, Integer salary) {
		super();
		Name = name;
		Salary = salary;
	}
	
	

	@Override
	public String toString() {
		return Name+" "+Salary;
	}
	
}
public class CreateBiFunction {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee("Siva",80000) );
		al.add(new Employee("Reddy",90000) );
		al.add(new Employee("Tumu",60000) );
		al.add(new Employee("Venkata",100000) );
		al.add(new Employee("Kingu",40000) );
		al.add(new Employee("shankar",45000) );
		al.add(new Employee("gopal",30000) );
		al.add(new Employee("raju",50000) );
		
		
		
		//Take two details about Employee and return Employee object.
		
		BiFunction<String,Integer,Employee> bf=(Name,Salary)->new Employee(Name,Salary);
		
		for(Employee obj:al) {
			System.out.println(bf.apply(obj.Name,obj.Salary));
		}

	}

}
