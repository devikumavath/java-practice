
import java.util.Scanner;
import java.lang.Math;

public class trianglearea {
  public static void main(String[] args) {
    int a, b, c, s;
    double area;
    System.out.println("enter the 3 sides of the triangle");
    Scanner obj = new Scanner(System.in);
    a = obj.nextInt();
    b = obj.nextInt();
    c = obj.nextInt();
    s = (a + b + c) / 2;
    area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    System.out.println("area of the triangle = " + area);

    obj.close();
  }
}
