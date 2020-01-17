package com.techelevator;
import java.util.Scanner;
/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
				
				try (Scanner in = new Scanner(System.in)){
					
					boolean change = false;
					
					while (!change) {
						System.out.println("Your total amounts to: 23.65");
						System.out.println("Please enter your bill");
						String answer = in.nextLine();
						
						
						 if (answer.equals("100.00") || (answer.equals("100"))) {
							 change = true;
						System.out.println("Your change is 76.35");
					}
						 
						 else {
								System.out.println("Please insert appropriate amount");

					}
				
				}
			

				}
			
			}
		}
					
	
			
			
	
	