package CodingExercise;

public class Ce05LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(-1752));
        System.out.println(isLeapYear(1846));

    }

    public static boolean isLeapYear(int year) {
        return ((year >= 1 && year <= 9999) &&
                ((year % 400 == 0 && (year % 100 == 0)) || ((year % 100 != 0) && (year % 4 == 0))));
    }
}
