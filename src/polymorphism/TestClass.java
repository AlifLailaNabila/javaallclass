package polymorphism;

public class TestClass {

	public static void main(String[] args) {
		ModernCalculator mc=new ModernCalculator();
		System.out.println(mc.areaOfLand(10, 7));
		Calculator cl=new Calculator();
		System.out.println(cl.areaOfLand(10, 7));
	}
	
	
	
	
	

}
