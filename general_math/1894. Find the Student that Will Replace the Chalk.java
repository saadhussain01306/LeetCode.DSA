class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        // Calculate the total chalk used in one full cycle
        long total_chalk = 0;
        for (int ch : chalk) {
            total_chalk += ch;
        }

        // Reduce k to the remainder of chalk after complete cycles
        k %= total_chalk;

        // Iterate through students to find the one who needs to replace the chalk
        int student = 0;
        while (k >= chalk[student]) {
            k -= chalk[student++];
        }

        return student;
    }
}
