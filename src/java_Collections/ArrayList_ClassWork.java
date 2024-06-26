package java_Collections;

import java.util.ArrayList;

public class ArrayList_ClassWork {
//	Write a code that  create ArrayList which elements are:{34,56,801,670,5600, 150,142,2390,76}
//	print “small number” for 0<number<=100
//	print “medium number” for   100<number<=1000
//	print “large number” 1000<number

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(34);
		num.add(56);
		num.add(801);
		num.add(670);
		num.add(5600);
		num.add(150);
		num.add(142);
		num.add(2390);
		
		num.add(76);
		
		System.out.println(num);
		System.out.println("Size: "+ num.size());
		for(int n:num) {
			if(n>0 && n<=100) {
				System.out.println(n +" small number");
			}
		}
		for(int n:num) {
			if(n>100 && n<=1000) {
				System.out.println(n +" medium number");
			}
		}
		for(int n:num) {
			if(n>100 && n<=1000) {
				System.out.println(n +" medium number");
			}else
				System.out.println(n +" large number");
		}
		
		
		

	}

}
