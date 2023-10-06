package BiConsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;



class Employee{
	String Name;
	Double Salary;
	public Employee(String name, Double salary) {
		super();
		Name = name;
		Salary = salary;
	}
	
	

	@Override
	public String toString() {
		return Name+" "+Salary;
	}
	
}
public class CreateBiConsumer {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee("Siva",80000.00) );
		al.add(new Employee("Reddy",90000.00) );
		al.add(new Employee("Tumu",60000.00) );
		al.add(new Employee("Venkata",100000.00) );
		al.add(new Employee("Kingu",40000.00) );
		al.add(new Employee("shankar",45000.00) );
		al.add(new Employee("gopal",30000.00) );
		al.add(new Employee("raju",50000.00) );
		
		//BiConsumer  it accept two arguments and perform sum operation and return nothing.
		
		BiConsumer<Employee,Double> bc=(obj,SalaryIncermented)->obj.Salary=(obj.Salary + SalaryIncermented);
		
		for(Employee obj:al) {
			bc.accept(obj,500.00);
		}
		for(Employee emp:al) {
			System.out.println(emp.Name+":"+emp.Salary);
		}
		

	}

}
