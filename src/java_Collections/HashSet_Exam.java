package java_Collections;

import java.util.HashSet;

public class HashSet_Exam {

	public static void main(String[] args) {

		// HashSet is a list of unique elements (does not allow duplicate)
		// ArrayList is a list of non-Unique elements
		
		HashSet<String> prodName;
		prodName = new HashSet<String>();

		prodName.add("pencil");
		prodName.add("pen");
		prodName.add("book");
		prodName.add("stapler");
		prodName.add("book");
		System.out.println(prodName.size());
		System.out.println(prodName);
		// Find book in HashSet
		// for(String s:prodName) {
		// if(s == "book") {
		// System.out.println(s+" Found");

		// }
		if (prodName.contains("book")) {
			System.out.println("book Found");
			
		}
		System.out.println(prodName.contains("book"));
		System.out.println(prodName.contains("books"));
		// Remove element
		prodName.remove("stapler");
		System.out.println(prodName);

	}

}
