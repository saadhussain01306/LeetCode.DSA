/*
You are given a string s and two integers x and y. You can perform two types of operations any number of times.

Remove substring "ab" and gain x points.
For example, when removing "ab" from "cabxbae" it becomes "cxbae".
Remove substring "ba" and gain y points.
For example, when removing "ba" from "cabxbae" it becomes "cabxe".
Return the maximum points you can gain after applying the above operations on s.

 

Example 1:

Input: s = "cdbcbbaaabab", x = 4, y = 5
Output: 19
Explanation:
- Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
- Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
- Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
- Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
Total score = 5 + 4 + 5 + 5 = 19.
Example 2:

Input: s = "aabbaaxybbaabb", x = 5, y = 4
Output: 20
 

Constraints:

1 <= s.length <= 105
1 <= x, y <= 104
s consists of lowercase English letters.
*/


class Solution {
    public int maximumGain(String s, int x, int y) {
        boolean flag=false;
        int ans=0;
        if(x>y){
            ans+=compute(s,'a','b',x,y);

        }
        else{
            ans+=compute(s,'b','a',y,x);
        }
        
        return ans;
        
    }
    private int compute(String s ,char first,char sec,int highpoints,int lowpoints){
        int ans=0;
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==first && ch==sec){
                ans+=highpoints;
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        String s1=str.reverse().toString();
         st.clear();//clear stack contents
        for(char ch:s1.toCharArray()){
            if(!st.isEmpty() && st.peek()==sec && ch==first){
                ans+=lowpoints;
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        return ans;
    }
}
