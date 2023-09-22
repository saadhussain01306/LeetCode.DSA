class Solution {
    int missingNumber(int array[], int n) {
        Arrays.sort(array);
        int i;
        for(i=0;i<array.length;i++){
            if((i+1)!=array[i]){
                return i;
            }
        }
        return i;
        
    }
}
