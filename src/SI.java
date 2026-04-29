import java.util.Scanner;
public class SI {
    
    public void interest(){
        Scanner sc = new Scanner(System.in);
        int p ,t;
        float r;
        p = sc.nextInt();
        t = sc.nextInt();
        r = sc.nextFloat();
        double i = p * t * r / 100;
        System.out.println("The Simple Interest is " + i + " for Principal " + p + " , Rate of Interest "+r+" and Time "+ t);
    }
    
    
    public static void main(String[] args) throws Exception {
        SI obj = new SI();
        obj.interest();
    }
}