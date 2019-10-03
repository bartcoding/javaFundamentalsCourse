package be.intecbrussel.programming_language.exercises;

import java.util.Random;
import java.util.Scanner;

public class HigherLower {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random randomNumberGenerator = new Random();
        int numberToGuess = randomNumberGenerator.nextInt(100);
        System.out.println("enter a number:");
        boolean guessed = false;
        while(!guessed){
            int guess = keyboard.nextInt();
            if(guess<numberToGuess){
                System.out.println("higher!");
            }
            else if( guess>numberToGuess){
                System.out.println("lower!");
            }
            else{
                System.out.println("you got it!");
                guessed = true;
            }



        }


    }

}
