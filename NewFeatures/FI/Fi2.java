package NewFeatures.FI;

@FunctionalInterface
interface B{
	void run();
}
@FunctionalInterface
interface C extends B{
	void run();
}

public class Fi2 {

	public static void main(String[] args) {
		B i=()->{System.out.println("B Interface run method");};
		i.run();
		C j=()->{System.out.println("C Interface run method");};
		j.run();
	}

}
