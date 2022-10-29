import java.util.Scanner;

public class calculateSum {

    public static int sumOfTwoNo(int a, int b) {
        int total = a + b;

        return total;

    }

    public static void main(String[] args) {

        int a, b;
        System.out.println("enter any two numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(sumOfTwoNo(a, b));

        sc.close();

    }

}