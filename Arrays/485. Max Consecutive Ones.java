class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1=0;
        int max=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count1++;
                max=Math.max(count1,max);
            }
            else{
                count1=0;
            }
        }

        return max;
    }
}
