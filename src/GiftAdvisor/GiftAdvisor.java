package GiftAdvisor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GiftAdvisor {
	public static void main(String[] args) {
		Map<String,Map<String,String>> giftTable = new HashMap<String,Map<String,String>>();
		Map<String,String> femalePrice = new HashMap<String,String>();
		femalePrice.put("High", "Jwellery or Weekend Getaway");
		femalePrice.put("Low", "Wine or Selfie Stick");
		femalePrice.put("Medium", "Perfume or Sweater");
		Map<String,String> malePrice = new HashMap<String,String>();
		malePrice.put("High", "Smart TV or Apple Watch");
		malePrice.put("Low", "Books or Shoes");
		malePrice.put("Medium", "Guitar or Play Station");
		giftTable.put("Female", femalePrice);
		giftTable.put("Male", malePrice);
		Scanner in = new Scanner(System.in);
		System.out.println("Who are you picking gift for? Male or Female");
		String gender = in.next();
		System.out.println("What's you price range? Low or Medium or High");
		String price = in.next();
		System.out.println(giftTable.get(gender).get(price));
		in.close();
	}
	

}
