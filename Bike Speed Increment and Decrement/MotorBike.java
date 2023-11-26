
class MotorBike extends Bicycle{
	public int seatHeight;
	public MotorBike(int startHight, int startSpeed, int startGear){
		super(startSpeed, startGear);
		seatHeight=startHight;
	}
	public void setHeight(int newValue){
		seatHeight=newValue;
	}
}
