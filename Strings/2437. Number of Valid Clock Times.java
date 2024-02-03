class Solution {
    public int countTime(String time) {
        int count = 0;

        for (char h1 = '0'; h1 <= '2'; h1++) {
            for (char h2 = '0'; h2 <= (h1 == '2' ? '3' : '9'); h2++) {
                for (char m1 = '0'; m1 <= '5'; m1++) {
                    for (char m2 = '0'; m2 <= '9'; m2++) {
                        if ((time.charAt(0) == '?' || time.charAt(0) == h1) &&
                            (time.charAt(1) == '?' || time.charAt(1) == h2) &&
                            (time.charAt(3) == '?' || time.charAt(3) == m1) &&
                            (time.charAt(4) == '?' || time.charAt(4) == m2)) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
