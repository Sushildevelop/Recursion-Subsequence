package Practice.Recursion_4.Assignment;

import java.util.Scanner;

public class set_of_character {
    static void printString(Character[]chars,int remainigChars,String ans){
       if (remainigChars==0){
           System.out.println(ans);
           return;
       }
       for (int i=0;i<chars.length;i++){
           printString(chars, remainigChars-1, ans+Character.toString(chars[i]));
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Character[] chars = new Character[n];
        for (int i = 0; i < n; i++) {
            chars[i] = sc.next().charAt(0);
        }
        int k = sc.nextInt();
        printString(chars, k, "");

    }
}
