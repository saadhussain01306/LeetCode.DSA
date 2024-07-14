/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

 

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
 

Constraints:

1 <= s.length <= 30
s consists of lowercase English letters, digits, and square brackets '[]'.
s is guaranteed to be a valid input.
All the integers in s are in the range [1, 300].
*/


class Solution {
    public String decodeString(String s) {
        int k=0;//for storing the numbers
        Stack<Integer> count=new Stack<>();//for storing numbers
        Stack<StringBuilder>str= new Stack<>();//for storing the previous strings
        

        StringBuilder cur=new StringBuilder();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                k=k*10+(ch-'0');
                i++;//if k is a double digit number to handle that
            }
            else if(ch=='['){
                str.push(cur);//store the 
                count.push(k);//store the number
                i++;
                k=0;//new integer now
                cur=new StringBuilder();//initialize an empty string now

            }
            else if(ch==']'){
                i++;
                int reapeat=count.pop();
                StringBuilder decode=str.pop();
                for(int j=0;j<reapeat;j++){
                    decode.append(cur);
                }

                cur=decode;
            }
            else{
                cur.append(ch);
                i++;
            }
        }

        return cur.toString();
    
    }


}
