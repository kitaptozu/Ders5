package tr.org.linux.kamp.Hatalar;

public class Hatalar {
	
	
	public static void main(String[] args) {
		int a=5;
		int b=0;
		
		try {
		
			int result = a/b;
		
		} catch (ArithmeticException e) {
			
			System.out.println("Sıfıra bölme hatası: "+e);
			
		}
		
		System.out.println("Try-catch çalışması bitti");
		
		
		
	}

	
	

}
