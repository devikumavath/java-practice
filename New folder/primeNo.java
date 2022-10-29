import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         System.out.println("enter any number ");
         int number = obj.nextInt();
         int count=0;
         for(int i = 1 ; i <= number ; i++){
            if(number % i == 0){
                count++;
            }
         }

         if(count == 2){
            System.out.println(number + " is a prime number ");
            System.out.println(Math.sqrt(number));
        
         }
         else
         {
            System.out.println(number + " is not a prime number");
         }

    
    }
    
}
