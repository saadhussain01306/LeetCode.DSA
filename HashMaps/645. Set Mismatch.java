class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        HashSet<Integer> h = new HashSet<>();
        int n = nums.length;
        int sum = n * (n + 1) / 2; // Sum of natural numbers from 1 to n

        for (int i : nums) {
            if (h.contains(i)) {
                ans[0] = i; // Found the duplicated number
            } else {
                h.add(i);
                sum -= i; // Subtract each number in the array from the total sum
            }
        }
        
        ans[1] = sum; // The remaining sum is the missing number

        return ans;
    }
}
