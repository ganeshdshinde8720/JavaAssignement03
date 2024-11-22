package assignment03;

public class CarOverridding extends VehicleOverridding {

	public void drive() {
		System.out.println("Repairing a Car");
	}
	public static void main(String[] args) {
		
		CarOverridding obj =new CarOverridding();
		obj.drive();
		

	}

}
