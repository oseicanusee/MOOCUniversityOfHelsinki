package Part1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Number " + 2 + " is even");
        } else {
            System.out.println("Number " + number + " is odd");
        }
    }
}
