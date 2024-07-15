package Demo;

public class FinalKeyword {
	public final String name;
	
	public FinalKeyword(String setname) {
		 this.name=setname;
	}
	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword("Final_keyword");
		System.out.print(obj.name);
	}

}
