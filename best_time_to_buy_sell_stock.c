int maxProfit(int* prices, int pricesSize){
      int min=prices[0];
      int max=-1;
      for(int i=0;i<pricesSize;i++){
            int money=prices[i]-min;
            if(money>max) max=money;
            if(min>prices[i]) min=prices[i];
      }
      return max;
}
