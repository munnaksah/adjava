package adprogram;

class LocalOuterClass{
	
	public void outermethod() {
		class InnerClass{
			public void printsomething() {
				System.out.println("inner class from the local method");
			}
			
			public void hello() {
				System.out.println("inner class from the hello method");
			}
			
		}
		InnerClass ic  = new InnerClass();
		ic.printsomething();
		ic.hello();
	}
}

public class LocalInnerDemo {
	public static void main(String[] args) {
		
		LocalOuterClass loc = new LocalOuterClass();
		loc.outermethod();
		
	}
	

}
