import java.util.Scanner;

public class sumOfDigits {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        int sum = 0, res;

        while (number != 0) {
            res = number%10;
            sum = sum + res;
            number = number/10;
        }

        System.out.println(sum);
    }

}