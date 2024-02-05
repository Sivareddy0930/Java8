package problemsUsingCollectionAndStreams.RealtimeExample;

import java.util.List;

public class Customers {

	private int id;
	private String name;
	private long salary;
	
	private List<Address> address;
	
	

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Customers(int id, String name, long salary, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}



	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public long getSalary() {
		return salary;
	}



	public List<Address> getAddress() {
		return address;
	}



	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address ;
	}
	
	
	
}
