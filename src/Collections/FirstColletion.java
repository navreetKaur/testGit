package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FirstColletion {
	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Item: ");
			String tmp = in.next();
			if (tmp.equals("-1")) {
				break;
			}
			items.add(tmp);
		}
		Collections.sort(items);
		for(String val: items) {
			System.out.println(val);
		}
		in.close();
	}

}
