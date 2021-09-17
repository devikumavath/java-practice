
// total and average of 5 subjects
import java.util.Scanner;

public class average {
public static void main(String[] args) {
    int a,b,c,d,e;
    System.out.println("enter the marks of 5 subjects");
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
    c=obj.nextInt();
    d=obj.nextInt();
    e=obj.nextInt();
    int sum=a+b+c+d+e;
    System.out.println("total marks  =" + sum);

    double avg=sum/5.0;
    System.out.println("average mark  =" + avg);
}
    
}