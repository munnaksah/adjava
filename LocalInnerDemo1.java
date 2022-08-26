package adprogram;
 class LocalInnerOuter{
	 public void m1() {
		 final int x= 20;
		 class InnerClass
		 {
			
			 public void printsum() {
				 int y = 40;
				 int z = x+y;
				 System.out.println(z);
			 }
		 }
		 InnerClass ic = new   InnerClass();
		 ic.printsum();
	 }
 }


public class LocalInnerDemo1 {
	public static void main(String[] args) {
		LocalInnerOuter av = new LocalInnerOuter();
		av.m1();
	}
	

}
