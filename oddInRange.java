import java.util.Scanner;

public class oddInRange {

    public static void main(String[] args) {
        
        System.out.println("enter range for odd numbers");
        Scanner obj = new Scanner(System.in);
        int range = obj.nextInt();

          System.out.println("odd numbers in range of " + range + " is ");
        for (int i = 1; i <= range ; i = i+2) {

            System.out.print(i + " ");
            
                    }
                    obj.close();
                    
                }
                     }
                  

