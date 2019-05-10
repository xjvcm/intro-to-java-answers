/**
 * Write a program that displays the area and perimeter of a rectangle with
 * a width of 5.3 and height of 8.6 using the following formula:
 * 
 * area = width * height
 * perimeter = 2 * (width + height)
 */

/**
 * c1e9
 */
public class c1e9 {
    public static void main(String[] args) {
        // Declare Variables
        double area, perimeter, width, height;

        width = 5.3;
        height = 8.6;

        area = width * height;
        perimeter = 2 * (width + height);

        System.out.println("A rectable with a width of 5.3 and height of 8.6");
        System.out.println("Has an area of " + area);
        System.out.println("Has an perimeter of " + perimeter);
    }
}