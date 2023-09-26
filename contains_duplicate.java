class Solution {
    public boolean containsDuplicate(int[] nums) {

        /* Arrproch first sort the array and then check if the adjacent elements are same if so return true,else iterate through all through all the elements and returtn false if all the elements are unique*/
        int len=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len-1;i++){
           if(nums[i]==nums[i+1]){
              return true; 
           }
        }
        return false;
  }
}
