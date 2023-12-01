class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;

        // XOR all characters in string s
        for (char c : s.toCharArray()) {
            result ^= c;
        }

        // XOR all characters in string t
        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }
}
/*lets take an instance to solve the problem
s="ab"
t="abc"
a=01100001
b=01100010
a^b=00000011
so foe first for loop r=00000011

for t=abc
r^a=00000011^01100001=01100010^b i.e 01100010=000000^c=c
return c as it is character it returns c
*/
