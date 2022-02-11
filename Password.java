package Part1;

import java.util.Scanner;

/**
 * Write a program that prompts the user for a password. If the password is "Caput Draconis"
 * the program prints "Welcome!". Otherwise, the program prints "Off with you!"
 */
public class Password {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password? ");
        String password = scanner.nextLine();

        if (password.equalsIgnoreCase("Caput Draconis")){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
