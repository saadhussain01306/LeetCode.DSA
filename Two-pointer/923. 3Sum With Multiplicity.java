/*

Given an integer array arr, and an integer target, return the number of tuples i, j, k such that i < j < k and arr[i] + arr[j] + arr[k] == target.

As the answer can be very large, return it modulo 109 + 7.

 

Example 1:

Input: arr = [1,1,2,2,3,3,4,4,5,5], target = 8
Output: 20
Explanation: 
Enumerating by the values (arr[i], arr[j], arr[k]):
(1, 2, 5) occurs 8 times;
(1, 3, 4) occurs 8 times;
(2, 2, 4) occurs 2 times;
(2, 3, 3) occurs 2 times.
Example 2:

Input: arr = [1,1,2,2,2,2], target = 5
Output: 12
Explanation: 
arr[i] = 1, arr[j] = arr[k] = 2 occurs 12 times:
We choose one 1 from [1,1] in 2 ways,
and two 2s from [2,2,2,2] in 6 ways.
Example 3:

Input: arr = [2,1,3], target = 6
Output: 1
Explanation: (1, 2, 3) occured one time in the array so we return 1.
 

Constraints:

3 <= arr.length <= 3000
0 <= arr[i] <= 100
0 <= target <= 300

*/


class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int mod = 1_000_000_007;
        long result = 0;
        long[] c = new long[101];

        // Count the occurrences of each element in arr
        for (int i : arr) {
            c[i]++;
        }

        // Iterate over all possible combinations of i, j, and k
        for (int i = 0; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {
                int k = target - i - j;
                
                // Ensure k is within bounds
                if (k < 0 || k > 100) continue;

                // Case 1: i == j == k
                if (i == j && j == k) {
                    result += (c[i] * (c[i] - 1) * (c[i] - 2)) / 6;
                }
                // Case 2: i == j, but i != k
                else if (i == j && j != k) {
                    result += ((c[i] * (c[i] - 1)) / 2) * c[k];
                }
                // Case 3: i < j < k
                else if (i < j && j < k) {
                    result += (c[i] * c[j] * c[k]);
                }
            }
        }

        // Return result modulo mod
        return (int) (result % mod);
    }
}
