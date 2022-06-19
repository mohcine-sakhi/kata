package hackerRank;

import java.util.Scanner;

public class Solution06 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String chaine = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring( 0, k );
        largest = s.substring( 0, k );
        for(int i = 1; i <= s.length() - k; ++i) {
            chaine = s.substring( i, i + k );
            if(smallest.compareTo( chaine ) > 0) {
                smallest = chaine;
            }else if(largest.compareTo( chaine ) < 0) {
                largest = chaine;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
