/*

A ramp in an integer array nums is a pair (i, j) for which i < j and nums[i] <= nums[j]. The width of such a ramp is j - i.

Given an integer array nums, return the maximum width of a ramp in nums. If there is no ramp in nums, return 0.

 

Example 1:

Input: nums = [6,0,8,2,1,5]
Output: 4
Explanation: The maximum width ramp is achieved at (i, j) = (1, 5): nums[1] = 0 and nums[5] = 5.
Example 2:

Input: nums = [9,8,1,0,1,9,4,0,4,1]
Output: 7
Explanation: The maximum width ramp is achieved at (i, j) = (2, 9): nums[2] = 1 and nums[9] = 1.
 

Constraints:

2 <= nums.length <= 5 * 104
0 <= nums[i] <= 5 * 104

*/


class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        
        // Create an array of indices
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        // Sort indices based on the value of nums[i]
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));
        
        // Track the minimum index and maximum width
        int minIndex = n;
        int maxWidth = 0;
        
        // Traverse the sorted indices array
        for (int i : indices) {
            // Check the difference and update maxWidth
            maxWidth = Math.max(maxWidth, i - minIndex);
            // Update minIndex to be the smallest index seen so far
            minIndex = Math.min(minIndex, i);
        }
        
        return maxWidth;
    }
}
