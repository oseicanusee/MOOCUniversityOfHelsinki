package Part1;


import java.util.Scanner;

/**
 *
 * Write a program that prompts the user for an integer
 * and informs the user whether or not it is positive (greater than zero).
 */
public class Positivity {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("The number is positive");
        }  else if (number == 0){
            System.out.println("You entered 0");

        } else {
            System.out.println("The number is negative.");
        }

        scanner.close();
    }

}
