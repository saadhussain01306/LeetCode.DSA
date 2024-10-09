/*

A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

 

Example 1:

Input: s = "())"
Output: 1
Example 2:

Input: s = "((("
Output: 3
 

Constraints:

1 <= s.length <= 1000
s[i] is either '(' or ')'.

*/


class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int mismatch=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else{
                    mismatch++;//number of mismatchs for the open braces
                }
            }
        }

        return open+mismatch;
        //reason because in the above condition all th eopens are deleted if we have enough closing braces and if not we need the open count sumed up with the mismatch ones
    }
}
