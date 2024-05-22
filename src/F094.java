import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class F094 {

	public static void main(String[] args) {
		//Formatando a data
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:36");
		Instant d06 = Instant.parse("2022-07-20T01:30:36Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:36-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);


		
		System.out.println("D01 = " + d01.toString());
		System.out.println("D02 = " + d02.toString());
		System.out.println("D02 = " + d03.toString());
		System.out.println("D04 = " + d04.toString());
		System.out.println("D05 = " + d05.toString());
		System.out.println("D06 = " + d06.toString());
		System.out.println("D07 = " + d07.toString());
		System.out.println("D08 = " + d08.toString());
		System.out.println("D09 = " + d09.toString());
		System.out.println("D010 = " + d10.toString());
		System.out.println("D011 = " + d11.toString());







		
	}
}
