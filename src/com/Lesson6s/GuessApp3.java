package com.Lesson6s;
/**
 Problem 3
 GuessApp3
 uses the instantiable class GuessNumber
 allows the user to guess the number, and then ask the user whether would they like to guess again.
 If they answer yes, the application should run again, if they answer no, the application should end.
 */
import java.util.Scanner;
public class GuessApp3 {
    public static void main(String args[]) {
        //declare a local variables
        int guess = 0;
        String ans = "yes";

        Scanner input = new Scanner(System.in);
        GuessNumber checker = new GuessNumber();
        int s = checker.getSecret();
        while(ans.equals("yes")){
            System.out.println("Please enter number to guess: ");
            guess = input.nextInt();
            checker.setGuess(guess);

            //processing
            checker.compute();
            String m = checker.getMessage();
            System.out.println(m);

            if (m.equals("congrats")) {
                break;
            }

            System.out.println("Do you want to guess again?");
            ans = input.next();
            ans = ans.toLowerCase();
        }//end while
        System.out.println("Secret number is " + s);

    }//end main
}//end class

