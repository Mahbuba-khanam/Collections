package java_Collections;

import java.util.ArrayList;

public class Collection_HW {

	public static void main(String[] args) {
		ArrayList<Integer> car = new ArrayList<Integer>();
		car.add(10); 
		car.add(20); 
		car.add(30); 
		car.add(40); 
		car.add(40); 
		car.add(50); 

		for (int i = 0; i <car.size(); i++) {
			int price = car.get(i);
			if (price == 40) { 
				System.out.println(price + " Found");
			}
		}
		System.out.println("Price is = 40 ");
		for (int i = 0; i < car.size(); i++) {
			int price = car.get(i);
			if (price == 20) { 
				System.out.println(price + " Found");
			}
		}
		
		
		System.out.println("price is >= 40 ");
		for (int i = 0; i < car.size(); i++) {
			int price = car.get(i);
			if (price >= 40) { 
				System.out.println(price + " Found");
			}
		}

	}

}
