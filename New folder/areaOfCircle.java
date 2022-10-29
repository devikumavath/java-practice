import java.util.Scanner;

public class areaOfCircle {

    public static void Area(Float diameter) {

        float r = diameter / 2;
        System.out.println(r);
        double area = Math.PI * r * r;

        System.out.println(area);

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter diameter of circle");
        float diameter = obj.nextFloat();

        Area(diameter);
      obj.close();
    }

}

