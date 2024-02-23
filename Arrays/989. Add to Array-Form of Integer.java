class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int carry = 0;
        int len = num.length - 1;

        while (len >= 0 || k != 0) {
            int sum = 0 + carry;
            if (len >= 0) {
                sum += num[len];
                len--;
            }
            
            int digit = k % 10;
            k = k / 10;
            sum += digit;

            carry = sum / 10;
            sum = sum % 10;

            list.add(sum);
        }

        if (carry == 1) {
            list.add(1);
        }

        // Reverse the list after adding elements
        Collections.reverse(list);

        return list;
    }
}
