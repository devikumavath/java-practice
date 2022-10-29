
public class ArmStrong1 {

    public static void main(String[] args) {
        int num = 153;
        int copyNum = num;
        int sum = 0;

        for (int i = num; i >=  0 ; i--) {
            int rem = num%10;
            // System.out.println(rem);
            sum = sum+(rem*rem*rem);
            // System.out.println(sum);
            if(rem == 0)
            {
                break;
            }
            num = num/10;
            // System.out.println(num);
            
        }

        if(copyNum == sum)
        {
            System.out.println(copyNum + " is armstrong ");
        }
    }

    
}