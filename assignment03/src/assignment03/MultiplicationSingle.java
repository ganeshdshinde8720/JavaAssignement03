package assignment03;

public class MultiplicationSingle extends AdditionSingle {
	
	public void mult() {
		int a=80;
		int b=15;
		int mult =a*b;
		System.out.println(mult);
	}

	public static void main(String[] args) {
		MultiplicationSingle ms = new MultiplicationSingle();
		ms.add();
		ms.mult();

	}

}
