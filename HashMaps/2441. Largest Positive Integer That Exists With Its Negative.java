/*
Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.

Return the positive integer k. If there is no such integer, return -1.

 

Example 1:

Input: nums = [-1,2,-3,3]
Output: 3
Explanation: 3 is the only valid k we can find in the array.
Example 2:

Input: nums = [-1,10,6,7,-7,1]
Output: 7
Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
Example 3:

Input: nums = [-10,8,6,7,-2,-3]
Output: -1
Explanation: There is no a single valid k, we return -1.
*/


class Solution {
    public int findMaxK(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int k=Integer.MIN_VALUE;
        Arrays.sort(nums);
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==0){
               k=Math.max(k,nums[right]);
               left++;
               right--;//move to see the next elements
            }
            else if(sum>0){
                right--;
            }
            else{
                left++;
            }
        }

        return k!=Integer.MIN_VALUE?k:-1;
        
    }
}


class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        int res=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>0 && h.contains(-i)){
                res=Math.max(res,i);
            }
        }
        return res!=Integer.MIN_VALUE?res:-1;
    }
}
