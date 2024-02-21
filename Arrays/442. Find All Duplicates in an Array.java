class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();

        for(int i:nums){
            if(h.contains(i)){
               ans.add(i);
            }
            else{
                h.add(i);
            }
        }
        return ans;
    }
}
