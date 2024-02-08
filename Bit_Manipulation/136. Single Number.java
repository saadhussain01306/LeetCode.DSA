class Solution {
    public int singleNumber(int[] nums) {
      //solve it by using XOR operations for any two same number
      // x ^x=0 so we will be left out with only one single element
     int len=nums.length;
     int result=0;
     for(int i=0;i<len;i++){
         result^=nums[i];
     }
     return result;   
    }
}
