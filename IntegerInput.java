package Part1;

import java.util.Scanner;

/**
 * Write a program that asks the user for a value.
 * The program should then print the value provided by the user.
 *  Here's a couple of examples:
 *
 */

public class IntegerInput {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = scanner.nextInt();

        System.out.println("You gave a number " + number);

        String numberAsString = "42.42";
        double value = Double.valueOf(numberAsString);

        System.out.println(value);



    }
}
