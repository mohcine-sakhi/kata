package hackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        Pattern.compile( "[AZ[a-z](a-z)" );
        String[] tokens = s.trim().split("[ !,?._'@]*");
        if(s.trim().isEmpty()){
            System.out.println(0); 
         }else{
             System.out.println(tokens.length);
         }
        for(String token : tokens){
            System.out.println(token);
        }
        scan.close();
    }

}
