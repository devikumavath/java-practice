// sum of two number by user input
import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        int a,b;
        System.out.println("enter values of a and b");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        
        System.out.println("sum of a and b is");
        System.out.println(a+b);

        obj.close();


    }
    
}
