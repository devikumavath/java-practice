// check given number is divisible by 5 or not
import java.util.Scanner;

public class divisibleby5 {
   public static void main(String[] args) {
      int n;
      System.out.println("enter any number");
      Scanner obj=new Scanner(System.in);
      n=obj.nextInt();
      if (n%5==0) {
        System.out.println("divisible by 5");
      } else {
        System.out.println("not divisible by 5");
      } 

      obj.close();
   } 
}
