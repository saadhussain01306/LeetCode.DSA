class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
         List<Integer> rowMins = new ArrayList<>();
        List<Integer> colMaxs = new ArrayList<>();

        // Find the minimum element in each row
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            rowMins.add(min);
        }

        // Find the maximum element in each column
        for (int j = 0; j < matrix[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            colMaxs.add(max);
        }

        // Find the intersection of rowMins and colMaxs
        List<Integer> luckyNumbers = new ArrayList<>();
        for (int min : rowMins) {
            if (colMaxs.contains(min)) {
                luckyNumbers.add(min);
            }
        }

        return luckyNumbers;

    }
}
