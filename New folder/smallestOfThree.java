import java.util.Scanner;
public class smallestOfThree {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n1 , n2 , n3;
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();
       
        if (n1 < n2 && n1 < n3) {
            System.out.println(n1);
        } else if (n2 < n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }


    }
   
    
}
