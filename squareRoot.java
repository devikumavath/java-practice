import java.util.*;
public class squareRoot {

    public static void main(String[] args) {
        
        System.out.println("enter any number");

        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();

        double  answer = Math.sqrt(number);

        System.out.println("square root of " + number + " is " + answer);

        int answer1 = number*number;

        System.out.println("square of " + number + " is " + answer1);

    obj.close();
    }
    
}
