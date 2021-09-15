
// largest number out of 3
import java.util.Scanner;

public class large3 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter the value of a , b c");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();
        if (a>b && a>c) {
            System.out.println(a);
        } else if (b> c && b > a) {
            System.out.println(b);
        } else if (c>a && c>b) {
            System.out.println(c);
        } else {
            System.out.println("all are equal");
        }

    }

}
