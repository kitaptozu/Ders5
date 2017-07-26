package tr.org.linux.kamp.bicycleexample;

public class MountainBicycle extends Bicycle{
	
	public MountainBicycle(int gear, int speed, String color,int spin) {
		super(gear, speed, color);
		this.spin=spin;
	}



	private int spin; //Dönüş oranı
	
	
	
	public int getSpin() {
		return spin;
	}



	public void setSpin(int spin) {
		this.spin = spin;
	}



	public void changeSpin(int spin) {
		
		this.spin+=spin;
		
	}



	@Override
	public String toString() {
		return "MountainBicycle spin=" + spin + "super.gear=" + super.getGear() + "speed=" + super.getSpeed() + ", color=" + super.getColor();
	}
	
	
	
	
	
}
