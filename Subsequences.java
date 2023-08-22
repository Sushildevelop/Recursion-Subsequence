package Practice.Recursion_4;

public class Subsequences {
    static void printSubseq(String s, String currans){
        if (s.length()==0){
            System.out.println(currans);
            return;
        }

        char curr=s.charAt(0);  // a
        String remString=s.substring(1);  // bc

        // curr char -> choose to be a part of currAns
        printSubseq(remString,currans+curr); // bc, a

        // curr char-> does not choose to be a part of currAns

        printSubseq(remString ,currans);// bc , " "


    }
    public static void main(String[] args) {
       printSubseq("abc","");
    }
}
