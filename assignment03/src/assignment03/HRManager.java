package assignment03;

public class HRManager extends Employee{


	public void work() {
		super.work();
		
		System.out.println("This is HRManager work method");
	}
	public void addEmployee() {
		System.out.println("This is addEmployee method");
		
	}
	
	public static void main(String[] args) {
		
		HRManager hm = new HRManager();
		hm.work();
		hm.addEmployee();
		hm.getSalary();

	}

}
