class Solution {
    public int countDigits(int num) {
        int count = 0;
        int temp=num;
        while (num != 0) {
            int last_digit = num % 10;
            if (last_digit != 0 && temp % last_digit == 0) {
                count++;
            }
            num /= 10;
        } 
        return count;
    }
}
