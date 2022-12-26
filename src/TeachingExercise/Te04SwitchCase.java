// TRADITIONAL SWITCH STATEMENT
package TeachingExercise;
import java.util.*;

public class Te04SwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a alphabet :");
        char charValue = s.next().charAt(0);
        switch(Character.toUpperCase(charValue)){
            case 'A':
                System.out.println("A is able" );
                break;
            case 'B':
                System.out.println("B is baler");
                break;
            case 'c':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter "+charValue+ " was not found in the switch");
                break;
        }
    }

}
