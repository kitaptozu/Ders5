package tr.org.linux.kamp.bicycleexample;

public class BicycleTest {

	public static void main(String[] args) {

		MountainBicycle bisiklet1 = new MountainBicycle(4,40,"Kırmızı",3);
		
		
		System.out.println("Vites: " + bisiklet1.getGear());
		System.out.println("Hız: "+bisiklet1.getSpeed());
		System.out.println("Padalın saniyede dönüş sayısı: "+bisiklet1.getSpin());
		System.out.println("Rengi: "+bisiklet1.getColor());
		
		
		
		System.out.println();
		
		
		
		bisiklet1.changeGear(4);
		System.out.println("Vites: " + bisiklet1.getGear());
		bisiklet1.changeSpeed(40);
		System.out.println("Hız: "+bisiklet1.getSpeed());
		bisiklet1.changeSpin(3);
		System.out.println("Padalın saniyede dönüş sayısı: "+bisiklet1.getSpin());
		bisiklet1.setColor("Mor");
		System.out.println("Renk: "+bisiklet1.getColor());
		
		
		System.out.println(bisiklet1.toString());
		
	}

}
