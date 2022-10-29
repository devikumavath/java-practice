
// name of the day weekend
import java.util.Scanner;

public class nameofday {

    public static void main(String[] args) {
        int n;
        System.out.println("enter day");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        switch (n) {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invaild day");
                break;
        }

        obj.close();
    }

}