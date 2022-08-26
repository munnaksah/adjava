package adprogram;

class OuterDemo{
	void printDemo() {
		System.out.println("print message from outer class method");
	}
}


public class AnonymousClassDemo {
	
	static OuterDemo  od = new OuterDemo() {
	void printDemo(){
	super.printDemo();
	System.out.println("this is a anonymous class");
	}
};
 public static void main(String[] args) {
	 od.printDemo();
	 

}
}

