package assignment03;

public class RectangleOverridding extends ShapeOverridding {
	
	public void getArea() {
		int l=8;
		int b=6;
		int aor = l*b;
		System.out.println(aor);
	}

	public static void main(String[] args) {
		
		RectangleOverridding ro = new RectangleOverridding();
		ro.getArea();

	}

}
