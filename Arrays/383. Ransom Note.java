class Solution {
    public boolean canConstruct(String r, String m) {
       int freq1[]=new int[26];
       int freq2[]=new int[26];
       int n1=r.length();
       int n2=m.length();
       for(int i=0;i<n1;i++){
           freq1[r.charAt(i)-'a']++;
       }

       for(int i=0;i<n2;i++){
        freq2[m.charAt(i)-'a']++;
       }

       for(int i=0;i<26;i++){
           if(freq1[i]>freq2[i] || freq2[i]<freq1[i]){
            return false;
           }
       }

       return true;
    }
}
