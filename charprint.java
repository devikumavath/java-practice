// input of char by user
import java.util.Scanner;


public class charprint {
    public static void main(String[] args) {
        char ch;
        System.out.println(" please enter the char");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        System.out.println(ch);
    }

    
}
