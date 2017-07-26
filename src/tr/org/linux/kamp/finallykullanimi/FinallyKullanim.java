package tr.org.linux.kamp.finallykullanimi;

public class FinallyKullanim {
	
	
	public static void main(String[] args) {
		
		
		try {
			int a=6/0;
		}catch(Exception e) {
			System.out.println("Hataaaaa");
		}
		finally {
			System.out.println("Ne olursa olsun çalışır!");
		}
		
	}

}
