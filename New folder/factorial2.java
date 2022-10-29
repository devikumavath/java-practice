// using recursion

import java.util.Scanner;

public class factorial2 {

    public static long fac(long num) {
        if (num == 0) {
            return 1;
        }

        return num * fac(num - 1);
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter any number");
        long num = obj.nextLong();

        fac(num);

        System.out.println(fac(num));
          obj.close();
    }

}
