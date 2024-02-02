class Solution {
    public int countTriples(int n) {
        int count=0;

        for(int a=1;a<=n;a++){
            for(int b=1;b<=n;b++){
               double c_sq=Math.pow(a,2)+Math.pow(b,2);
               int c=(int)Math.sqrt(c_sq);

               if(c<=n && c*c==c_sq){
                   count++;
               }
            }
        }

        return count;
    }
}
