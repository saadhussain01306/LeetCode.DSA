class Solution {
    public int numIdenticalPairs(int[] nums) {
        int len=nums.length;

         int count=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }

        return count;
    }
}
