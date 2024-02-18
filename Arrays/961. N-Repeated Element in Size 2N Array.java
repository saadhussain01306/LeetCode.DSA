class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}

------------------------------------------------------------------------------------------------------------------

class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> h = new HashSet<>();

        for(int i : nums){
            if(h.contains(i)) return i;
            else h.add(i);
        }
        return 0;
    }
}
