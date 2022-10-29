import java.util.Scanner;

public class sumOfPrimeNO {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter two numbers");
        int n1, n2;
        n1 = obj.nextInt();
        n2 = obj.nextInt();

        int i, j, sum = 0;
        for (i = n1; i <= n2; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0)

                    break;

            }

            if (i == j) {
                sum = sum + j;
                // System.out.println(j);

            }
        }
        System.out.println(sum);

    }

}
