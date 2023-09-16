/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* numbers, int numbersSize, int target, int* returnSize){
     int i=0,j=numbersSize-1,sum;
     while(i<j){
        sum=numbers[i]+numbers[j];
        if(sum>target) j--;
        else if(sum<target) i++;
        else break;
     }
     int *ans=(int*)malloc(2*sizeof(int));
      *returnSize=2;
      ans[0]=i+1;
      ans[1]=j+1;
      return ans;

}
