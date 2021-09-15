// find largest number of 3

import java.util.Scanner;

import jdk.javadoc.internal.tool.Main;

public class ternay {
    public static void main(String[] args) {
        int a,b,c,max;
        System.out.println("enter the value of a ,b , c ");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();

        max= (a>b) ? (a>c?a:c):(b>c?b:c);
        System.out.println("largest number among three is");
        System.out.println(max);
    }
    

}
