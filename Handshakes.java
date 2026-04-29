import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        
        System.out.println("Maximum handshakes: " + calculateHandshakes(numberOfStudents));
    }

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
