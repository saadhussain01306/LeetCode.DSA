class Solution {
    public int lengthOfLIS(int[] nums) {
        // using dynamic programming 
        // initialize an array with all values equal to 1
       // then increase the appropriate array position with the maximum length of the subsequence
        int len= nums.length;
        int goal=1;
        int []dp = new int[len];
        Arrays.fill(dp,1);
        for(int i=1;i<len;i++){
            for(int j=i;j>=0;j--){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                goal=Math.max(goal,dp[i]);
            }
        }
        return goal;

    }
}
