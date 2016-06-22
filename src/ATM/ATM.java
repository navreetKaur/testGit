package ATM;

import java.util.Scanner;

public class ATM {
	
	public void promptUser(String message) {
		System.out.println(message);
	}
	public String getInput(Scanner in) {
		String input = in.next();
		return input;
	}
	public boolean validate (Account account, int pin) {
		return (account.getPin() == pin);
	}

}
