import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        findSmallestAndLargest(a, b, c);
    }

    public static void findSmallestAndLargest(int a, int b, int c) {
        int largest = Math.max(a, Math.max(b, c));
        int smallest = Math.min(a, Math.min(b, c));
        
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
