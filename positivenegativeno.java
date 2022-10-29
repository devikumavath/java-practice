
// check number is postive or negative 
import java.util.Scanner;

public class positivenegativeno {
    public static void main(String[] args) {
        int num;
        System.out.println("enter any number");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        if (num > 0) {
            System.out.println(num + " " + "is postive number");
        } else if (num < 0) {

            System.out.println(num + "  " + "is negative number");
        } else {
            System.out.println(num + "  " + "niether postive nor negative");
        }
        obj.close();
    }
}
