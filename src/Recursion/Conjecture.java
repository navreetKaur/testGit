package Recursion;

import java.util.Scanner;

public class Conjecture {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = in.nextInt();
		collatz(num);
		in.close();
	}

	private static void collatz(int num) {
		System.out.print(num + " ");
		if (num != 1) {
			if (num%2 ==0) {
				collatz(num/2);
			} else {
				collatz(3*num +1);
			}
		}		
		
	}

}
