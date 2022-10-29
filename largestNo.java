
// grestest number b/w 2  
import java.util.Scanner;

public class largestNo {

    public static void main(String[] args) {

        int a, b;
        System.out.println("enter the value of a and b");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        if (a > b) {
            System.out.println("largest number is =" + a);

        } else if (a == b) {

            System.out.println("both are equal");

        }

        else if (a < 0 || b < 0) {

            System.out.println("postive numbers only");

        }

        else {
            System.out.println("largest number is=" + b);

        }

      obj.close(); 

    }
}