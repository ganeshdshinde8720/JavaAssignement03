package assignment03;

public class Vehicle {

	protected String make;
	protected String model;
	protected int year;
	protected String fuelType;

	public Vehicle(String make, String model, int year, String fuelType) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuelType = fuelType;
	}

	public double calculateFuelEfficiency(double fuelConsumed, double distanceTraveled) {
		if (distanceTraveled == 0)
			return 0;
		return distanceTraveled / fuelConsumed;
	}

	public double calculateDistanceTraveled(double fuelConsumed, double fuelEfficiency) {
		return fuelEfficiency * fuelConsumed;
	}

	public int calculateMaxSpeed() {
		return 120;
	}

	@Override
	public String toString() {
		return String.format("Vehicle [Make: %s, Model: %s, Year: %d, Fuel Type: %s]", make, model, year, fuelType);
	}
}

class Truck extends Vehicle {
	private double loadCapacity;

	public Truck(String make, String model, int year, String fuelType, double loadCapacity) {
		super(make, model, year, fuelType);
		this.loadCapacity = loadCapacity;
	}

	@Override
	public int calculateMaxSpeed() {
		return 100;
	}

	@Override
	public String toString() {
		return String.format("Truck [Make: %s, Model: %s, Year: %d, Fuel Type: %s, Load Capacity: %.2f tons]", make,
				model, year, fuelType, loadCapacity);
	}
}

class Car extends Vehicle {
	private int numDoors;

	public Car(String make, String model, int year, String fuelType, int numDoors) {
		super(make, model, year, fuelType);
		this.numDoors = numDoors;
	}

	@Override
	public int calculateMaxSpeed() {
		return 180;
	}

	@Override
	public String toString() {
		return String.format("Car [Make: %s, Model: %s, Year: %d, Fuel Type: %s, Doors: %d]", make, model, year,
				fuelType, numDoors);
	}
}

class Motorcycle extends Vehicle {
	private boolean hasSidecar;

	public Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
		super(make, model, year, fuelType);
		this.hasSidecar = hasSidecar;
	}

	@Override
	public int calculateMaxSpeed() {
		return 200;
	}

	@Override
	public String toString() {
		return String.format("Motorcycle [Make: %s, Model: %s, Year: %d, Fuel Type: %s, Has Sidecar: %b]", make, model,
				year, fuelType, hasSidecar);
	}
}

class VehicleTest {
	public static void main(String[] args) {

		Truck truck = new Truck("Ford", "F-150", 2020, "Diesel", 5.0);
		Car car = new Car("Toyota", "Corolla", 2022, "Gasoline", 4);
		Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2021, "Gasoline", false);

		System.out.println(truck);
		System.out.println("Max Speed: " + truck.calculateMaxSpeed() + " km/h");
		System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency(50, 500) + " km/l");
		System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled(50, 10) + " km");

		System.out.println();

		System.out.println(car);
		System.out.println("Max Speed: " + car.calculateMaxSpeed() + " km/h");
		System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency(30, 600) + " km/l");
		System.out.println("Distance Traveled: " + car.calculateDistanceTraveled(30, 20) + " km");

		System.out.println();

		System.out.println(motorcycle);
		System.out.println("Max Speed: " + motorcycle.calculateMaxSpeed() + " km/h");
		System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency(10, 300) + " km/l");
		System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTraveled(10, 30) + " km");
	}
}
