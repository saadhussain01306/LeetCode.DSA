public class Solution {
        public static String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder reverse = new StringBuilder(word).reverse();
                if (word.equals(reverse.toString())) {
                     return word;
                    }
                 }
        return ""; 
         }                                                                                   
}

---------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(checkPallindrome(s)){
                return s;
            }
        }
        return "";
    }

    private boolean checkPallindrome(String s){
        int left=0;
        int right=s.length()-1;

        while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
