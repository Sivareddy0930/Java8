package problemsUsingCollectionAndStreams.RealtimeExample;

public class Address {

	private int streetNumber;
	private  String streetName;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int streetNumber, String streetName) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	@Override
	public String toString() {
		return "streetNumber=" + streetNumber + ", streetName=" + streetName;
	}
	
	
	
}
