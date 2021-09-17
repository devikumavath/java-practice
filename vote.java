// vote eligibility 
import java.util.Scanner;
public class vote{
public static void main(String[] args) {
    int age;
    System.out.println("enter the age");
    Scanner obj = new Scanner(System.in);
    age=obj.nextInt();
    if (age>=18) {
        System.out.println("you are eligible for vote");  
    } else {
        System.out.println("you are  not eligible for vote");
    }
    
}


}