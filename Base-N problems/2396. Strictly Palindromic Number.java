class Solution {
    public boolean isStrictlyPalindromic(int n) {
        if (n <= 2) {
            // All integers less than or equal to 2 are strictly palindromic
            return true;
        }

        for (int base = 2; base <= n - 2; base++) {
            if (!isPalindromicInBase(n, base)) {
                return false;
            }
        }

        return true;
    }

    
    private boolean isPalindromicInBase(int num, int base) {
        StringBuilder numInBase = new StringBuilder();

        while (num > 0) {
            int digit = num % base;
            numInBase.insert(0, digit);
            num /= base;
        }

        return numInBase.toString().equals(numInBase.reverse().toString());
   
    }


}
