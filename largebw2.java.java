// grestest number b/w 2 
import java.util.Scanner;
public class largestno {

    public static void main(String[] args) {
        
    
    int a,b;
    System.out.println("enter the value of a and b");
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
    if (a>b) {
        System.out.println("largest number is =" + a);
    } else {
        System.out.println("largest number is=" + b);
            
    }
    
}
}