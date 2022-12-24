package TeachingExercise;

public class Te02MethodOverloading {
    public static void main(String[] args) {

<<<<<<< HEAD
        System.out.println("68in = "+convertToCentimeters(68)+"cm");
        System.out.println("5ft, 8in = "+convertToCentimeters(5,8)+"cm");

    }
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches){
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        return (totalInches *2.54);
=======
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");

    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        return (totalInches * 2.54);
>>>>>>> 5052302 (Find centimeter using feet and inches value.)
    }
}
