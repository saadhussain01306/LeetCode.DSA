class Solution {
    public int matrixSum(int[][] nums) {
        
    for (int[] row : nums) {
        Arrays.sort(row);
    }
    
    //Sort each column
    for (int j = 0; j < nums[0].length; j++) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i][j] < nums[i - 1][j]) {
                int temp = nums[i][j];
                nums[i][j] = nums[i - 1][j];
                nums[i - 1][j] = temp;
            }
        }
    }
    
    
    int score = 0;
    // the last row will have the desired elements
    for (int num : nums[nums.length - 1]) {
        score += num;
    }
    return score;
    }
}
