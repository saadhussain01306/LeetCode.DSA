class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int carry = 0;
        int sum=0;
        StringBuilder result = new StringBuilder();

        while (l1 >= 0 || l2 >= 0) {
             sum=0+carry;
            if(l1>=0){
                sum+=num1.charAt(l1--)-'0';
            }
            if(l2>=0){
                sum+=num2.charAt(l2--)-'0';
            }
            
            carry = sum / 10;
            sum = sum % 10;

            result.append(sum);
        }

        if(carry==1){
            result.append(1);
        }

        return result.reverse().toString();
    }
}
