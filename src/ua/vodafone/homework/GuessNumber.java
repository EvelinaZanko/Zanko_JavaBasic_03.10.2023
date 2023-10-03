package ua.vodafone.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Hi! Welcome to Guess the Number!");
        System.out.println("I'm guessing a number between 1 and 10. You have three tries. What number did I guess?");



        int minValue = 0;
        int maxValue = 11;
        int randomNumber = ThreadLocalRandom.current().nextInt(minValue, maxValue);


        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            int decision = scanner.nextInt();

            if (decision != randomNumber) {
                System.out.println("You didn't right.");

            } else {
                System.out.println("You're right. Congratulations!");
                break;

            }
        }

        System.out.println("I hope you enjoyed the game.");

    }
}


