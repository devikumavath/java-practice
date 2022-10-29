// check char is vowel or consonant

import java.util.Scanner;

public class vowelconst {
  public static void main(String[] args) {
    char ch;
    System.out.println("enter the char");
    Scanner r = new Scanner(System.in);
    ch = r.next().charAt(0);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U') {
      System.out.println(ch + " is a vowel");
    } else {
      System.out.println(ch + " is a consonant");
    }
    r.close();
  }
}
