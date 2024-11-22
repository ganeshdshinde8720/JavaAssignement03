package assignment03;

public class TriangleHierarcgical extends TrapezoidHierarchical {
	
	public void aot1() {
		int b=8;
		int h=6;
		int aot1 = h*b/2;
		System.out.println(aot1);
	}

	public static void main(String[] args) {
		
		SimpleInterestHierachical obj = new SimpleInterestHierachical();
		obj.si();
		obj.aot();
		
		TriangleHierarcgical obj1 = new TriangleHierarcgical();
		obj1.aot1();
		obj1.aot();
	}

}
