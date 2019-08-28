/* Java Big Integer
In this problem you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like long integer.
Use the power of Java's BigInteger class and solve this problem.
Input Format
There will be two lines containing two numbers, a and b. The numbers are non-negative and can have maximum 200 digits.
Output Format
Output two lines. The first line should contain a+b, and the second line should contain a×b. Don't print any leading zeros.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //New code starts here
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        BigInteger n1 = new BigInteger(str1);
        BigInteger n2 = new BigInteger(str2);
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
        //New code ends here
    }
}
