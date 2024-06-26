package java_Collections;

import java.util.HashMap;

public class HashMap_Example {

	public static void main(String[] args) {

		HashMap<String, String> empRecord;
		empRecord = new HashMap<String, String>();

		empRecord.put("name", "Joe");
		empRecord.put("phone", "999");
		empRecord.put("email", "Joe@gmail.com");
		// getRecord
		System.out.println(empRecord.get("name"));
		System.out.println(empRecord.get("phone"));
		// Size
		System.out.println(empRecord.size());
		// Remove record
		empRecord.remove("phone");
		System.out.println(empRecord.size());
		// All record clear
		empRecord.clear();
		System.out.println(empRecord.size());

	}

}
