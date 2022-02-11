package Part1;

import java.util.Scanner;

/**
 * In the exercise template, implement a program that asks the user for the number of days. After that,
 * the program prints the number of seconds in the given number of days.
 */


public class SecondsInADay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int number = scanner.nextInt();
        int seconds = 60;
        int mins = 60;
        int hours = 24;

        int daysAsSeconds = number * (seconds * mins * hours);

        System.out.println(daysAsSeconds);


    }
}

