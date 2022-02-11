package Part1;

import java.util.Scanner;

/**
 Write a program that asks the user for an integer and prints the
 string "Speeding ticket!" if the input is greater than 120.
 */
public class SpeedingTicket {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed: ");
        int number = scanner.nextInt();

        if (number > 120){
            System.out.println("Speeding ticket!");
        }

     scanner.close();
    }
}
