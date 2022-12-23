package CodingExercise;

public class Ce02SpeedConverter {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(100.4));
        System.out.println(toMilesPerHour(25.42));
        printConversion(100.4);

    }
    public static long toMilesPerHour( double kilometersPerHour){
        if(kilometersPerHour <0){
            return -1;
        }
        else {
            return (Math.round ( kilometersPerHour/1.609));
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >-0){
            System.out.println(kilometersPerHour+" km/h = "+(Math.round ( kilometersPerHour/1.609))+" mi/h");
        }
        else {
            System.out.println("Invalid Value");
        }
    }
}
