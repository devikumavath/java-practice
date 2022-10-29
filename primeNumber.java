import java.util.Scanner;
   public class primeNumber {
    public static void main(String[] args) {
       System.out.println("enter any number");
       Scanner obj = new Scanner(System.in);
       int number = obj.nextInt();
       int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }
         if (count == 2) {
             System.out.println(number + " is prime number");
            }
            
         else {
             System.out.println(number + " is not prime number");
     
            }
            obj.close();
        }
     
     }
     
     

     



