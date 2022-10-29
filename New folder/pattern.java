public class pattern {
    public static void main(String[] args) {
        int n1 = 5 , n2 = 5;

        for(int i = 1 ; i <= n1 ; i ++){
            for(int j = 1 ; j <= n2 ; j++){
                if (i == 1 || i == n1 || j ==1 || j == n2) {
                    System.out.print(" 1 ");
                } else {
                    
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}
