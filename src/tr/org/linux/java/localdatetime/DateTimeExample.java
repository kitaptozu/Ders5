package tr.org.linux.java.localdatetime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeExample {
	
	
	
	public static void testLocalDateTime() {
		
		LocalDateTime currentTime = LocalDateTime.now();// now() metodu static tanımlı
		
		LocalDate currentDate=LocalDate.now();
		
		System.out.println("Current time: "+currentTime);
		System.out.println("Current date: "+currentDate);
		
		Month month = currentTime.getMonth(); //Month enum bir tiptir.
		
		int day = currentTime.getDayOfMonth();
		
		int second= currentTime.getSecond();
		
		System.out.println("Ay = "+month+" Gün = "+day+" Second = "+second);
		
		LocalDateTime tiimeExample = currentTime.withDayOfMonth(8).withYear(2017);
		LocalDate dateExample = LocalDate.of(2017,month.JULY,26);
		System.out.println("dateExample = "+dateExample);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		testLocalDateTime();
	}
	

}
