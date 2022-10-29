
// find the factorial of the given number
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        long n, fact = 1;
        System.out.println("enter the number");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();

        for (long i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial =  " + fact);

        obj.close();
    }

}
