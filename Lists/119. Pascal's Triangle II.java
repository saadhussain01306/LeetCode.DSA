class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> ans= new ArrayList<>();

          List<Integer> first_row=new ArrayList<>();
          first_row.add(1);
          ans.add(first_row);

          for(int i=1;i<=rowIndex;i++){
              List<Integer> prev= ans.get(i-1);
              List<Integer> cur=new ArrayList<>();
              cur.add(1);

              for(int j=0;j<i-1;j++){
                 cur.add(prev.get(j)+prev.get(j+1));
              }

              cur.add(1);

              ans.add(cur);
          }

          

          return ans.get(rowIndex);
    }
}
