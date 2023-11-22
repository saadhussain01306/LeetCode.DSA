/*Given a mxn matrix, count the number of squares in the matrix.

Example 1:

Input:
m = 2, n = 2
Output:
5
Explanation:
There are a total of 5 squares in a 2*2
matrix. Four 1*1 squares and one 2*2 square.
*/
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int m = Integer.parseInt(S[0]);
            int n = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.squaresInMatrix(m,n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long squaresInMatrix(int m, int n) {
        long result=0;
        while(m!=0 && n!=0){
            int p=m*n;
            m--;
            n--;
            result+=p;
        }
        return result;
    }
};
