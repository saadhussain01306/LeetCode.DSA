class Solution {
    public int[] applyOperations(int[] nums) {
        int len=nums.length;
        int i=0;
        for(i=0;i<len-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        i=0;
        for(int n:nums){
            if(n!=0){
                nums[i++]=n;
            }
        }
        while(i<len){
            nums[i++]=0;
        }
        return nums;
    }
}
