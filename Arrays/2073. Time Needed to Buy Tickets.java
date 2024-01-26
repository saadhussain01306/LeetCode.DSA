class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int len=tickets.length;
        int time=0;

    while(tickets[k]!=0){
          for(int i=0;i<len;i++){
              if(tickets[i]!=0 && tickets[k]!=0){
                  tickets[i]-=1;
                  time++;
              }
          }
    }

    return time;

    }
}
