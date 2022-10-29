// using loops
import java.util.Scanner;
  public class factorial {
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any number");
        long num = obj.nextInt();
       
        long  total = 1;
        for(int i = 1 ; i <= num ; i++){
            total = total*i;
        
        }
        System.out.println("factorial of " + num + " is " + total);

    obj.close();
    }
    
}
