package java_Collections;

import java.util.ArrayList;
//cont+alt+(dowm arrow)
public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> empNames;
		empNames = new ArrayList<String>();
		System.out.println(empNames.size());
		empNames.add("Joe");
		empNames.add("Maria");
		empNames.add("Karim");
		empNames.add("Mina");
		System.out.println("Size now: " + empNames.size());
		// empNames.add("Rahim");
		empNames.add(3, "Rahim");
		System.out.println(empNames);
		// remove
		empNames.remove(2);
		System.out.println(empNames);
		// remove obj
		empNames.remove("Rahim");
		System.out.println(empNames);

		// remove all
		ArrayList<String> name;
		name = new ArrayList<String>();

		name.add("Maria");
		System.out.println(name);

		empNames.removeAll(name);
		System.out.println("Remove for Data: " + empNames);

		// For each loop
		for (String n : empNames) {
			if (n == "Mina")
				System.out.println("Ex Employee");

		}

	}

}
