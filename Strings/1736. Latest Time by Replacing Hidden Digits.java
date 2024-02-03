class Solution {
    public String maximumTime(String time) {
    char[] timeArray = time.toCharArray();

        // Handle hours
        if(timeArray[0] == '?'){
            timeArray[0] = (timeArray[1] <= '3' || timeArray[1] == '?') ? '2' : '1';
        }
        if(timeArray[1] == '?'){
            timeArray[1] = (timeArray[0] == '2') ? '3' : '9';
        }

        // Handle minutes
        if(timeArray[3] == '?'){
            timeArray[3] = '5';
        }
        if(timeArray[4] == '?'){
            timeArray[4] = '9';
        }

        return new String(timeArray);   
    }
}
