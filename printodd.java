// odd numbers in given range 
import java.util.Scanner;

public class printodd  {

    public static void main(String[] args) {
        int n ;
      System.out.println("number range");
      Scanner obj=new Scanner(System.in);  
       n=obj.nextInt();
    

         for (int i=1;i<=n;i=i+2) {
             
             
         System.out.print(i  + " "); 
       }
    
    }

    
}

    

