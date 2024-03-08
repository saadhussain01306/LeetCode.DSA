class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int left=0,right=0,max=0,cur=0;

        while(right<nums.length){
            int n=nums[right];
            if(set.contains(n)){
                while(nums[left]!=n){
                    cur-=nums[left];
                    set.remove(nums[left]);
                    left++;
                }
                set.remove(nums[left]);
                cur-=nums[left];
                left++;
            }
            else{
                set.add(nums[right]);
                cur+=nums[right];
                max=Math.max(cur,max);
                right++;
            }
        }

        return max;
    }
}
