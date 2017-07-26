package tr.org.linux.kamp.inheritance;

public class InsanTest {
	
	public static void main(String[] args) {
		
		Insan human1 = new Insan();
		
		human1.setIsim("Mustafa");
		human1.setYas(21);
		human1.setCinsiyet(true);
		
		human1.uyumak();
		human1.uyanmak();
		human1.yikanmak();
		human1.giyinmek();
		human1.hareketEtmek();
		
		
		System.out.println();
		Insan human2 = new Insan("Alp",21,true);
		human2.giyinmek();
		
	}
	
}
