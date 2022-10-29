import java.util.Scanner;

public class evenInRange {

    public static void main(String[] args) {
        
        System.out.println("enter range");

        Scanner obj = new Scanner(System.in);
        int range = obj.nextInt();

        System.out.println("even numbers in range " + range + " are ");
        for (int i = 0; i <= range ; i = i+2) {

            System.out.print(i + " ");
            
        }

        obj.close();
    }
    
}
