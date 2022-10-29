import java.util.Scanner;

public class add {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       int N1 = obj.nextInt();
       int N2 = obj.nextInt();
       
       int sum = N1+N2;
       System.out.println("sum of two numbers: " + sum);
    }
}
