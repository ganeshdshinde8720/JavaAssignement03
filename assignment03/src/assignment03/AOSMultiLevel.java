package assignment03;

public class AOSMultiLevel extends SubtractionMultiLevel {
	
	public void aos() {
		int a=6;
		int aos = a*a;
		System.out.println(aos);
	}

	public static void main(String[] args) {
		
		AOSMultiLevel am = new AOSMultiLevel();
		am.div();
		am.sub();
		am.aos();
	}
		
		
}
