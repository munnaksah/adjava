package adprogram;
class OuterA {
	static class InnerB{
		public void m1() {
			System.out.println("static nested class method");
		}
		
	}
	
}

public class StaticInnerDemo {
	public static void main(String[] args) {
		OuterA.InnerB b = new OuterA.InnerB();
		b.m1();
		
	}
	

}
