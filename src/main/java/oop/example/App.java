/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rielly Donnell
 */

package oop.example;

import java.util.Scanner;

/**
 Exercise 8 - Pizza Party
 Division isn’t always exact, and sometimes you’ll write programs that will
 need to deal with the leftovers as a whole number instead of a decimal.

 Write a program to evenly divide pizzas. Prompt for the number of people,
 the number of pizzas, and the number of slices per pizza. Ensure that the
 number of pieces comes out even. Display the number of pieces of pizza each
 person should get. If there are leftovers, show the number of leftover pieces.

 Example Output
 How many people? 8
 How many pizzas do you have? 2
 How many slices per pizza? 8
 8 people with 2 pizzas (16 slices)
 Each person gets 2 pieces of pizza.
 There are 0 leftover pieces.

 Challenges
 Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
 Alter the output so it handles pluralization properly, for example: "Each person gets 2 pieces of pizza." or "Each person gets 1 piece of pizza." Handle the output for leftover pieces appropriately as well.
 Create a variant of the program that prompts for the number of people and the number of pieces each person wants, and calculate how many full pizzas you need to purchase.

 */
public class App 
{
    public static void main( String[] args )
    {
     Scanner in = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = in.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas = in.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = in.nextInt();
        int tSlices = pizzas * slices;
        int slicesPP = tSlices / people;
        int leftover = tSlices % people;
        String output = String.format("%s people with %s pizzas (%s slices)\n" +
                "Each person gets %s pieces of pizza.\n" +
                "There are %s leftover pieces.", people, pizzas, tSlices, slicesPP, leftover);
        System.out.println(output);
    }
}
