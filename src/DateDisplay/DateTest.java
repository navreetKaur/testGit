package DateDisplay;

import dateUtility.DateUtility;

public class DateTest {

	public static void main(String[] args) {
		System.out.println(DateUtility.displayCalendar(8, 1947));
		System.out.println(DateUtility.getDaysInMonth(10, 2015));
		System.out.println(DateUtility.isLeapYear(2016));
		System.out.println(DateUtility.toString(8, 10, 2020, '/'));

	}

}
