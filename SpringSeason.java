public class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if (isSpring(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    public static boolean isSpring(int m, int d) {
        // March 20 to June 20
        if (m == 3 && d >= 20 && d <= 31) return true;
        if (m == 4 && d >= 1 && d <= 30) return true;
        if (m == 5 && d >= 1 && d <= 31) return true;
        if (m == 6 && d >= 1 && d <= 20) return true;
        return false;
    }
}
