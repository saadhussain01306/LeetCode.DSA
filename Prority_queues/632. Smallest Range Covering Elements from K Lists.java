/*

You have k lists of sorted integers in non-decreasing order. Find the smallest range that includes at least one number from each of the k lists.

We define the range [a, b] is smaller than range [c, d] if b - a < d - c or a < c if b - a == d - c.

 

Example 1:

Input: nums = [[4,10,15,24,26],[0,9,12,20],[5,18,22,30]]
Output: [20,24]
Explanation: 
List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
List 2: [0, 9, 12, 20], 20 is in range [20,24].
List 3: [5, 18, 22, 30], 22 is in range [20,24].
Example 2:

Input: nums = [[1,2,3],[1,2,3],[1,2,3]]
Output: [1,1]
 

Constraints:

nums.length == k
1 <= k <= 3500
1 <= nums[i].length <= 50
-105 <= nums[i][j] <= 105
nums[i] is sorted in non-decreasing order.

*/

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        //min heap
        // [element, listIndex, elementIndex]
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int a[], int b[]){
                return a[0] - b[0]; //inc
            }
        });
        int k = nums.size();
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < k; i++) {
            int minVal = nums.get(i).get(0);
            pq.offer(new int[]{minVal, i, 0});
            max = Math.max(max, minVal);
        }
        int[] minRange = {0, Integer.MAX_VALUE};
        while (true) {
            int top[] = pq.poll();
            int minElement = top[0], listIndex = top[1], elementIndex = top[2];
            if (max - minElement < minRange[1] - minRange[0]) {
                minRange[0] = minElement;
                minRange[1] = max;
            }
            if (elementIndex == nums.get(listIndex).size() - 1) break;
            int next = nums.get(listIndex).get(elementIndex + 1);
            max = Math.max(max, next);
            pq.offer(new int[]{next, listIndex, elementIndex + 1});
        }
        return minRange;
    }
}
