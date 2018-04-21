
package guessnumber;
import java.util.Scanner;


public class GuessNumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random() * 101);
        int guess;
        do
        {
           System.out.println("Guess a secret number" + 
                   " between 0 and 100");
           guess = input.nextInt();
           if (guess == number)
           {
               System.out.println("Yes, the number is " + number);
           }
           else if (guess > number)
           {
               System.out.println("Your guess is too high");
           }
           else               
           {
               System.out.println("Your guess is too low");
           }
        } while(guess != number);
    }
    
}
