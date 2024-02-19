class Solution {
    public boolean isPowerOfThree(int n) {
         if (n <= 0) {
            return false; // If n is non-positive, it cannot be a power of three
        }
        
        // Keep dividing n by 3 until it becomes 1
        while (n > 1) {
            if (n % 3 != 0) {
                return false; // If n is not divisible by 3, it is not a power of three
            }
            n /= 3;
        }
        
        return true; // If n becomes 1, it is a power of three
    }
}
