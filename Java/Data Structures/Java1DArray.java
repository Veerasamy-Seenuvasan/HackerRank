/*Java 1D Array
Let's play a game on an array! You're standing at index  of an -element array named . From some index  (where ), you can perform one of the following moves:

Move Backward: If cell  exists and contains a , you can walk back to cell .
Move Forward:
If cell  contains a zero, you can walk to cell .
If cell  contains a zero, you can jump to cell .
If you're standing in cell  or the value of , you can walk or jump off the end of the array and win the game.
In other words, you can move from index  to index , , or  as long as the destination index is a cell containing a . If the destination index is greater than , you win the game.

Given  and , complete the function in the editor below so that it returns true if you can win the game (or false if you cannot).

Input Format

The first line contains an integer, , denoting the number of queries (i.e., function calls). 
The  subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of  and .
The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values of .
Constraints

It is guaranteed that the value of  is always .
Output Format

Return true if you can win the game; otherwise, return false.

Sample Input

4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0
Sample Output

YES
YES
NO
NO
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //New code starts here
        int[] a=new int[n];
        for(int j=0;j<a.length;j++){
        a[j]=scan.nextInt();
        }
        //New code ends here
        scan.close();
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
