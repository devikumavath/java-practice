
// area of the circle 
// formula Pi*r*r
// pi=3.14
import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, area;
        System.out.println("enter the radius of circle");
        Scanner obj = new Scanner(System.in);
        r = obj.nextInt();
        area = pi * r * r;
        System.out.println("area of the circle = " + area);
    }

}
