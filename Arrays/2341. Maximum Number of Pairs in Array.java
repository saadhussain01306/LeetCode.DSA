class Solution {
    public int[] numberOfPairs(int[] nums) {
     Arrays.sort(nums);

        int pairs = 0, leftover = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                pairs += count / 2;
                count = 1;
            }
        }

        pairs += count / 2;
        leftover = nums.length - 2 * pairs;

        return new int[]{pairs, leftover};   
    }
}
