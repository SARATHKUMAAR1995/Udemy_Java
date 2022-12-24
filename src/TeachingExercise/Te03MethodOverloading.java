package TeachingExercise;

public class Te03MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(60, 3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, -45));

    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            return getDurationString(minutes,seconds%60);
        } else {
            return "Invalid seconds (" + seconds + ")";
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if (seconds >= 0) {
            if (minutes >= 0 ) {
                int totalMinutes = (minutes + (seconds / 60));
                int totalHour = totalMinutes / 60;
                int remainingMinutes = totalMinutes % 60;
                int remainingSeconds = seconds % 60;

                return totalHour + "h " + remainingMinutes + "m " + remainingSeconds + "s";
            } else {
                return "Invalid minutes ("+minutes+")";
            }
        } else {
             return "Invalid seconds ("+seconds+")";
        }
    }
}
