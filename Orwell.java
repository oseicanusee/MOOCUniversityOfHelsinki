package Part1;

import java.util.Scanner;

/**
 *
 * Write a program that prompts the user for an integer and
 * prints the string "Orwell" if the number is exactly 1984.
 */
public class Orwell {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = scanner.nextInt();

        if (number == 1984){
            System.out.println("Orwell");
        }

        scanner.close();
    }


}
