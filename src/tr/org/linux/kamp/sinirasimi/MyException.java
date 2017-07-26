package tr.org.linux.kamp.sinirasimi;

public class MyException extends Exception {

	@Override
	public String getMessage() {
		return "Hata MyException classından gönderildi!";
	}

}
