class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        
        
        // strip all white spaces
        s=s.replace(" ","");
        t=t.replace(" ","");

        int[] alphabet_count=new int[26];
        
        for(int i=0;i<s.length();i++){
            alphabet_count[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            alphabet_count[t.charAt(i)-'a']--;
        }

        for(int count:alphabet_count){
            if(count!=0){
                return false;
            }
        }

        return true;

    }
}
