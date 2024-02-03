class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        String maxGoodInteger = "";

        for (int i = 0; i <= n - 3; i++) {
            String currentSubstr = num.substring(i, i + 3);

            if (isGoodInteger(currentSubstr) && currentSubstr.compareTo(maxGoodInteger) > 0) {
                maxGoodInteger = currentSubstr;
            }
        }

        return maxGoodInteger;
    }

    private static boolean isGoodInteger(String str) {
        return str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2);
    }

    }
