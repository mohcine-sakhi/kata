package hackerRank;

import java.util.Scanner;

public class Solution11 {

    public static void main( String[] args ) {
        /*
         * 
         * We define the following:
         * 
         * A subarray of an -element array is an array composed from a
         * contiguous block of the original array's elements. For example, if ,
         * then the subarrays are , , , , , and . Something like would not be a
         * subarray as it's not a contiguous subsection of the original array.
         * The sum of an array is the total sum of its elements. An array's sum
         * is negative if the total sum of its elements is negative. An array's
         * sum is positive if the total sum of its elements is positive. Given
         * an array of integers, find and print its number of negative subarrays
         * on a new line.
         * 
         * Input Format
         * 
         * The first line contains a single integer, , denoting the length of
         * array . The second line contains space-separated integers describing
         * each respective element, , in array .
         * 
         * Constraints
         * 
         * Output Format
         * 
         * Print the number of subarrays of having negative sums.
         * 
         * Sample Input
         * 
         * 5 1 -2 4 -5 1 Sample Output
         * 
         * 9
         * 
         * Enter your code here. Read input from STDIN. Print output to STDOUT.
         * Your class should be named Solution.
         */
        Scanner scanner = new Scanner( System.in );
        int taille = Integer.parseInt( scanner.nextLine() );
        int[] tab = new int[taille];
        for ( int i = 0; i < tab.length; i++ ) {
            tab[i] = scanner.nextInt();
        }

        int somme = 0;
        int compteur = 0;
        for ( int i = 0; i < tab.length; i++ ) {
            somme = 0;
            for ( int j = i; j < tab.length; j++ ) {
                somme += tab[j];
                if ( somme < 0 ) {
                    ++compteur;
                }
            }

        }
        System.out.println( compteur );
        
        scanner.close();
    }
}
