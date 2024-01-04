class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int len=nums.length;
        for(int n:nums){
            if(n!=0){
                nums[i++]=n;
            }
        }
        while(i<len){
            nums[i++]=0;
        }
    }
}
