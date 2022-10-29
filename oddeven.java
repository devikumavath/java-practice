// find given number is odd or even

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        int n;
        System.out.println("enter any number");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();

        if (n % 2 == 0) {

            System.out.println("even number");
        } else {

            System.out.println("odd number");

        }
        obj.close();
    }

}
