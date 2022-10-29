public class operators{
  public static void main(String[] args) {
    //bitwise op
    int a = 5 , b = 7;
      System.out.println("a bitwise AND b  " +  (a&b));
      System.out.println("a bitwise OR b   " +  (a|b));
      System.out.println("a bitwise XOR b  " +  (a^b));
      System.out.println(" bitwise NOT  a  " +  (~a));
      System.out.println("bitwise left shift a " +  (a>>2));
      System.out.println("bitwise right shift a " +  (a<<2));
    //logical op
    int x= 5 , y = 10;
      System.out.println(x>y && x<y);
      System.out.println(x<y && y>x);
      System.out.println(x!=y);
      System.out.println(x<y || x==y);
  }


}