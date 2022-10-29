import java.util.*;

public class function {
    // public static void printMyName(String name) {
    // System.out.println(name);
    // return;
    // }

    public static int calculateSum(int a, int b) {
        int sum = a + b;

        return sum;
    }

    public static void main(String[] args) {
        // System.out.println("enter your name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // printMyName(name);

        System.out.println("enter value of a & b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("sum of 2 numbers is : " + sum);

        sc.close();

    }

}