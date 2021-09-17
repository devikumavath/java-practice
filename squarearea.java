// area of the square
import java.util.Scanner;
public class squarearea {
  public static void main(String[] args) {
    int side,area;
    System.out.println("enter the side of the square"); 
    Scanner obj =new Scanner(System.in);
    side=obj.nextInt();
    area=side*side;
    System.out.println("enter of square = " + area); 
  }  
}
