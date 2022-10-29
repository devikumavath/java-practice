import java.util.Scanner;

public class fibonacci {
    private static int firstTerm;

    public static void main(String[] args) {
        System.out.println("enter range ");
        Scanner obj = new Scanner(System.in);
        int range = obj.nextInt();
        int fristTerm = 0, secondTerm = 1, nextTerm;
        for (int i = 1; i <= range; i++) {
            System.out.print(firstTerm + " ");
            // compute the next term
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        obj.close();
    }

}
