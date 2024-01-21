class Solution {
    public int rob(int[] nums) {
        int len = nums.length;

        if (len == 0) {
            return 0;
        } else if (len == 1) {
            return nums[0];
        }

        // Rob houses from 0 to len-2 (excluding the last house)
        int maxRob1 = robHelper(nums, 0, len - 2);

        // Rob houses from 1 to len-1 (excluding the first house)
        int maxRob2 = robHelper(nums, 1, len - 1);

        // Return the maximum amount between the two scenarios
        return Math.max(maxRob1, maxRob2);
    }

    private int robHelper(int[] nums, int start, int end) {
        int len = end - start + 1;

        if (len == 1) {
            return nums[start];
        }

        int[] dp = new int[len];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[start + i], dp[i - 1]);
        }

        return dp[len - 1];
    }
}
