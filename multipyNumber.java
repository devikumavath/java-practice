import java.util.Scanner;

public class multipyNumber {

    public static int product(int a, int b)
    {

        int multipy = a*b;

        return multipy;


    }
    public static void main(String[] args) {
        int a , b;
        System.out.println(" enter any two number" );
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b=obj.nextInt();

        System.out.println(product(a, b));
        obj.close();

    }
}

    

