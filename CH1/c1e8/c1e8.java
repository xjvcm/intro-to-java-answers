/**
 * Write a program that displays the area and perimeter of a circle that
 * has a radius of 6.5 using the following formula:
 * 
 * PI = 3.14159
 * perimeter = 2 * radius * PI
 * area = radius * radius * PI
 */

/**
 * c1e8
 */
public class c1e8 {
    public static void main(String[] args) {
        // Delcare variables
        final double PI = 3.14159;

        double perimeter, radius = 6.5, area;

        perimeter = 2 * radius * PI;
        area = radius * radius * PI;

        System.out.println("The area of a circle with a radius of " +
            radius + " and an area of " + area);
    }
}