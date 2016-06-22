package Recursion;

public class Fibnocci {
	public static void main(String[] args) {
		System.out.print(1 + " " + 1);
		fibnocci(1,1,2);
	}

	private static void fibnocci(int i, int j, int count) {
		System.out.print(" " + (i+j));
		count++;
		if (count <=20)
			fibnocci (j, i+j, count);		
			
	}

}
