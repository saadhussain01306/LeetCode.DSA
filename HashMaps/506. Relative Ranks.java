// You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

// The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

// The 1st place athlete's rank is "Gold Medal".
// The 2nd place athlete's rank is "Silver Medal".
// The 3rd place athlete's rank is "Bronze Medal".
// For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
// Return an array answer of size n where answer[i] is the rank of the ith athlete.

 

// Example 1:

// Input: score = [5,4,3,2,1]
// Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
// Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
// Example 2:

// Input: score = [10,3,8,9,4]
// Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
// Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

 

// Constraints:

// n == score.length
// 1 <= n <= 104
// 0 <= score[i] <= 106
// All the values in score are unique.

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(score[i], i); // Store the index of each score
        }

        Arrays.sort(score);
        String[] res = new String[len];
        for (int i =0; i<len; i++) {
            int index = map.get(score[i]); // Get the index of the original score
            if (i == len - 1) {
                res[index] = "Gold Medal"; // Assign Gold Medal to the first place
            } else if (i == len - 2) {
                res[index] = "Silver Medal"; // Assign Silver Medal to the second place
            } else if (i == len - 3) {
                res[index] = "Bronze Medal"; // Assign Bronze Medal to the third place
            } else {
                res[index] = Integer.toString(len - i); // Assign the placement number to the rest
            }
        }
        return res;
    }
}
