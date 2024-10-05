/*

Given two strings s1 and s2, return true if s2 contains a 
permutation
 of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.

*/


class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(m<n) return false;
        int map1[] = new int[26];   //0
        
        for(int i=0;i<n;i++){
            map1[s1.charAt(i) - 'a']++;
        } 

        for(int i=0;i<=m-n;i++){
            int map2[] = new int[26];
            for(int j=0;j<n;j++){
                map2[s2.charAt(i+j) - 'a']++;
            }
            if(isMatched(map1,map2)){
                return true;
            }
        }
        return false;
    }

    private boolean isMatched(int map1[], int map2[]){
        for(int i=0;i<26;i++){
            if(map1[i]!=map2[i]) return false;
        }
        return true;
    }
    
}
