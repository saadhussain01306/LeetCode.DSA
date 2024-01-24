class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }

        // Calculate cumulative count
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        // Create the result array
        int[] result = new int[nums.length];

        // Populate the result array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[i] = count[nums[i] - 1];
            }
        }

        return result;  
    }
}
