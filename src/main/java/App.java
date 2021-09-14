import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int z = scanner.nextInt();
        if (x == y || x == z || y == z) {
            System.out.println("The numbers are not unique.");
            return;
        }
        int largest = x;
        if (y > x) {
            if (z > y) {
                largest = z;
            } else {
                largest = y;
            }
        } else if (z > x) {
            largest = z;
        }
        System.out.println("The largest number is " + largest + ".");
    }
}