import java.util.Scanner;

public class armStrong {

    public static void main(String[] args) {

        System.out.println("enter any number");

        int number, reminder, result = 0;
        Scanner obj = new Scanner(System.in);
        number = obj.nextInt();
        int orignalNo = number;

        while (orignalNo != 0) {

            reminder = orignalNo % 10;

            result += Math.pow(reminder, 3);

            orignalNo /= 10;

        }

        if (result == number) {

            System.out.println(number + " is a armStrong number");

        } else {

            System.out.println(number + " is  not a armStrong number");
        }

        obj.close();

    }
}
