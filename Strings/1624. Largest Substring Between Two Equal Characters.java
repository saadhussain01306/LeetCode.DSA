class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int goal=-1;
        int len=s.length();

        for(int i=0;i<len;i++) //start from the left
        {
            for(int j=i+1;j<len;j++) //see the right of the stringwhich matchees the left character
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    goal=Math.max(goal,j-i-1);
                }
            }
        }
        return goal;
    }
}
