
// convert upper case into lower case and vice-versa
import java.util.Scanner;

public class charuppernlower {
    public static void main(String[] args) {
        char ch, ch2;
        System.out.println("enter any character");
        Scanner obj = new Scanner(System.in);
        ch = obj.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            ch2 = Character.toLowerCase(ch);
            System.out.println("lower case = "  +ch2);
        } else {
            ch2 = Character.toUpperCase(ch);
            System.out.println(" upper case = "   +ch2);
        }
    }
}
