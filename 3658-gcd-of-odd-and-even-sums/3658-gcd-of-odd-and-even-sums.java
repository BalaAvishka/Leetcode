class Solution {
    public int gcdOfOddEvenSums(int n) {
       int sumodd=0;int sumeven=0;int i;
       int min=Math.min(sumodd,sumeven);
       for(i=1;i<=min;i++)
       {
        if(sumodd%i==0 && sumeven%i==0)
        n=i;
       }
 return n;    }
}