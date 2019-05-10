/** (Average speed in kilometers) Assume that a runner runs 24 miles in 1 
 * hour, 40 minutes, and 35 seconds. Write a program that displays the 
 * average speed in kilometers per hour. 
 * (Note 1 mile is equal to 1.6 kilometers.)
 */

/**
 * c1e12
 */
public class c1e12 {

    public static void main(String[] args) {
        // Declare constants
        final double KM_IN_MILES = 1.6;
        final double MINUTES_IN_HOUR = 60;
        final double SECONDS_IN_HOUR = 3600;

        double runnerMiles, runnerHours, runnerKMPH;

        runnerMiles = (24 * KM_IN_MILES);
        runnerHours = 1 + (40 / MINUTES_IN_HOUR) + (35 / SECONDS_IN_HOUR);
        runnerKMPH = runnerMiles / runnerHours;

        System.out.printf("Runner's average speed in kilometers is %.2f",
            runnerKMPH);
    }
}