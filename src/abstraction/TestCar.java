package abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Toyota(); //Interface Cannot be instantiated
		car.start();
		car.stop();
		car.brake();
		
		Toyota ty = new Toyota();
		ty.price();
		ty.start();
		ty.stop();
		ty.brake();
		
		ty.autopilot();
		ty.flyingFeature();
		
		ty.battery();
		
		ty.weight();
		
		ty.shape();
		
		FlyingCar fc = new Toyota();//Abstract class Cannot be instantiate
		fc.autopilot();
		fc.flyingFeature();
		
		ElectricCar ec = new Toyota();
		ec.battery();
		
		Drone dr = new Toyota();
		dr.weight();
		
		FlyingObject fo = new Toyota();
		fo.shape();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
