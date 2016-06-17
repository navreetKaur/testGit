package ATM;

public class Account {
	private int accountNum, pin;
	private String userName;
	private double balance;
	private int incorrectCount;
	private boolean lock;
	
	public Account(int acc, int pin, String userName, double balance, boolean lock, int incorrectCount) {
		this.accountNum = acc;
		this.pin = pin;
		this.userName = userName;
		this.balance = balance;		
		this.lock = lock;
		this.incorrectCount = incorrectCount;
	}
	
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getIncorrectCount() {
		return incorrectCount;
	}

	public void setIncorrectCount(int incorrectCount) {
		this.incorrectCount = incorrectCount;
	}

	public boolean isLock() {
		return lock;
	}

	public void setLock(boolean lock) {
		this.lock = lock;
	}


}
