class Solution {
    public int maximumWealth(int[][] accounts) {
      int noRows=accounts.length;
      int nocols=accounts[0].length;
      int sum,max=0;
      for(int rows=0;rows<noRows;rows++)
   {
    sum=0;
    for(int cols=0;cols<nocols;cols++)
   {
    sum=sum+accounts[rows][cols];
   }
   if(sum>max)
   max=sum;}  return max; }
 }