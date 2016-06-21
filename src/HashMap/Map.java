package HashMap;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Map {
	public static void main(String[] args) {
		
		try {
			HashMap<Integer, String> myMap = new HashMap<Integer, String>();
			
			File file = new File("map.txt");
            Scanner scannerInput = new Scanner(file);
            while (scannerInput.hasNextLine()) {
                String line = scannerInput.nextLine();
                String[] sp = line.split(" ");
                myMap.put(Integer.parseInt(sp[0]), sp[1]);
            }
            scannerInput.close();
			Scanner in = new Scanner (System.in);
			
			while (true) {
				System.out.println("Enter a number or -1 to stop: ");
				int num = in.nextInt();
				if (num == -1)
					break;
				if (myMap.get(num) != null) 
					System.out.println("You entered " + myMap.get(num));
				else {
					System.out.println("Enter description for number : ");
					myMap.put(num,in.next());
				}
			}
			
		  
			in.close();
			for (Integer key : myMap.keySet()) {
				System.out.println("Key = " + key + " Desc = " + myMap.get(key));
			}
		}  catch (Exception e) {
			System.out.println("Something wrong");
		}
	    
	}
	

}
