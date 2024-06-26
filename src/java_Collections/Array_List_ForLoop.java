package java_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_ForLoop {

	public static void main(String[] args) {
		ArrayList<String> cars3 = new ArrayList<String>();
		cars3.add("Volvo");
		cars3.add("BMW");
		cars3.add("Ford");
		cars3.add("Mazda");
		cars3.add("Abc");
	//	for (String i : cars3) {
	//		System.out.println(i);
	//	}
		
		boolean check=cars3.isEmpty();
		System.out.println("Checking The Value ="+check);
//		System.out.println("size "+cars3.size()); 
		cars3.remove(0);
		System.out.println("Removeing value "+cars3);
		//cars3.removeAll(cars3);
	//	System.out.println("Removing all "+cars3);
		
		

		// Iterator <String> iterator = cars3.iterator();
		// while(iterator.hasNext()) {
		// String i = iterator.next();
		// System.out.println(i);
		// }
	}

}
