class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        long perimeter=-1;

        for(int i=0;i<nums.length;i++){
             // check if the coming edge length is less
             // than the sum of the other sides 
             // add that to the perimeter 
            if(nums[i]<sum){
                perimeter=nums[i]+sum;
            }
            sum+=nums[i];
        }

        return perimeter;
    }
}
