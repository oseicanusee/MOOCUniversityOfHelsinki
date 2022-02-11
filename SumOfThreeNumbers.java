package Part1;

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a first number: ");
        int number = scanner.nextInt();

        System.out.println("Give a second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Give a third number: ");
        int num3 = scanner.nextInt();

        System.out.println("The sum of the numbers is " + (number + num2 + num3));
    }
}
