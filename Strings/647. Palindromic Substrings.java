class Solution {
    public int countSubstrings(String s) {
        int len=s.length();
        int goal=0;

        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(checkPalindrome(s,i,j)){
                    goal++;
                }
            }
        }

        return goal;
    }


public boolean checkPalindrome(String s,int left,int right){
    while(left<right){
        if(s.charAt(left++)!=s.charAt(right--)){
            return false;
        }
     }
    return true;
  }

}
