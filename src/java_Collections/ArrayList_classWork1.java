package java_Collections;

import java.util.ArrayList;

public class ArrayList_classWork1 {

//Write an ArrayList which store {100.00 ,90.00 , 85.00, 120.00, 95.00}  Salary …
//For example:

//Result
//[100.0, 90.0, 85.0, 120.0, 95.0]
//Size now: 5

	public static void main(String[] args) {
ArrayList<Double> salary = new ArrayList<Double>();
		
		salary.add(100.00);
		salary.add(90.00);
		salary.add(85.00);
		salary.add(120.00);
		salary.add(95.00);
		System.out.println(salary);
		System.out.println("Size: "+salary.size());
		

	}

}
