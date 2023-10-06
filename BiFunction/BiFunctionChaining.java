package BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;



class Employee1{
	Integer Id;
	Integer Salary;
	public Employee1(Integer Id, Integer salary) {
		super();
		Id = Id;
		Salary = salary;
	}
	
	

	@Override
	public String toString() {
		return Id+" "+Salary;
	}
	
}
public class BiFunctionChaining {

	public static void main(String[] args) {
		
		ArrayList<Employee1> al=new ArrayList();
		al.add(new Employee1(1,80000) );
		al.add(new Employee1(2,90000) );
		al.add(new Employee1(3,60000) );
		al.add(new Employee1(4,100000) );
		al.add(new Employee1(5,40000) );
		al.add(new Employee1(6,45000) );
		al.add(new Employee1(7,30000) );
		al.add(new Employee1(8,50000) );
		
		
		
		//Take two details about Employee and return Employee object.
		
		BiFunction<Integer,Integer,Integer> bf=(Id,Salary)->Salary+100;
		
		
		Function<Integer,Integer> bf1=(Salary)->{
																					
													if(Salary<40000) {
																	
															return 0;
														}
													else {
														return Salary;
													}
																	
																	
												};
		
		//NOT COMPLICETED-----------------------------------------------------------------------------------------
		
		for(Employee1 obj:al) {
			System.out.println(bf.andThen(bf1).apply(obj.Id,obj.Salary));
		}

	}

}
