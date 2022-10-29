import java.util.Scanner;

public class unary {
    public static void main(String[] args) {
        int a;
        System.out.println("enter a value");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();

        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
         System.out.println(a++);

        System.out.println(a);
        System.out.println(++a);

        obj.close();
    }
    
}
