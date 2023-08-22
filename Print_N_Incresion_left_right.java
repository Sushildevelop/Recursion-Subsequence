package Practice.Recursion_4.Assignment;

import java.util.Scanner;

public class Print_N_Incresion_left_right {
    static void printdigit(int start,String out, int n){
        if (n==0){
            System.out.print(out+" ");
            return;
        }
        for (int i=start;i<=9;i++){
            String str=out+Integer.toString(i);
            printdigit(i+1,str,n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        printdigit(0," ",n);
    }
}
