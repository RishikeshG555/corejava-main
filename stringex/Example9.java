package stringex;

import java.time.LocalDate;

public class Example9 {
	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		System.out.println(currentDate);
		LocalDate customDate=LocalDate.of(2018, 12, 15);
		System.out.println(customDate);
		System.out.println(currentDate.getDayOfMonth());
		System.out.println(currentDate.getDayOfYear());
		System.out.println(currentDate.getYear());
		System.out.println(currentDate.isLeapYear());
		System.out.println(currentDate.plusDays(1000));
		System.out.println(customDate.minusMonths(12));
	}
}
