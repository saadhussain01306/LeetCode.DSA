class Solution {
public:
    int maxScore(string s) {
        int len=s.length();
        int goal=0;

        int zero=0;
        int left_ones=0;

        int total_ones = count(begin(s), end(s),'1');
        //total_ones in the string

        for(int i=0;i<=(len-2);i++){
            if(s[i]=='0'){
                zero++;
            }
            else{
                left_ones++;
            }
            int right_ones=total_ones-left_ones;

            goal=max(goal,zero+right_ones);
        }

        return goal;
    }
};
