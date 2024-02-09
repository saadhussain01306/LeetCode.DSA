public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        // Check if input array is null or empty
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        // Sort the input array in ascending order
        Arrays.sort(nums);

        // Get the length of the array
        int n = nums.length;

        // Initialize arrays to store dynamic programming information
        int[] dp = new int[n];  // dp[i] stores the length of the divisible subset ending at index i
        int[] prev = new int[n];  // prev[i] stores the index of the previous element in the subset

        // Initialize dp and prev arrays
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        // Variables to keep track of the maximum subset size and its ending index
        int maxSize = 1;
        int maxIndex = 0;

        // Dynamic Programming: Update dp and prev arrays
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                // Check if nums[i] is divisible by nums[j] and if extending the subset at j is beneficial
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    // Update dp and prev arrays
                    dp[i] = dp[j] + 1;
                    prev[i] = j;

                    // Update maximum subset size and its ending index
                    if (dp[i] > maxSize) {
                        maxSize = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }

        // Reconstruct the largest divisible subset
        List<Integer> result = new ArrayList<>();
        while (maxIndex != -1) {
            result.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }

        // Return the result
        return result;
    }
}
