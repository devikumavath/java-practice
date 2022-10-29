//find out given year is leap year or not
import java.util.Scanner;
public class leapyear {
   public static void main(String[] args) {
     int y;
     System.out.println("enter any year");
     Scanner obj=new Scanner(System.in);
     y=obj.nextInt();
      if (y%100==0 || y%400==0  && y%100!=0  ||  y%4==0 ) {
        System.out.println( y+" " +"is leap year");
      } else {
        System.out.println( y+" " +"is not leap year");
      } 

      obj.close();
   }  
}
