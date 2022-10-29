import java.util.Scanner;
public class binary {
public static void main(String[] args) {
    

    int a,b;
    System.out.println("enter the value of a and b....");
    Scanner obj = new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
     
    System.out.println("arthimatic operators");
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a *b);
    System.out.println(a/b);
    System.out.println(a%b);
    
    System.out.println("relational operators");
    System.out.println(a<b);
    System.out.println(a>b);
    System.out.println(a<=b);
    System.out.println(a>=b);
    System.out.println(a==b);

    System.out.println("logical  operators");
    System.out.println((a<b)&& (a<b));
    System.out.println((a>b)&& (a>b));
    System.out.println((a<b)&& (a>b));
    System.out.println((a>b)&& (a<b));

    System.out.println((a<b)|| (a>b));
    System.out.println((a>b)|| (a<b));
    System.out.println((a<b)||(a<b));
    System.out.println((a>b) || (a>b));

    System.out.println(!(a<b));

    System.out.println("bitwise operators");
    System.out.println(a&b);
    System.out.println(a|b);
    System.out.println(a^b);
    System.out.println(b<<1);
    System.out.println(1>>b);
    System.out.println(a<<1);
    System.out.println(1>>a);
     
    System.out.println("assigmwnt operators");
    System.out.println(a += b);
    System.out.println(a -= b);











obj.close();


}    
}

