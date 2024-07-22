/*
Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.

 

Example 1:

Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
Example 2:

Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
Example 3:

Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]
 

Constraints:

1 <= nums.length <= 100
-100 <= nums[i] <= 100
*/


class Solution {
    public int[] frequencySort(int[] nums) {
         // Step 1: Count the frequency of each number
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Sort the numbers based on their frequency and value
        List<Integer> sortedList = new ArrayList<>();
        for (int num : nums) {
            sortedList.add(num);
        }
        Collections.sort(sortedList, (a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA == freqB) {
                return b - a; // Sort by value in decreasing order
            } else {
                return freqA - freqB; // Sort by frequency in increasing order
            }
        });

        // Step 3: Convert the sorted list back to an array
        int[] result = new int[nums.length];
        for (int i = 0; i < sortedList.size(); i++) {
            result[i] = sortedList.get(i);
        }

        return result;
    }
}
