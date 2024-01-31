package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your start amount, win chance, win limit?");
		double startAmount = in.nextDouble(), winChance = in.nextDouble(), winLimit = in.nextDouble();
	    double randomNumber = (Math.random()*1);
		System.out.println(randomNumber);
		int numPlays = 0; 
		double balance = startAmount;
	    System.out.println("How many simulations?");
		int totalSimulations = in.nextInt();
		int numSimulations = 1; 
	
		//while (numSimulations <= totalSimulations) {
			while (balance < winLimit) {
				if (randomNumber < winChance) {
					   System.out.println("Simulation" + numSimulations + ":" + numPlays + "LOSE");
					   balance = balance - 1; 
					   numSimulations = numSimulations + 1;
					   numPlays = numPlays + 1;
					}
				if (randomNumber > winChance) {
					System.out.println ("Simulation" + numSimulations + ":" + numPlays + "WIN"); 
					balance = balance + 1; 
					numSimulations = numSimulations + 1;
					numPlays = numPlays + 1;
				}
			}
			
			//System.out.println(numPlays); 
		}
		 
	
		
		
		
	}

//}
