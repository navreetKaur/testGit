package Switch;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome! Enter Number of days");
		int month = in.nextInt();
        String monthName;
        switch (month) {
            case 30:  monthName = "September April June November";
                     break;
            case 31:  monthName = "January March May July August October December";
                     break;
            case 28:  monthName = "February";
                     break;
            case 29:  monthName = "February in Leap Year";
                     break;
            default: monthName = "No months have exactly "  + month + " days.";
                     break;
        }
        System.out.println(monthName);
        in.close();
	}

}
