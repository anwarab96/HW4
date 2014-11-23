package oop;

/*This is an Abstract class, declare few abstract methods and non-abstract methods. */

public abstract class MotorVehicle {
		private double  fuel;
		private String color;
		private  String brand;
		public MotorVehicle(){
			System.out.println("constructor without argument");
		}
		
//		public MotorVehicle(int fuel,String color, String brand){
//			System.out.println("Constructing a MotorVehicle class");
//			this.fuel = fuel;
//			this.color = color;
//			this.brand = brand;
//		}
		public abstract double computFuel();
		public abstract String chooseColor();
//		public String findBrand(){
//			System.out.println("There are variety of brand " + this.brand);
//		}
//	
//			public String getColor(){
//				return color;
//			}
//			public String getBrand(){
//				return brand;
//			}
//			public double getAmountOfFuel(){
//				return fuel;
//			}
				
}			
				
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	

}
