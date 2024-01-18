class Solution {
    public int romanToInt(String s) {
        int len=s.length();
        int prev=0;
        int sum=0;

        for (int i=len-1;i>=0;i--){
            char c=s.charAt(i);
            int value;

            switch(c){
                case 'I':
                     value=1;
                     break;
                case 'V' :
                      value=5;
                      break;
                case 'X':
                       value=10;
                       break;
                case 'L':
                        value=50;
                        break;
                 case 'C':
                        value=100;
                        break;
                case 'D':
                        value=500;
                        break;
                case 'M':
                        value=1000;
                        break;
                default:
                       value=0;
                       break;

            }

            if(value<prev){
                sum-=value;
            }
            else{
                sum+=value;
            }
           prev=value;

        }

        return sum;
    }
}
