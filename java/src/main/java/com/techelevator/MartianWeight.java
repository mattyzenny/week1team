package com.techelevator;
import java.util.Scanner;
/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
//SPLIT COMMAND// //EACH ONE MUST BE PARSED INTO NUMERIC VALUE AND THEN OUT//
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
 try (Scanner scanner = new Scanner(System.in)) {
		 
	boolean problemSolve = true;
		while(problemSolve) {
			
			System.out.println("Enter your weight: ");
			String value = scanner.nextLine();
			
			 int weightToConvert = Integer.parseInt(value);
			
			System.out.println("Enter (e) for weight on earth, (m) for weight on mars: ");

			String placeOfConversion = scanner.nextLine();
			
			if (placeOfConversion.equalsIgnoreCase("e")) {
				float weight = weightToConvert * .378f;
				System.out.println("your weight is: " + ((int)weight));
			}
			else if (placeOfConversion.equalsIgnoreCase("m")) {
				float weight = weightToConvert /.378f;
				System.out.println("your weight is: " + ((int)weight));
			}
			else {
				System.out.println("Try AGAIN!!");
			}
			
		}
		
		
 }
		
	}

}


//while on mars.....if mars weight = X, earth weight = Y//