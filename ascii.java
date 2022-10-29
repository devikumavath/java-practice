// ascii value of character
import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
     char ch;
     System.out.println("enter the char");
     Scanner r=new Scanner(System.in);
     ch= r.next().charAt(0);

     int a=ch;  
     System.out.println("ASCII value of "+ch +" is "  +a);
    r.close();    
    }
}
