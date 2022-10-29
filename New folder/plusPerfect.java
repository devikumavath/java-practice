import java.util.Scanner;

public class plusPerfect {
    public static void main(String[] args) {
        // armstrong number program
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        int newNo = number;

        // 153  ---- 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27 
         int res , sum = 1;
        while (number != 0) {
           res = number%10;
           sum = sum*res*res*res;
           number = number/10;
        }
        


        if (number == sum) {
            System.out.println(newNo + " is a armstrong number ");
        } else {
            System.out.println(newNo + " is not a armstrong number ");  
        }
        


    }
}
    

