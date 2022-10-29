
// 6 ---> 1+2+3 = 6  ---> perfect number
// 5 ---> 1     = 1 ----> not perfect number
import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
         System.out.println("enter any number");
           Scanner obj = new Scanner(System.in);
             int number = obj.nextInt();
             int sum = 0;
        for (int i = 1; i < number; i++) {
             if (number % i == 0) {
                sum += i;
            }

        }
        if (sum == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }

        obj.close();

    }
}


