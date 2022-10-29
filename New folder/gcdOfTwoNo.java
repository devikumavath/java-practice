import java.util.Scanner;

public class gcdOfTwoNo {

    public static int GCD(int num1 , int num2){
        if(num1==0)
        return  num1;

        if(num2==0)
        return  num2;

        if(num1== num2)
        return  num1;

        if(num1 > num2)
        return GCD(num1-num2 , num2);
        return GCD(num1, num2-num1);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any two positive numbers ");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();

        System.out.println(GCD(num1, num2));

        obj.close();
    }
    
}
