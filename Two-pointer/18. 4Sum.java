/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
*/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        if (len < 4) {
            return ans;
        }

        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates for i
            }
            for (int j = i + 1; j < len - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; // Skip duplicates for j
                }

                int k = j + 1;
                int l = len - 1;
                while (k < l) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        while (k < l && nums[k] == nums[k + 1]) k++; // Skip duplicates for k
                        while (k < l && nums[l] == nums[l - 1]) l--; // Skip duplicates for l
                        k++;
                        l--;
                    } else if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }

        return ans;
    }
}
