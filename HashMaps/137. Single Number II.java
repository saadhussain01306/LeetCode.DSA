class Solution {
    public int singleNumber(int[] nums) {
         HashSet<Integer> seenOnce = new HashSet<>();
        HashSet<Integer> seenTwice = new HashSet<>();

        for (int num : nums) {
            
            if (seenOnce.contains(num)) {
                seenOnce.remove(num);
                seenTwice.add(num);
            } 
            else if (!seenTwice.contains(num)) {
                seenOnce.add(num);
            }
        }

        // the only element left out is the single number
        return seenOnce.iterator().next();
    }
}
