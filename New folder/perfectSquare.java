import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        System.out.println("enter any number ");
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        int flag = 0;
        for(int i = 1 ; i <= number ; i++){
            if(number == i*i)
            {
                flag++;
                break;
            }
        }

        if(flag == 1){
            System.out.println("perfect square");
        }
        else
        {
            System.out.println("not a perfect square");
        }
    }
}
