package tr.org.linux.kamp.bicycleexample;

public class Bicycle {

	private int gear;
	private int speed;
	private String color;
	
	public Bicycle(int gear,int speed,String color) {
		this.color=color;
		this.speed=speed;
		this.gear=gear;
	}
	
	
	
	
	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear += gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed += speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public void changeSpeed(int speed){
		
		this.speed+=speed;
		
	}
	
	public void changeGear(int gear) {
		
		this.gear+=gear;
	}




	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + ", color=" + color + "]";
	}
	
	
	
}
