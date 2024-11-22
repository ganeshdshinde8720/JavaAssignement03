package assignment03;

public class CheetahOverridding extends Animal01Overridding{
	
	public void move() {
		
		System.out.println("This is Cheetah");
	}

	public static void main(String[] args) {
		
		CheetahOverridding co = new CheetahOverridding();
			co.move();

	}

}
