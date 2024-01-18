import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger big1 = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);
        BigInteger result = big1.multiply(big2);
        return result.toString();
    }
}
