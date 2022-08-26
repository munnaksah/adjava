package adprogram;
class OuterClass{
	
	class InnerClass{
		public void printsomething() {
			System.out.println("its a inner class");
			
		}
	}
	
}



public class InnerClassDemo1 {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.printsomething();
	}

}
