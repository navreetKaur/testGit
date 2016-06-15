package GradeBook;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GradeBook {
	static double average = 0; 
	static List<String> names = new ArrayList<String>();
	static List<String> grade = new ArrayList<String>();
	static List<String> gender = new ArrayList<String>();
	static List<String> major = new ArrayList<String>();
	static List<String> stateOfOrigin = new ArrayList<String>();
	static List<Integer> score = new ArrayList<Integer>();
	static int countM =0;
	static int countF =0;
	static int countMD =0;
	static int countDC =0;
	static int countVA =0;
	static int countE =0;
	static int countC =0;
	static int countEE =0;
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome! Enter details or "
				+ "request report at any time by entering R");
		System.out.println("Please enter Name/ R for report");
		String tmp = in.next(); int k = 0;
		if (tmp.equals("R")) report();
		int sum = 0;
		while (tmp  != null) {
			names.add(k, tmp);
			System.out.println("Please enter Grade A/B/C");
			tmp = in.next();
			grade.add(k, tmp);
			System.out.println("Please enter Gender M/F");
			tmp = in.next();
			gender.add(k, tmp);
			if (tmp.equals("M")) countM++;
			else countF++;
			System.out.println("Please enter Major Econ/CS/EE");
			tmp = in.next();
			major.add(k, tmp);
			if (tmp.equals("Econ")) countE++;
			else if (tmp.equals("CS")) countC++;
			else countEE++;
			System.out.println("Please enter State Of Origin");
			stateOfOrigin.add(k, in.next());
			if (tmp.equals("MD")) countMD++;
			else if (tmp.equals("DC")) countDC++;
			else countVA++;
			System.out.println("Please enter Score");
			int x = in.nextInt();
			score.add(k, x);
			sum += x;
			System.out.println("Please enter Name/ R for report");
			tmp = in.next();
		}
		average = sum/names.size();
		report();
		in.close();
		
	}

	private static void report() {
		System.out.println("Report Date:" + new SimpleDateFormat("MM/dd/yyyy").format(new Date()));
		System.out.println("Number of Students: " + names.size());
		System.out.println("Overall Average: " + average);
		if (countM>countF) {
			System.out.println("Average for Gender is M");
		} else {
			System.out.println("Average for Gender is F");
		}
		if (countE>countC && countE>countEE) {
			System.out.println("Average for Major is Econ");
		} else if (countC>countE && countC>countEE){
			System.out.println("Average for Major is CS");
		} else {
			System.out.println("Average for Major is EE");
		}
		if (countMD>countDC && countMD>countVA) {
			System.out.println("Average for State is MD");
		} else if (countDC>countMD && countDC>countVA){
			System.out.println("Average for Major is DC");
		} else {
			System.out.println("Average for Major is VA");
		}
		
		
	}

}
