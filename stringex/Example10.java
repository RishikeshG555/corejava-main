package stringex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example10 {

	public static void main(String[] args) {
		LocalDate curDate=LocalDate.now();
		System.out.println(curDate);
		DateTimeFormatter pat = DateTimeFormatter.ofPattern("d yyyy");
		String foda=pat.format(curDate);
		System.out.println(foda);
		LocalTime ti=LocalTime.now();
		System.out.println(ti);
		System.out.println(LocalTime.of(10, 20));
		System.out.println(DateTimeFormatter.ofPattern("hh:mm:s a").format(ti));
		System.out.println(DateTimeFormatter.ofPattern("dd MM y hh :: mm :: s a").format(LocalDateTime.now()));
	}

}
