class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];

        // Find the duplicated number
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                arr[0] = Math.abs(nums[i]);
            } else {
                nums[index] = -nums[index];
            }
        }

        // Find the missing number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[1] = i + 1;
                break;
            }
        }

        return arr;
    }
}
