class Solution {
    public int minMoves2(int[] nums) {
        // recognising the pattern of the two test cases
        // but not a proper way to do it
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int goal=0;
        while(i<j){
            goal+=nums[j]-nums[i];
            i++;
            j--;
        }
        return goal;
    }
}
