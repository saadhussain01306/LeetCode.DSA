class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(check(i)){
              list.add(i);
            } 
        }

        return list;
    }

    private boolean check(int i){
        int n=i;
        while(n!=0){
            if(n%10==0){
                return false;//if the last digit is 0 it is not a self dividing number
            }
            if(i%(n%10)!=0){
                return false;
                //check if the last digit divides the ith element
            }
            n/=10;
        }
        return true;
    }
}
