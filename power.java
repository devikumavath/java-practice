// power of the given number
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        long n,p,result=1;
        System.out.println("enter the number and power");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        p=obj.nextInt();
        
        for (int i = 0; i <p; i++) {

           result= n*result;
            
        }
          System.out.println("power = " +result);  
         obj.close();
     }
    }
