package hackerRank;

import java.util.Scanner;

public class Solution03 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String line;
        while(scanner.hasNext()) {
           line = scanner.nextLine();
           ++i;
           System.out.println( i + " " + line );
        }
        scanner.close();
    }
}
