package oop;

public class DriveCar {

	/* Here is your main method. You will instantiate the Concrete class in here.Then use all the methods and variables. */
	
	public static void main(String[] args) {
		MotorVehicle mtv = new Toyota();
		mtv.computFuel();
		mtv.chooseColor();
		Car car = new Toyota();
		car.engine();
		car.name();
		car.Speed();
		car.Speed();
		car.wheels();
		Toyota tta = new Toyota();
		tta.equals(mtv);
		tta.notifyAll();

	}

}
