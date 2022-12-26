package TeachingExercise;
import java.util.*;

public class EnhancesSwitchCase1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your choice :");
        int choice = s.nextInt();
        switch (choice){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3,4,5 ->{
                System.out.println("Was a 3 , 4 or 5");
                System.out.println("Actually it was "+choice);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 & 5");

        }
    }


}
