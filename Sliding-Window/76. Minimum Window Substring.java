class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) {
            return "";
        }

        // Map to store the frequency of characters in t
        Map<Character, Integer> targetFreqMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreqMap.put(c, targetFreqMap.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int requiredChars = targetFreqMap.size(); // Number of distinct characters in t
        int formedChars = 0; // Number of distinct characters formed in the current window
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0, minRight = 0;

        // Map to store the frequency of characters in the current window
        Map<Character, Integer> windowFreqMap = new HashMap<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            windowFreqMap.put(currentChar, windowFreqMap.getOrDefault(currentChar, 0) + 1);

            if (targetFreqMap.containsKey(currentChar) &&
                    windowFreqMap.get(currentChar).equals(targetFreqMap.get(currentChar))) {
                formedChars++;
            }

            while (formedChars == requiredChars) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                    minRight = right + 1;
                }

                char leftChar = s.charAt(left);
                windowFreqMap.put(leftChar, windowFreqMap.get(leftChar) - 1);

                if (targetFreqMap.containsKey(leftChar) &&
                        windowFreqMap.get(leftChar) < targetFreqMap.get(leftChar)) {
                    formedChars--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minRight);
    }
}
