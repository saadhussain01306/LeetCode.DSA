class Solution {
    public int lengthOfLongestSubstring(String s) {
        //sliding window
        int left=0,right=0,max=0;
        HashSet<Character> set= new HashSet<>();
        while(right<s.length()){
            char c=s.charAt(right);
            if(set.contains(c)){
                // move untill we get the matched element
                while(s.charAt(left)!=c){  
                    set.remove(s.charAt(left));
                     left++;
                }
                //remove the matched element as well and increment the left
                set.remove(s.charAt(left));
                left++;

            }
            else{
                set.add(c);
                max=Math.max(right-left+1,max);
                right++;
            }
        }

        return max;
    }
}
