package adprogram;

 class A{
	 
	 class B{

		public void inner_b(String msg) {
			System.out.println("inner class message from main method:" +msg);// TODO Auto-generated method stub
			
		}}
	 public void printsomething(String msg) {
		 System.out.println("outer class message from main method:" +msg);
	 }
	 
 }
	 
	


public class InnerClassDemo2 {
	public static void main(String[] args) {
		A a = new A();
		a.printsomething("message from outer class");
		
		A.B b = a.new B();
		b.inner_b("hello");
		//b.printsomething("message from outer class");
		
		
	}
	

}
