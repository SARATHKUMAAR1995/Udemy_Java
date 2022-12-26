package TeachingExercise;

import java.util.*;

public class Te05SwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        int day = s.nextInt();
        printDayOfWeek(day);
    }

    public static void printDayOfWeek(int day) {
        // below code (or) System.out.println(day+" stands for "+switch(day))
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
