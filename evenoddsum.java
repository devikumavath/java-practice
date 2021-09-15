// sum odd even numbers

import java.util.Scanner;

public class evenoddsum {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("enter range");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        if (n % 2 == 0) {
            for (int i = 0; i <= n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println("addition of even  =  " + sum);
        } else {
            for (int i = 1; i <= n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println("addition of odd  = " + sum);
        }
    }
}
