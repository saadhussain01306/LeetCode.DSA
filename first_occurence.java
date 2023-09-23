class Solution {
    public int strStr(String haystack, String needle) {
        int i,j;
        int h_len=haystack.length();
        int n_len=needle.length();
        if(h_len<n_len) return -1;

        for(i=0;i<=h_len-n_len;i++){
            for(j=0;j<n_len;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            if(j==n_len){
                return i;
            }
        }
        return -1;
    }
}
