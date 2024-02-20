class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
        
        // Initialize goal to n, as it is the maximum possible missing number
        int goal = n;
        
        // XOR 
        for (int i = 0; i < n; i++) {
            goal ^= i ^ nums[i];
        }
        
        return goal;
    }
}
