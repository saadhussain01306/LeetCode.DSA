class Solution {
    public int maxScore(String s) {
       int len=s.length();

       int goal=0;

       for(int i=0;i<=(len-2); i++){
           //count 0 in the left string
           //i.e from 0 to i
           int zero_count=0;
           for(int j=0;j<=i;j++){
               if(s.charAt(j) == '0')
                zero_count++;
           }
           
           int one_count=0;
           for(int k=i+1;k<=(len-1);k++){
               if(s.charAt(k) == '1')
               one_count++;
           }

           goal=Math.max(goal,zero_count+one_count);
       }
       
       return goal;
    }
}

