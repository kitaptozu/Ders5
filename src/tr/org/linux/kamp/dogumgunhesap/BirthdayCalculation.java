package tr.org.linux.kamp.dogumgunhesap;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayCalculation {

	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now(); // tarih tutan değişkene now metoduyla o anın tarihini atar.

		Scanner input = new Scanner(System.in);

		System.out.println("Lütfen doğum gününüzü giriniz! (gün ay yıl)");
		int gun = input.nextInt();
		int ay = input.nextInt();
		int yil = input.nextInt();

		LocalDate birthDay = LocalDate.of(yil, ay, gun); // tarih tutan bir sınıf.

		long age = ChronoUnit.DAYS.between(birthDay, currentDate) / 365;// veriler long tipinde döner
		long resultDay = ChronoUnit.DAYS.between(birthDay, currentDate);
		long resultMonth = ChronoUnit.DAYS.between(birthDay, currentDate) / 30;
		System.out.println("Ay: " + resultMonth);
		System.out.println("Gün: " + resultDay);
		System.out.println("Yaşınız: " + age);
		// ChronoUnit.DAYS.between(birthDay, currentDate) //sağdakinden soldakini
		// çıkarıyor yani karşılaştırma yapıyoruz.

		input.close();
		

	}

}
