
// find area of the rectangle 
// length*breadth
import java.util.Scanner;

public class rectanglearea {
    public static void main(String[] args) {
        int l, b, area;
        System.out.println("enter length and breadth of the rectangle");
        Scanner obj = new Scanner(System.in);
        l = obj.nextInt();
        b = obj.nextInt();
        area = l * b;
        System.out.println("area of the rectangle = " + area);

    }

}
