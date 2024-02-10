class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int left = 0;
        int right = s.length() - 1;
        char[] result = s.toCharArray();

        while (left < right) {
            if (vowels.contains(result[left]) && vowels.contains(result[right])) {
                // Swap vowels
                char temp = result[left];
                result[left] = result[right];
                result[right] = temp;
                left++;
                right--;
            } else if (vowels.contains(result[left])) {
                right--;
            } else {
                left++;
            }
        }

        return new String(result);
    }
}
