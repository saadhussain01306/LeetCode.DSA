class Solution {
    public int findJudge(int n, int[][] trust) {
        int trust_count[]= new int[n+1];//for counting the total number of people that trust the judge
        HashSet<Integer>trust_set=new HashSet<>();//for the people that trust

        for(int[] relation:trust){
            int p1=relation[0];
            int p2=relation[1];

            trust_set.add(p1);
            trust_count[p2]++;  
        }

        for(int i=1;i<=n;i++){
            if((trust_count[i]==n-1) && (!trust_set.contains(i))){
                return i;
            }
        }

        return -1;
    }
}
