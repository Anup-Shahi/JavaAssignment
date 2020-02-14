package Week4;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	public static void main(String[] args) {
		int numGussed,numToGuess,numofattempt=0;
		boolean win =false;
		Random rand=new Random();
		numToGuess=rand.nextInt(30000);
                //numToGuess=2;
		Scanner input=new Scanner(System.in);
		
		          //System.out.println(numToGuess);
		while (win==false) {
			System.out.println("Guess a Number between 1 to 30000");
			numGussed=input.nextInt();
			numofattempt++;
                        System.out.println(numGussed);
			if(numGussed>30000 || numGussed<0) {
				System.out.println("Number is above the limit");
			}
			else {
			if(numGussed == numToGuess) {
				win=true;
			}
			else if(numGussed<numToGuess) {
				System.out.println("Number is below the Guessed number");
			}
			else if(numGussed>numToGuess) {
				System.out.println("Number is greater than Guessed number");
			}
			}
		}
		
		System.out.println("You Won!");
		System.out.println("The number is" +numToGuess);
		System.out.println("You have completed in "+numofattempt+"tries");
        
	}

}
