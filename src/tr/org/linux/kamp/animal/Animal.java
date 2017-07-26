package tr.org.linux.kamp.animal;

public class Animal {

	private String isim;
	private int age;
	private String gender;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void yemekYemek() {
		System.out.println("Yemek yendi!");
	}

	public void avlanmak() {
		System.out.println("Avlanıldı ve av yakalandı!");
	}

	public void uyumak() {
		System.out.println("Uyundu!");
	}

}
