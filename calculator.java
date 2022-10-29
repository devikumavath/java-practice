
// calculator using elseif ladder
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int n1, n2, ch, cal;
        System.out.println("enter two numbers");
        Scanner obj = new Scanner(System.in);
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        System.out.println("1)add \n2)sub \n3)mutipile \n4)division \n5)modulo \n");

        System.out.println("enter opertor");
        ch = obj.nextInt();

        if (ch == 1) {
            cal = n1 + n2;
            System.out.println("addition   = " + cal);
        } else if (ch == 2) {
            cal = n1 - n2;
            System.out.println("subtracation   = " + cal);
        } else if (ch == 3) {
            cal = n1 * n2;
            System.out.println("multipication   = " + cal);
        } else if (ch == 4) {
            cal = n1 / n2;
            System.out.println("division  = " + cal);
        } else if (ch == 5) {
            cal = n1 % n2;
            System.out.println("reminder  = " + cal);
        }

        else {
            System.out.println("invalid choice");
        }
      obj.close();
  }
}
