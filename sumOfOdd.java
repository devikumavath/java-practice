import java.util.Scanner;

public class sumOfOdd {

    public static void sumOfOddNumber(int size) {
        int sum = 0;
        for (int i = 1; i <= size; i = i + 2) {
            sum = sum + i;
        }

        System.out.println(sum);

        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of the number");
        int size = sc.nextInt();

        sumOfOddNumber(size);

        sc.close();
    }

}