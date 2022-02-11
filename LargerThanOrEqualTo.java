package Part1;

import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Give the second number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println("Greater number is: " + number1);
        } else {
            System.out.println("Greater number is: " + number2);
        }

        scanner.close();
    }
}
