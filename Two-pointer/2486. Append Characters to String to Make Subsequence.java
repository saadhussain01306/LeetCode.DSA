/*
You are given two strings s and t consisting of only lowercase English letters.

Return the minimum number of characters that need to be appended to the end of s so that t becomes a subsequence of s.

A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.

 

Example 1:

Input: s = "coaching", t = "coding"
Output: 4
Explanation: Append the characters "ding" to the end of s so that s = "coachingding".
Now, t is a subsequence of s ("coachingding").
It can be shown that appending any 3 characters to the end of s will never make t a subsequence.
Example 2:

Input: s = "abcde", t = "a"
Output: 0
Explanation: t is already a subsequence of s ("abcde").
Example 3:

Input: s = "z", t = "abcde"
Output: 5
Explanation: Append the characters "abcde" to the end of s so that s = "zabcde".
Now, t is a subsequence of s ("zabcde").
It can be shown that appending any 4 characters to the end of s will never make t a subsequence.
 

Constraints:

1 <= s.length, t.length <= 105
s and t consist only of lowercase English letters.
*/

class Solution {
    public int appendCharacters(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        int s_diff=0;
        int t_diff=0;

       while(s_diff<l1 && t_diff<l2){
        if(s.charAt(s_diff)==t.charAt(t_diff)){
            // move the t pointer as there is no need to add
            t_diff++;
        }
        s_diff++;
       }

       // now we need to return the 
       int total_length=l2-t_diff;
       //cause the t_diff is for the same elements subtracting that with the total _length will give us the 
       // length of the elemnts that we need to add

       return total_length;
    }
}
