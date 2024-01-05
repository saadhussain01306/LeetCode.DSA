public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;      // Left shift the result to make room for the next bit
            result |= (n & 1);  // Set the least significant bit of result with the current bit of n
            n >>= 1;           // Right shift n to get the next bit in the next iteration
        }
        return result;
    }
}
