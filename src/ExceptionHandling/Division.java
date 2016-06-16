package ExceptionHandling;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		 
		  int a, b, result;
		 
		  Scanner input = new Scanner(System.in);
		  System.out.println("Input two integers");
		 
		  a = input.nextInt();		  
		  try {
			  b = input.nextInt();
			  if (b==0) {
				  throw new Exception("Division by zero not possible");
			  }
			  result = a / b; 
			  System.out.println("Result = " + result);
			  input.close();
		  } catch (Exception e) {
			  System.out.println(e.getMessage());
		  } finally {
			input.close();
		}
		  
		 
		  
		  }

}
