/**
 *  (Convert mile to kilometer) Write a program that reads a mile in a 
 * double value from the console, converts it to kilometers, and displays 
 * the result. 
 * The formula for the conversion is as follows: 1 mile = 1.6 kilometers
 */

import java.util.Scanner;

/**
 * c2e1
 */
public class c2e1 {

    public static void main(String[] args) {
        // Declare constant
        final double MILE_TO_KILOMETERS = 1.6;

        double miles, kilometers;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
        miles = input.nextDouble();

        kilometers = miles * MILE_TO_KILOMETERS;

        System.out.printf("%.0f miles is %.1f kilometers%n", miles, kilometers);
    }
}