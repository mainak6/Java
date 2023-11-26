
class Bicycle{
	protected int gear;
	protected int speed;
	
	public Bicycle(int startSpeed, int startGear){
		this.gear=startGear;
		this.speed= startSpeed;
	}
	public void setGear(int newValue){
		gear=newValue;
	}
	public void applyBrake(int decrement){
		speed-=decrement;
	}
	public void speedUp(int increment){
		speed+=increment;
	}
}
