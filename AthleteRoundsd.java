import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle (in meters):");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        double rounds = computeRounds(s1, s2, s3);
        System.out.printf("Rounds needed to complete 5km: %.2f\n", rounds);
    }

    public static double computeRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter; // 5km = 5000m
    }
}
