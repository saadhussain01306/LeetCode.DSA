class Solution {
    public boolean areOccurrencesEqual(String s) {
        char[] arr = s.toCharArray();

        int[] freq = new int[26];

        for (char c : arr) {
            freq[c - 'a']++;
        }

        int expectedCount = 0;
        for (int count : freq) {
            if (count != 0) {
                if (expectedCount == 0) {
                    expectedCount = count;
                } else if (count != expectedCount) {
                    return false;
                }
            }
        }

        return true;
    }
}
