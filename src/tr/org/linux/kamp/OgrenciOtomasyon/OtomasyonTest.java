package tr.org.linux.kamp.OgrenciOtomasyon;

import java.util.Scanner;

public class OtomasyonTest {
	
	
	public static void main(String[] args) {
		Ogrenci ogr = new Ogrenci();
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen adınızı giriniz!");
		
		try {
		ogr.setAdi(input.nextLine());
		}catch(OgrenciException e) {
			System.out.println(e);
		}
		
		
		
		
		
		System.out.println("Lütfen TC kimlik numaranızı giriniz!");
		try {
			ogr.setTc(input.nextLine());
		}catch (OgrenciException e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		System.out.println("lütfen notunuzu giriniz!");
		
		ogr.setNot(input.nextInt());
		
		
		
		
		
		
		
		
		System.out.println(ogr.getTc());
		System.out.println(ogr.getAdi());
		System.out.println(ogr.getNot());
		
		
		input.close();
		
	}

}
