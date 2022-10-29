// using functions
import java.util.Scanner;

public class factorial1 {
    public static void fac(long num) {
       long  total = 1;
        for(long i = num ; i >= 1 ; i--){
             total = total*i;
        }
        System.out.println(total);
         return;
    }


    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any number ");
        long num = obj.nextLong();
        fac(num);
  

      obj.close();   
    }
    
}
