package hackerRank;

import java.util.Scanner;

public class Solution07 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        a = wordInOrder( a );
        b = wordInOrder( b );
        
        return a.equals( b );
    }
    
    public static String wordInOrder(String word) {
        for(int i = 0; i < word.length() - 1; ++i) {
            for(int j = i + 1; j < word.length(); ++j) {
                if(word.charAt( i ) > word.charAt( j )) {
                    
                    word = word.substring( 0, i ) + word.charAt( j ) + word.substring( i + 1, j ) + word.charAt( i ) + word.substring( j + 1 );
                }
            }
        }
        return word;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
       
        
    }
}
