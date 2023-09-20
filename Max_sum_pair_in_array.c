int maxSum(int* nums, int numsSize){
    int maxSum = -1; // To store the maximum sum found so far

    for (int i = 0; i < numsSize; i++) {
        

        for (int j = i + 1; j < numsSize; j++) {
            int first = nums[i];
            int second = nums[j];
            int firstMaxDigit = -1;
            int secondMaxDigit = -1;

            // Find the maximum digit in the first number
            while (first > 0) {
                int digit = first % 10;
                if (digit > firstMaxDigit) {
                    firstMaxDigit = digit;
                }
                first /= 10;
            }

            // Find the maximum digit in the second number
            while (second > 0) {
                int digit = second % 10;
                if (digit > secondMaxDigit) {
                    secondMaxDigit = digit;
                }
                second /= 10;
            }

            // Check if the maximum digits are equal
            if (firstMaxDigit == secondMaxDigit) {
                int currentSum = nums[i] + nums[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
    }

    return maxSum;
}
