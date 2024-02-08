class Solution {
    public int numSquares(int n) {
        // Create an array to store the minimum number of perfect squares for each number up to n
        int[] dp = new int[n + 1];

        // Initialize the array with a large value
        Arrays.fill(dp, Integer.MAX_VALUE);

        // Base case: 0 requires 0 perfect squares
        dp[0] = 0;

        // Iterate from 1 to n to fill the dp array
        for (int i = 1; i <= n; i++) {
            // Try each perfect square up to i
            for (int j = 1; j * j <= i; j++) {
                // Update the minimum number of perfect squares required for i
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        // The result is stored at index n in the dp array
        return dp[n];
    }
}
