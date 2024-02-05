package problemsUsingCollectionAndStreams.RealtimeExample;

public class Employees {

	private int eid;
	private String ename;
	private long salary;
	public Employees(int eid, String ename, long i) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = i;
	}
	
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public long getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return  eid +"-" + ename + "-" + salary ;
	}
	
	
	
}
