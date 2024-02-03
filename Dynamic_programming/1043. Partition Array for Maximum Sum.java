class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        // Get the length of the input array
        int n = arr.length;
        
        // Initialize an array to store the maximum sum after partitioning at each index
        int[] dp = new int[n];

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // Initialize maxVal to keep track of the maximum value within the current subarray
            int maxVal = 0;

            // Iterate through possible subarray lengths (from 1 to k) ending at the current index i
            for (int j = 1; j <= k && i - j + 1 >= 0; j++) {
                // Update maxVal with the maximum value within the current subarray
                maxVal = Math.max(maxVal, arr[i - j + 1]);
                
                // Update dp[i] with the maximum sum considering the current subarray
                dp[i] = Math.max(dp[i], (i >= j ? dp[i - j] : 0) + maxVal * j);
            }
        }

        // Return the maximum sum stored in the last element of the dp array
        return dp[n - 1];
    }
}
