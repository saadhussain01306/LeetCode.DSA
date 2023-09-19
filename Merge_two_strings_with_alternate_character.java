//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < S1.length() && j < S2.length()) {
            result.append(S1.charAt(i++));
            result.append(S2.charAt(j++));
        }

        while (i < S1.length()) {
            result.append(S1.charAt(i++));
        }

        while (j < S2.length()) {
            result.append(S2.charAt(j++));
        }

        return result.toString();
    }
} 
