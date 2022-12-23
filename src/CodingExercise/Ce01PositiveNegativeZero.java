package CodingExercise;

public class Ce01PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(-10);
        checkNumber(0);

    }

    public static void checkNumber(int number) {
        // instead of method we can use this type also
        System.out.println((number >0)?"positive" :(number<0)?"negative":"zero");


//        if (number > 0) {
//            System.out.println("positive");
//        } else if (number < 0) {
//            System.out.println("negative");
//        } else {
//            System.out.println("zero");
//        }


    }




}
