class Solution {
    public int findGCD(int[] nums) {
        int i;int n=0;
          int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
         int j=Math.min(min,max);
       for(i=1;i<=min;i++)
       {
        if(min%i==0 && max%i==0)
       n=i;
       }
 return n; 
    }
}