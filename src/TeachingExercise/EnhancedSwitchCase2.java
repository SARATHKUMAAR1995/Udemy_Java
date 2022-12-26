// Switch case using return type
package TeachingExercise;
import java.util.*;

public class EnhancedSwitchCase2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the month in alphabets full form:");
        String month = s.next();
        System.out.println(month+ " is "+getQuarter(month));

    }
    public static String getQuarter(String month){
        return switch (month.toLowerCase()){
            case "january", "february","march" -> "in 1st quarter";
            case "april", "may", "june"-> "in 2nd quarter";
            case "july","august","september" -> "in 3rd quarter";
            case "october", "november", "december" -> "in 4th quarter";
            default -> "a invalid value";
        };
    }
}
