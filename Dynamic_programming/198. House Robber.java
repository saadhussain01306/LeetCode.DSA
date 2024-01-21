class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        } else if (len == 1) {
            return nums[0];
        }

        // dp[i] represents the maximum amount that can be robbed up to house i
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < len; i++) {
            // Either rob the current house and add the amount from two houses ago,
            // or skip the current house and take the maximum amount from the previous house.
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[len - 1];
    }
}
