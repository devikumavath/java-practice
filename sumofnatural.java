// sum of n natural numbers
import java.util.Scanner;
public class sumofnatural {
    public static void main(String[] args) { 
         int n,sum=0;
        System.out.println("enter no. of terms");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        

        for (int i=0; i<=n; i++) {
       
            sum=sum+i;
        
        }
         System.out.println("sum of " + n + " terms is "  + sum);

         obj.close();
         }
}
