import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i + "*");
            }
            System.out.print(i);
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = i-1; j >= 1; j--) {
                System.out.print(i + "*");
            }
            System.out.print(i);
            System.out.println();
        }

    }

}
