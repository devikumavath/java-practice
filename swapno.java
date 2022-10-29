// swap two numbers
import java.util.Scanner;

public class swapno {
    public static void main(String[] args) {
      int num1,num2,tem;
      System.out.println("enter two numbers");
      Scanner obj=new Scanner(System.in);
      num1=obj.nextInt();
      num2=obj.nextInt(); 
      System.out.println("before swapping = " +num1 +" and " +num2);
      tem=num1;
      num1=num2;
      num2=tem;
      System.out.println("after swapping = " +num1 + " and "  +num2);
      obj.close();
    }
    
}
