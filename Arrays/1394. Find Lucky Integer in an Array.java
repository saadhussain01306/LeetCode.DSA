class Solution {
    public int findLucky(int[] arr) {

        int freq[]=new int[501];
        Arrays.sort(arr);

        for(int i:arr){
            freq[i]++;
        }

        int max=-1;
        for(int i:arr){
            if(i==freq[i]){
                max=i;
            }
        }

        return max;
    }
}
