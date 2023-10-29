/*Given a number N. Find the minimum number of operations required to reach N starting from 0. You have 2 operations available:

Double the number
Add one to the number
Example 1:

Input:
N = 8
Output: 4
Explanation: 
0 + 1 = 1 --> 1 + 1 = 2 --> 2 * 2 = 4 --> 4 * 2 = 8.*/


class Solution
{
    public int minOperation(int n)
    {
        int count=0;
        while(n>0){
            if(n%2==0){
                n=n/2;
            }
            else{
              n=n-1;  
            }
            count++;
        } 
        return count;
    }
}
