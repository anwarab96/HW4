package oop;


/* This is a Concrete class which can implements Car interface and extends MotorVehicle Abstract class.
 Then implements few own methods and variables. */

public class Toyota extends MotorVehicle implements Car {
	public  double computFue(){
		double pricePerGallon = 3.50;
		double totalGallon=15;
		double totalPrice = pricePerGallon*totalGallon;
		return totalPrice;
	}
	public void wheels() {
		System.out.println("Camry has four wheels");
		}
		public double Speed() {
		double distance = 500.75;
		double time = 5.5;
		double cSpeed = distance/time;
				return cSpeed;
	}
	public void engine() {
		System.out.println("Camry has quality engine");
		}
	public String name() {
		System.out.println("Toyota has variety name");
		return null;
	}
	public String chooseColor() {
		System.out.println("It is nice to get the favorite color");
		return null;
	}
	@Override
	public double computFuel() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
