package ExceptionHandling;

import java.util.Scanner;

public class InvoiceApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
		double rates[] = new double[50];int i=0;
		
		System.out.println("Enter Tax rate:");
		double TaxRate = in.nextDouble();
		double total = 0.0;
		while (true) {
			System.out.println("Enter Price:");
			double tmp = in.nextDouble();
			if (tmp == 0.0) {
				break;
			}
			rates[i] = tmp;
			i++;
			total += tmp;
		}
		System.out.printf("Tax rate?: %.02f", TaxRate);
		System.out.println();
		for (int k =0; k< i; k++) {
			System.out.println("Price # " + (k+1) + " " + rates[k]);
		}
		System.out.println("--------------------------------------------");
		System.out.println("Receipt");
		for (int k =0; k< i; k++) {
			System.out.printf("%.02f", rates[k]);
			System.out.println();
		}
		System.out.printf("%.02f SubTotal", total);
		System.out.println();
		System.out.printf("%.03f total Tax", (total*TaxRate));
		System.out.println();
		System.out.printf("%.02f Grand Total", (total+(total*TaxRate)));
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception thrown");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception thrown");
		} catch (ArrayStoreException e) {
			System.out.println("Array Store Exception thrown");
		} catch (ClassCastException e) {
			System.out.println("Class Cast Exception thrown");
		}  catch (IllegalThreadStateException e) {
			System.out.println("Illegal Thread State Exception thrown");
		}  catch (NumberFormatException e) {
			System.out.println("Number Format Exception thrown");
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal Argument Exception thrown");
		} catch (IllegalMonitorStateException e) {
			System.out.println("Illegal Monitor State Exception thrown");
		} catch (IllegalStateException e) {
			System.out.println("Illegal State Exception thrown");
		}  catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out Of Bounds thrown");
		}  catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bounds Exception thrown");
		} catch (NegativeArraySizeException e) {
			System.out.println("Negative Array Size Exception thrown");
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception thrown");
		} catch (SecurityException e) {
			System.out.println("Security Exception thrown");
		} catch (UnsupportedOperationException e) {
			System.out.println("Unsupported Operation Exception thrown");
		} /*catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exception thrown");
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone Not Supported Exceptionthrown");
		} catch (IllegalAccessException e) {
			System.out.println("Illegal Access Exception thrown");
		} catch (InstantiationException e) {
			System.out.println("Instantiation Exception thrown");
		}catch (InterruptedException e) {
			System.out.println("Interrupted Exception thrown");
		} catch (NoSuchFieldException e) {
			System.out.println("No Such Field Exception thrown");
		} catch (NoSuchMethodException e) {
			System.out.println("No Such Method Exception thrown");
		}*/ catch (Exception e) {
			System.out.println("General Exception thrown");
		} finally {
			in.close();
		}
	}

}
