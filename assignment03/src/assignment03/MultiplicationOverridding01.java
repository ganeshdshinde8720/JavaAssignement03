package assignment03;

public class MultiplicationOverridding01 extends  MultiplicationOverridding {
	
	public void mult() {
		int a=8;
		int b=2;
		int mult = a*b;
		super.mult();
		System.out.println(mult);
	}

	public static void main(String[] args) {
		
		 MultiplicationOverridding01 obj = new  MultiplicationOverridding01();
		 obj.mult();

	}

}
