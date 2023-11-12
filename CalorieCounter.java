import java.util.*;

// -- Cory Burns --
// -- Maintenance / Calorie Tracker --

public class CalorieCounter {
    public static void calorieTrack(Scanner console, int multiplier) {

        int sum = 0;

        System.out.println("Enter your weight: ");
            int weight = console.nextInt();
            int maintenance = weight * multiplier;

        System.out.println("Are you cutting / maintaining / bulking?: ");
            String threeChoices = console.next();

            if(threeChoices.equalsIgnoreCase("cutting")) {
                sum = maintenance - 500;
                System.out.println("Caloric intake for a cut: " + sum);
            }
            else if(threeChoices.equalsIgnoreCase("maintaining")) {
                sum = maintenance;
                System.out.println("Caloric intake for maintenance: " + sum);
            }
            else {
                sum = maintenance + 500;
                System.out.println("Caloric intake for a bulk: " + sum);
            }
    }


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        calorieTrack(console, 15);
    }
}
