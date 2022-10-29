import java.util.Scanner;

public class fristAndLastOccurance {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // sorted array with duplicate numbers
        System.out.println("enter size of an array");
        int number = obj.nextInt();

        int[] arr = new int[number];
          
        System.out.println("enter array elements");
        for(int i = 0 ; i < arr.length ; i++){
             arr[i] = obj.nextInt();
        }

         System.out.println("enter element to search frist and last occurance");
         int key = obj.nextInt();

        for(int i = 0 ; i < arr.length ; i++){
             if(key == arr[i])
             System.out.println(i+1);
       }




    }
    
}
