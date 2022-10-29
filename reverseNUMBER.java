
// reverse a number ----> 123 to 321
import java.util.Scanner;

public class reverseNUMBER {

    public static void main(String[] args) {
        int n, r;
        System.out.println("enter any number");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        System.out.print("reverse of" + " " + n + " " + "is ");
        while (n != 0) {
            r = n % 10;
            System.out.print(r);
            n = n / 10;
        }
        obj.close();
    }

}
