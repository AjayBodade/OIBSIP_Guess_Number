import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Guessing_game
{
	public static void main(String[] args)
    {
    int answer;
	int guess;
	int score =100;
	int noofguess =0;

	final int MAX = 100;      //Giving maximum limit to the number  i.g. not exceed 100 
	Scanner sc = new Scanner(System.in);
  	Random rand = new Random();
	boolean correct = false;
	answer = rand.nextInt(MAX) + 1;
	while (!correct) 
		{
  			System.out.println("\nGuess a number between 1 and 100.");

			guess = sc.nextInt();
			noofguess = noofguess +1;

            if (guess > answer)   //if the guess is Greater than answer then below part will display on screen.
			{
            	System.out.println("Entered number is large .");
            }

  			else if (guess < answer)   //if the guess is Less  than answer then below part will display on screen.
			{
            	System.out.println("Entered number is small.");
            }

			else   // this part will display if and only if guess and the answer is matched.
			{
                System.out.format("Yes, your guess is correct...!! \n It was %d\n you guess in %d attempts. \n Your score is %d\n" ,answer, noofguess, score);
  				correct = true;
            }
			score = score -5;
        }	
        System.exit(0);
    }
}
