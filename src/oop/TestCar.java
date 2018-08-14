package oop;

public class TestCar {

	public static void main(String[] args) {
		Car car= new Toyota();
		car.start();
		car.stop();
		car.wheel();
		
		Toyota camry = new Toyota();
		camry.motorVehicle();
		camry.engineRunByBattery();
		camry.autoPilot();

		BMW series5 = new BMW();
		series5.start();
		series5.stop();
		series5.wheel();
		
	    FlyingCar kittyhawk=new Toyota();
		kittyhawk.flyingobjects();
	}

}
