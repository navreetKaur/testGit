import java.util.Scanner;

public class SalesRecord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Customer Number: ");
		int num = in.nextInt();
		System.out.println("Enter Customer Name: ");
		String name = in.next();
		System.out.println("Enter Sales Amount: ");
		double salesAmount = in.nextDouble();
		System.out.println("Enter Tax Code: ");
		String taxCode = in.next();
		double totalAmount = 0.0;
		if (taxCode.equals("NRM")){
			totalAmount = salesAmount + salesAmount*.06;
		} else if (taxCode.equals("NPF")) {
			totalAmount = salesAmount;
		} else if (taxCode.equals("BIZ")) {
			totalAmount = salesAmount + salesAmount*.045;;
		}
		System.out.println("Customer Number\tCustomer Name\t Sales Amount\t"
				+ "Tax Code\tTotal amount\n" + num + "\t" + name + "\t" +
				salesAmount + "\t" + taxCode + "\t" + totalAmount);
		in.close();

	}

}
