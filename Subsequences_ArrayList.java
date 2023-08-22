package Practice.Recursion_4;

import java.util.ArrayList;

public class Subsequences_ArrayList {
         static ArrayList getsubseq(String s){

         ArrayList<String> ans=new ArrayList<>();
         // base case
             if (s.length()==0){
                 ans.add("");
                 return ans;
             }

             char curr=s.charAt(0);
             ArrayList<String>smallans=getsubseq(s.substring(1));

             for (String ss:smallans){
                 ans.add(ss);
                 ans.add(curr+ss);
             }
             return ans;
         }
    public static void main(String[] args) {
     ArrayList<String> ans=getsubseq("abc");
        for (String ss:ans
             ) {
            System.out.println(ss);
        }
    }
}
