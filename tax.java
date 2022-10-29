
// calculation of tax of salary
// 0 to 2.5lk ---->nil
// 2.5lk to 5lk ---->5%
// 5lk to 7.5lk ---->10%
// 7.5lk to 10lk --->15%
import java.util.Scanner;

public class tax {
  public static void main(String[] args) {
    long sal;
    double tax;
    System.out.println("enter  your annaul salary ");
    Scanner obj = new Scanner(System.in);
    sal = obj.nextInt();
    if (sal <= 250000) {

      System.out.println("BASE SALARY " + sal + "\nTAX " + "no tax");
    } else if (sal > 250000 && sal <= 500000) {

      tax = sal * 5 / 100;

      System.out.println("BASE SALARY " + sal + "\nTAX " + tax);
    } else if (sal > 500000 && sal <= 750000) {

      tax = sal * 10 / 100;
      System.out.println("BASE SALARY " + sal + "\nTAX " + tax);
    } else {
      tax = sal * 15 / 100;
      System.out.println("BASE SALARY " + sal + "\nTAX " + tax);

    }

    obj.close();
  }

}
