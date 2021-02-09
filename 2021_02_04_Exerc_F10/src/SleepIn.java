public class SleepIn {
    public static void main(String[] args) {

        System.out.println(sleepIn(false, false));// → true
        System.out.println(sleepIn(true, false));// → false
        System.out.println(sleepIn(false, true));// → true
        System.out.println(sleepIn(true, true));// → true

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        }
        return false;
    }

    public static boolean sleepInTwo(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static boolean sleepInOne(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
