package java_Collections;

public abstract class Scalar_variable {

	public static void main(String[] args) {
	//	Array is not resizeable; Array List is resizeable.
	//	Array = For loop
	//	Array List = For each loop
		
		int number = 5;
		System.out.println(number);
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

	/*	System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		System.out.println(cars[4]);*/
		
	//	System.out.println(cars[0]+" "cars[1]+cars[2]+cars[3]);
		System.out.println(cars[0]+ " , "+cars[1]+ " , "+cars[2]+ " , "+cars[3]);
		
		for(int r=0; r<cars.length; r++) {//outer loop - Row 
			
				System.out.print(cars[r]+" ");
				
				
			}
			
		}
	
}