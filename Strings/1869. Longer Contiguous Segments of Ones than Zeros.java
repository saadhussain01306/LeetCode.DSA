class Solution {
    public boolean checkZeroOnes(String s) {
        int c0=0;
        int c1=0;
        int max0=0;
        int max1=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                c0++;
                max0=Math.max(c0,max0);
                c1=0;
            }
            else{
                c1++;
                max1=Math.max(c1,max1);
                c0=0;
            }
        }

        return max1>max0;
    }
}
