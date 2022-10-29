
// enter month number and print number of days in month
import java.util.Scanner;

public class daysinmonth {
    public static void main(String[] args) {
        int n;
        System.out.println("enter number of month");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        if (n == 1) {
            System.out.println("jan = 31 days");
        } else if (n == 2) {
            System.out.println("feb = 28 days");
        } else if (n == 3) {
            System.out.println("march = 31 days");
        } else if (n == 4) {
            System.out.println("april = 30 days");
        } else if (n == 5) {
            System.out.println("may = 31 days");
        } else if (n == 6) {
            System.out.println("june = 30 days");
        } else if (n == 7) {
            System.out.println("july = 31 days");
        } else if (n == 8) {
            System.out.println("august = 31 days");
        } else if (n == 9) {
            System.out.println("sept = 30 days");
        } else if (n == 10) {
            System.out.println("oct = 31 days");
        } else if (n == 11) {
            System.out.println("nov = 30 days");
        } else if (n == 12) {
            System.out.println("jan = 31 days");
        }

        else {
            System.out.println("invalid month number");
        }

        obj.close();
    }
}
