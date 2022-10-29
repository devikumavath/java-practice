import java.util.Scanner;

import java.util.*;
// product of two numbers 
/*   
public class function2 {

    public static int calculateproduct(int a , int b)
    {
       return a*b;

    }

    public static void main(String[] args) {
        System.out.println("enter any two numbers");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        System.out.println("product of two number is: "  + calculateproduct(a , b));
    }
    
}   */

// factorial numbers
public class function2 {

    public static void calculateFactorial(int n) {

        if(n < 0)
        {
            System.out.println("invalid number");
            return;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {

            fact = fact * i;
        }

        System.out.println(fact);
        return;

    }

    public static void main(String[] args) {

        System.out.println("enter any numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculateFactorial(n);

        sc.close();
    }

}
