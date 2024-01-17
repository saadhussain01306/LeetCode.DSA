class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int count[]=new int[n];

         int cnt=0;
         int index=0;
        for(int i=0;i<n;i++){
            cnt=0;

            while(i<n-1 && arr[i]==arr[i+1]){
                cnt++;
                i++;
            }
            count[index++]=cnt;
            
        }

        Arrays.sort(count,0,index);
        int len=index;

        for(int i=0;i<len-1;i++){
            if(count[i+1]==count[i]){
                return false;
            }
        }

        return true;
    }
}
