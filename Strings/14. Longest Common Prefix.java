class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String s1=strs[0];
        String s2=strs[strs.length-1];

        int prefix=0;
        while(prefix<s1.length() && prefix<s2.length()){
             if(s1.charAt(prefix)==s2.charAt(prefix)){
                 prefix++;
             }
             else{
                 break;
             }
        }

        return s1.substring(0,prefix);//inclusive of 0 and exclusive of prefix
    }
}
