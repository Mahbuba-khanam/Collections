package java_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArratList_Assending {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(5);
		n.add(7);
		n.add(9);
		n.add(6);
		n.add(1);
		System.out.println("Before Assending = "+n);
		// In ArrayList we need to use Collection method to sort the numbers.
		Collections.sort(n);
		System.out.println(n);


	}

}
