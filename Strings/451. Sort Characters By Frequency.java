class Solution {
    public String frequencySort(String s) {
            // Step 1: Count the frequency of each character using an array
        int[] charFrequency = new int[128];
        for (char c : s.toCharArray()) {
            charFrequency[c]++;
        }

        // Step 2: Create a max heap (PriorityQueue) based on the character frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> charFrequency[b] - charFrequency[a]);

        for (char c = 0; c < 128; c++) {
            if (charFrequency[c] > 0) {
                maxHeap.add(c);
            }
        }

        // Step 3: Build the sorted string
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char currentChar = maxHeap.poll();
            int frequency = charFrequency[currentChar];

            for (int i = 0; i < frequency; i++) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
