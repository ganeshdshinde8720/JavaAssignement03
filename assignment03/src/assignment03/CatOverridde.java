package assignment03;

public class CatOverridde extends AnimalOverridde {

	public void makesound() {
		System.out.println("Cat");
	}
	public static void main(String[] args) {
		
		CatOverridde co = new CatOverridde();
		co.makesound();

	}

}
