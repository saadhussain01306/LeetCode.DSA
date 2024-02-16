class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        // Count occurrences of each element
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Create a list of entry set and sort based on occurrences
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(countMap.entrySet());
        entryList.sort(Comparator.comparingInt(Map.Entry::getValue));

        // Remove the least frequent elements until k is exhausted
        int uniqueCount = entryList.size();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int occurrences = entry.getValue();
            if (k >= occurrences) {
                k -= occurrences;
                uniqueCount--;
            } else {
                break;
            }
        }

        return uniqueCount;
    }
}
