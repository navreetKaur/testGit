package BubbleSort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		System.out.println("Please enter numbers separated by space");
		String[] inp = in.nextLine().split(" ");
		int[] x = new int[inp.length];
		int k=0;
		for(String i: inp) {
			x[k] = Integer.parseInt(i);
			k++;
		}
		
	    for(int i = 0; i<x.length; i++) {
	    	for (int j = 0; j< x.length-i-1; j++) {

                if (x[j] > x[j + 1]) {
                	int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
             
	    	}
	           
	    }
	            
	       in.close();
	       for(int i: x) {
				System.out.print("-" + i);
			}

	}

}
