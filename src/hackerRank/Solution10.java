package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution10 {

    public static void main( String[] args ) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT.
         * Your class should be named Solution.
         *   5
         *   12 0 1 78 12
         *   2
         *   Insert
         *   5 23
         *   Delete
         *   0
         */

        Scanner scanner = new Scanner( System.in );
        ArrayList<Integer> liste = new ArrayList<>();

        int nbIntegers = scanner.nextInt();
        scanner.nextLine();

        for ( int i = 0; i < nbIntegers; ++i ) {
            liste.add( scanner.nextInt() );
        }
        scanner.nextLine();

        int nbQueries = scanner.nextInt();
        scanner.nextLine();
        String query = "";
        for ( int i = 0; i < nbQueries; i++ ) {
            query = scanner.nextLine();
            if ( query.equals( "Insert" ) ) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                scanner.nextLine();
                liste.add( x, y );
            } else if ( query.equals( "Delete" ) ) {
                int z = scanner.nextInt();
                liste.remove( z );
                scanner.nextLine();
            }
        }

        for ( Integer val : liste ) {
            System.out.print( val + " " );
        }
        scanner.close();
    }
}
