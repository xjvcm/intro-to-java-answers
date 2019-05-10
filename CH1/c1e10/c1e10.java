/**
 * Assume that a runner runs 15 kilometers in 50 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour. 
 * (Note that 1 mile is 1.6 kilometers.)
 */

/**
 * c1e10
 */
public class c1e10 {
    public static void main(String[] args) {
        // Declare variables
        final double KM_IN_MILES = 1.6;
        final double MINS_IN_HOUR = 60;
        final double SECONDS_IN_HOUR = 3600;

        double runnerTotalMiles, runnerTotalTimeInHours, runnerMPH;

        runnerTotalMiles = 15 / KM_IN_MILES;
        runnerTotalTimeInHours = (50 / MINS_IN_HOUR) + 
            (30 / SECONDS_IN_HOUR);

        runnerMPH = runnerTotalMiles / runnerTotalTimeInHours;

        System.out.printf("The runners average speed is %.2f miles per " +
            "hour.", runnerMPH);
    }
}