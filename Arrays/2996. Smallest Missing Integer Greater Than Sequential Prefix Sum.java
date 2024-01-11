class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        int len=nums.length;
        for(int i=1;i<len;i++){
            if(nums[i]==nums[i-1]+1) {
                sum+=nums[i];
            }
            else{
                break;
            }
        }

        Arrays.sort(nums);

        for(int i=0;i<len;i++){
           if(nums[i]==sum){
               sum++;
           }
        }

        return sum;
    }
}
