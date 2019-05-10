/** (Population projection) The U.S. Census Bureau projects population 
 * based on the following assumptions:
 *     One birth every 7 seconds
 *     One death every 13 seconds
 *     One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five 
 * years. Assume that the current population is 312,032,486, and one year 
 * has 365 days. Hint: In Java, if two integers perform division, the 
 * result is an integer. The fractional part is truncated. For example, 
 * 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate 
 * result with the fractional part, one of the values involved in the 
 * division must be a number with a decimal point. For example, 5.0 / 4 
 * is 1.25 and 10 / 4.0 is 2.5 .
 */

/**
 * c1e11
 */
public class c1e11 {

    public static void main(String[] args) {
        // Delcare constants
        final double BIRTHS_PER_SECOND = 7.0;
        final double DEATHS_PER_SECOND = 13.0;
        final double IMMIGRANTS_PER_SECOND = 45.0;
        final double CURRENT_POPULATION = 312032486;
        final double DAYS_IN_YEAR = 365;
        final double HOURS_IN_DAY = 24;
        final double MINUTES_IN_HOUR = 60;
        final double SECONDS_IN_MINUTES = 60;

        final double SECONDS_IN_YEAR = DAYS_IN_YEAR * HOURS_IN_DAY * 
            MINUTES_IN_HOUR * SECONDS_IN_MINUTES;

        final double BIRTHS_DEATHS_IMMIGRANTS_IN_A_YEAR = (SECONDS_IN_YEAR 
            / BIRTHS_PER_SECOND) - (SECONDS_IN_YEAR / DEATHS_PER_SECOND) + 
            (SECONDS_IN_YEAR / IMMIGRANTS_PER_SECOND);

        double yearOne, yearTwo, yearThree, yearFour, yearFive;

        yearOne = CURRENT_POPULATION + BIRTHS_DEATHS_IMMIGRANTS_IN_A_YEAR;
        System.out.println("Year one: " + yearOne);
        yearTwo = yearOne + BIRTHS_DEATHS_IMMIGRANTS_IN_A_YEAR;
        System.out.println("Year two: " + yearTwo);
        yearThree = yearTwo + BIRTHS_DEATHS_IMMIGRANTS_IN_A_YEAR;
        System.out.println("Year three: " + yearThree);
        yearFour = yearThree + BIRTHS_DEATHS_IMMIGRANTS_IN_A_YEAR;
        System.out.println("Year four: " + yearFour);
        yearFive = yearFour + BIRTHS_DEATHS_IMMIGRANTS_IN_A_YEAR;
        System.out.println("Year five: " + yearFive);





    }
}