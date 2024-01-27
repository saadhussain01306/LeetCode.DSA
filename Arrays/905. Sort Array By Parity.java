class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len=nums.length;
        int ans[]=new int[len];
        int i;
        int k=0;
        for(i=0;i<len;i++){
            if(nums[i]%2==0){
                ans[k]=nums[i];
                k++;
            }
        }

        
        for(int j=0;j<len;j++){
            if(nums[j]%2!=0){
                ans[k]=nums[j];
                k++;
            }
        }

        return ans;
    }
}
