class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len=nums.length;
        int ans[]=new int[len];
        int count=0;
        for(int i=0;i<len;i++){
            count=0;
            for(int j=0;j<len;j++){
                    
                if(nums[j]<nums[i] && j!=i){
                    count++;
                }
            }
            ans[i]=count;
        }

        return ans;
    }
}
