class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int res=nums[0]+nums[1]+nums[2];

       int len=nums.length;
       int min_diff=Integer.MAX_VALUE;
       

       for(int i=0;i<len-2;i++){
            int left=i+1;
            int right=len-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }
                else if(sum>target){
                    right--;
                }
                else{
                    left++;
                }

                int diff=Math.abs(sum-target);
                if(diff<min_diff){
                    res=sum;
                    min_diff=diff;
                }
            }
       } 

       return res;
    }
}
