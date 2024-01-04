public class Solution {
    public int minMoves(int[] nums) {
       // adding 1 to n-1 elements is equivalent to subtracting
       // minimum number and then sum the differences
    //   [1,2,3] -> [2,3,3] -> [3,3,4] -> [4,4,4] = 3 moves

    //   [1,2,3] -> [1,2,2] -> [1,1,2] -> [1,1,1] = 3 moves
      int len=nums.length;
      if(len==0) return 0;
      Arrays.sort(nums);
      int min=nums[0];
      int goal=0;
      for(int n:nums) 
      {
        goal+=n-min;
          }
      return goal;
    }
}
