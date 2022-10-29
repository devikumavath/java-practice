import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            if (n2 >= n3) {
                System.out.println(n2);
            } else {
                System.out.println(n3);
            }

        } else if (n2 >= n1 && n2 >= n3)
            if (n1 >= n3) {
                System.out.println(n1);
            } else {
                System.out.println(n3);
            }

        else if (n1 >= n2) {
            System.out.println(n1);
        }

        else {
            System.out.println(n2);

        }

    }

}
