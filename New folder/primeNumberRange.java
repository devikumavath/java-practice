import java.util.Scanner;

public class primeNumberRange {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter two numbers");
        int number1 = obj.nextInt();
        int number2 = obj.nextInt();
         int i , j;
        for( i = number1 ; i <= number2 ; i++){
            for( j = 2 ; j <= i ; j++){
                if(i%j ==0)
                break;
                
            }
            if(i == j){
                System.out.print(j + " ");
            }
        }
    
    }

}
