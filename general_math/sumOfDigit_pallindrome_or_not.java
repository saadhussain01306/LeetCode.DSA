/*Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.

Example 1:

Input:
N=56
Output:
1
Explanation:
The digit sum of 56 is 5+6=11.
Since, 11 is a palindrome number.Thus,
answer is 1.*/

class Solution {
    int isDigitSumPalindrome(int N) {
        int sum=0,reversed=0;
        while(N!=0){
            sum=sum+N%10;
            N=N/10;
        }
        
        int p=sum;
        while(p!=0){
            int remainder=p%10;
            reversed=reversed*10+remainder;
            p=p/10;
        }
        if(sum==reversed){
            return 1;
        }
        else{
            return 0;
        }
        
    }
}
