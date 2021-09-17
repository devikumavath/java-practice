// swapping of number without using 3rd variable
import java.util.Scanner;

public class swapnowithout3variable {
    public static void main(String[] args) {
      int a,b;
      System.out.println("enter any two numbers");
      Scanner obj = new Scanner(System.in);
      a=obj.nextInt();
      b=obj.nextInt();
      System.out.println("before swapping = " +a +" and " +b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("before swapping = " +a +" and " +b);
    }
    
}
