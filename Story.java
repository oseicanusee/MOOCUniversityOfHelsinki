package Part1;

import java.util.Scanner;

/**
Write a program that asks the user for a character's name and their job.
 The program then prints a short story.
 The output must be as shown below — note, the name and job depend on the user's input.
 Sample output
 I will tell you a story, but I need some information first.
 What is the main character called?
 Bob
 What is their job?
 a builder
 Here is the story:
 Once upon a time there was Bob, who was a builder.
 On the way to work, Bob reflected on life.
 Perhaps Bob will not be a builder forever.
 */

public class Story {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first");

        System.out.println("What is the main character called?");
        String mainCharacter = scanner.nextLine();

        System.out.println("What is their job?");
        String job = scanner.nextLine();

        System.out.println("Here is the story: ");
        System.out.println("Once upon a time there was " + mainCharacter + ", who was a " + job + ".");
        System.out.println("On the way to work, " + mainCharacter + " reflected on life");
        System.out.println("Perhaps " + mainCharacter + " will not be a " + job + " forever.");



    }
}
