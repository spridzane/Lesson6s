package com.Lesson6s;
/**
 Problem 2
 GuessApp2
 uses the instantiable class GuessNumber
 allows the user to guess the number. User can enter the guess number!
 */
import java.util.Scanner;
public class GuessApp2 {
    public static void main(String[] args) {
        int guess = 0;
        Scanner input = new Scanner(System.in);

        GuessNumber checker = new GuessNumber();
        int s = checker.getSecret();

        while(guess != s){
            System.out.println("Please enter to guess the number: ");
            guess = input.nextInt();
            checker.setGuess(guess);
            checker.compute();

            String m = checker.getMessage();
            System.out.println(m);

        }
        System.out.println("Congrats! Secret number is " + s);
    }//end main
}//end class

