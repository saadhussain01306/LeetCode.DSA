class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal);
    }
}
/*(s + s): This concatenates the string s with itself. This effectively creates a string that contains all possible rotations of s.*/
