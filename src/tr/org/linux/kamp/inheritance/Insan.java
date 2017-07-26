package tr.org.linux.kamp.inheritance;

public class Insan {

	public Insan() {
		System.out.println("insan nesnesi yaratıldı!");
	}

	public Insan(String isim, int yas, boolean cinsiyet) {
		this();
		setCinsiyet(cinsiyet);
		setIsim(isim);
		setYas(yas);

	}

	private String isim;
	private int yas;
	private boolean cinsiyet;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public boolean isCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(boolean cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public void yemekYemek() {
		System.out.println("Yemek yendi!");
	}

	public void uyumak() {
		System.out.println("Uyundu!");
	}

	public void uyanmak() {
		System.out.println("Uyanıldı!");
	}

	public void yikanmak() {
		System.out.println("Duş Alındı!");
	}

	public void giyinmek() {
		System.out.println("Elbise giyildi!");
	}

	public void hareketEtmek() {
		System.out.println("Hareket edildi!");
	}

}
