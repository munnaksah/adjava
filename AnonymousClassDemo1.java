package adprogram;

interface OuterInterface {
	void printHello();
	
	
}

public class AnonymousClassDemo1 {
	static OuterInterface oi = new OuterInterface() {
		public void printHello() {
			System.out.println("Anonymous class interface");
		}
		
	};
	public static void main(String[] args) {
		oi.printHello();
	}

}

