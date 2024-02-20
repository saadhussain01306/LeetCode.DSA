class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();

        for(int i : nums){
            if(h.contains(i)) return i;
            else h.add(i);
        }
        return 0;
    }
}
