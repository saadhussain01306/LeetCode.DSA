/*

A good meal is a meal that contains exactly two different food items with a sum of deliciousness equal to a power of two.

You can pick any two different foods to make a good meal.

Given an array of integers deliciousness where deliciousness[i] is the deliciousness of the i​​​​​​th​​​​​​​​ item of food, return the number of different good meals you can make from this list modulo 109 + 7.

Note that items with different indices are considered different even if they have the same deliciousness value.

 

Example 1:

Input: deliciousness = [1,3,5,7,9]
Output: 4
Explanation: The good meals are (1,3), (1,7), (3,5) and, (7,9).
Their respective sums are 4, 8, 8, and 16, all of which are powers of 2.
Example 2:

Input: deliciousness = [1,1,1,3,3,3,7]
Output: 15
Explanation: The good meals are (1,1) with 3 ways, (1,3) with 9 ways, and (1,7) with 3 ways.
 

Constraints:

1 <= deliciousness.length <= 105
0 <= deliciousness[i] <= 220

*/

class Solution {
    public int countPairs(int[] deliciousness) {
        // Initialize mod value
        int MOD = 1000000007;

        // HashMap to store the frequency of each deliciousness value
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        long result = 0;

        // Loop through each item in the deliciousness array
        for (int food : deliciousness) {
            // Check for powers of two from 1 to 2^21 (as 2 * 2^20 is the max possible sum)
            for (int i = 0; i <= 21; i++) {
                int powerOfTwo = 1 << i; // This is 2^i

                // Check if the complement exists in the map
                int complement = powerOfTwo - food;
                if (freqMap.containsKey(complement)) {
                    result += freqMap.get(complement);
                    result %= MOD; // Take mod to avoid overflow
                }
            }

            // Update the frequency of the current food item in the map
            freqMap.put(food, freqMap.getOrDefault(food, 0) + 1);
        }

        // Return the result modulo 10^9 + 7
        return (int) result;
    }
}
