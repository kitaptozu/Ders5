package tr.org.linux.kamp.sinirasimi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SinirAsimi {

	public static void main(String[] args) throws MyException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir string değer giriniz!");
		
		
		int[] a = new int[1];
		int a1=0;
		int b1=5;
		int result;
		String girdi;
		
		try {
			girdi=input.nextLine();
			result = b1/a1;
			
			throw new MyException();
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Hata  mesajı: " + e);
		}
		catch (ArithmeticException e) {
			System.out.println("Hata mesajı: "+e);
		}
		catch(InputMismatchException e){
			System.out.println("Hata mesajı: "+e);
		}

		System.out.println("try-catch çalışması bitti.");

	}

}
