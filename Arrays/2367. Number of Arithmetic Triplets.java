class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
           int count = 0;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int first=Math.abs(nums[i] - nums[j]);
                if(first==diff){
                for (int k = j + 1; k < n; k++) {
                    int sec=Math.abs(nums[j] - nums[k]);
                    if(sec==diff){
                        count++;
                    }

                }
                }
            }
        }

        return count;
    }
}
