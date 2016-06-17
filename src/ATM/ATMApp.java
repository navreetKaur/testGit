package ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMApp {
	static Map<Integer, Account> data = new HashMap<Integer, Account>();
	static ATM atm = new ATM();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		try {
		
		createDatabase();	
		initialize();
		atm.promptUser("Continue Press C or Exit press E");
		String input = atm.getInput(in);
		while (!input.equals("E")) {
			initialize();
			atm.promptUser("Continue Press C or Exit press E");
			input = atm.getInput(in);
		}
		atm.promptUser("Good Bye!!");
		
		} catch (NumberFormatException e) {
			System.out.println("Account number and Pin should be integers and Amount should be double");
		} catch (NullPointerException e) {
			System.out.println("Account number does not exist");
		} catch (Exception e) {
			System.out.println("Something went wrong. Please try again.");
		}

	}
	private static void initialize() throws NullPointerException, NumberFormatException, Exception{
		atm.promptUser("Please Enter your account number");
		int account = Integer.parseInt(atm.getInput(in));
		atm.promptUser("Please Enter your pin");
		int pin = Integer.parseInt(atm.getInput(in));
		Account selected = selectedAccount(account);
		if (selected.isLock()) {
			atm.promptUser("Account Locked");
		} else {
			if (atm.validate(selected, pin)) {
				atm.promptUser("What you wish to do today? Deposit(D) or Withdraw(W) or Check Balance(C)");
				String type = atm.getInput(in);
				processTransaction(type, selected);
			} else {
				atm.promptUser("Incorrect pin");
				lock(selected);
			}
		}	
		
	}
	private static void processTransaction(String type, Account selected) throws NumberFormatException, Exception{
		if (type.equals("D")) {
			atm.promptUser("Enter amount:");
			double amount = Double.parseDouble(atm.getInput(in));
			double balance = selected.getBalance();
			selected.setBalance(balance + amount);
			
		} else if (type.equals("W")) {
			atm.promptUser("Enter amount:");
			double amount = Double.parseDouble(atm.getInput(in));
			double balance = selected.getBalance();
			selected.setBalance(balance - amount);
			
		} else if (type.equals("C")) {
			atm.promptUser("Balance: " + selected.getBalance());
			
		} else {
			atm.promptUser("Incorrect Entry of Transaction Type");
		}
		
	}
	private static void lock(Account selected) throws Exception{
		int countLock = selected.getIncorrectCount();
		if (countLock == 3)
			selected.setLock(true);
		else
			selected.setIncorrectCount(countLock +1);
		
	}
	public static void createDatabase() throws Exception{
		data.put(110011, new Account(110011,101,"Navreet",10000.5,false,0));
		data.put(120011, new Account(120011,121,"Kaur",1200.5,false,0));
		data.put(130011, new Account(130011,131,"Hello",16000.5,false,0));
	}
	public static Account selectedAccount(int account) throws Exception{
		return data.get(account);
	}

}
