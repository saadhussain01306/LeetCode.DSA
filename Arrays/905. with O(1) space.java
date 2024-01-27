class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int j=0,temp=0;
       int len=nums.length;
       for(int i=0;i<len;i++){
           if(nums[i]%2==0){
               temp=nums[i];
               nums[i]=nums[j];
               nums[j]=temp;
               j++;
           }
       }   
       return nums;
    }
}
