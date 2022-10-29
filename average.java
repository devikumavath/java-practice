
// total and average of 2 subjects
import java.util.Scanner;

public class average {
public static void main(String[] args) {
    int a,b;
    System.out.println("enter the marks of 2 subjects");
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
   
    int sum=a+b;
    System.out.println("total marks  = " + sum);

    double avg=sum/2.0;
    System.out.println("average mark  = " + avg);

    obj.close();
}
    
}