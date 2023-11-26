
class Combine{
	public static void main (String args[]){
		MotorBike motorBike = new MotorBike(20, 10, 2);
		System.out.println("Gear is: "+ motorBike.gear);
		System.out.println("Seat Height: "+ motorBike.seatHeight);
		System.out.println("Break Speed: "+ motorBike.speed);
		motorBike.speedUp(5);
		System.out.println("Speed up after speed is : "+motorBike.speed);
	}
}
