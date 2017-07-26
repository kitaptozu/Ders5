package tr.org.linux.kamp.animal;

public class AnimalTest {

	
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.setAge(12);
		animal.setGender("Dişi");
		animal.setIsim("Boncuk");
		
		
		animal.avlanmak();
		animal.uyumak();
		animal.yemekYemek();
		
		System.out.println(animal.getAge());
		System.out.println(animal.getGender());
		System.out.println(animal.getIsim());
	}
}
