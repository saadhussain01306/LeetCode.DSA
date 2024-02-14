class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        // Separate positive and negative integers
        for (int num : nums) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        // Merge positive and negative integers maintaining order
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        boolean positiveTurn = true;

        while (i < positive.size() || j < negative.size()) {
            if (positiveTurn && i < positive.size()) {
                result.add(positive.get(i++));
            } else if (!positiveTurn && j < negative.size()) {
                result.add(negative.get(j++));
            }

            positiveTurn = !positiveTurn;
        }

        // Convert List to array
        int[] resultArray = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            resultArray[k] = result.get(k);
        }

        return resultArray;
    }
}
