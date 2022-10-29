
// find number is factors or not
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        int n;
        System.out.println("enter any number");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("are factors of" + " " + n);

        obj.close();
    }

}
