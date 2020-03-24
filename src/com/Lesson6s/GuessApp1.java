package com.Lesson6s;
/*
GuessApp
Lets use GuessNumber as instantiable class, to calculate the users guess number.
Number of guess: 3
 */

import java.util.Scanner;
public class GuessApp1 {

    public static void main(String args[]) {
        int guess;
        Scanner input = new Scanner(System.in);
        GuessNumber checker = new GuessNumber();

        for (int i = 0; i < 3; i++){
            //input
            System.out.println("Enter to guess the number: ");
            guess = input.nextInt();
            checker.setGuess(guess);

            //processing
            checker.compute();

            //output
            String m = checker.getMessage();
            System.out.println(m);

            if (m.equals("congrats")){
                break;
            }
        }//end for

        int s = checker.getSecret();
        System.out.println("secret: " + s);



    } //end main
} //end class
