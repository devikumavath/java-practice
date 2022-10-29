import java.util.*;

public class printName {

    public static void myName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner obj = new Scanner(System.in);

        String name = obj.next();

        myName("your name is " + name);
     obj.close();
    }

}
