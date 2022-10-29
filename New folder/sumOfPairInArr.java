public class sumOfPairInArr {
    public static void main(String[] args) {
        int[] arr =  { 10 , 2 , 4 , 7 , 19 , 21 , 6};
        int sum = 25;

        for(int i = 0 ; i < arr.length-1; i++){
            for(int j = i ; j < arr.length ; j++  ){
                if(sum == arr[i]+arr[j]){
                    System.out.println(arr[i] + " " + arr[j]);
                    // System.out.println(arr[i]);
                }
            }
            // System.out.println(arr[i]);
        }
    }
}
