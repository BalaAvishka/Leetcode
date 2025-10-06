class Solution {
    public double average(int[] salary) {
        double sum=0;int i=1;int j=salary.length-2;
         Arrays.sort(salary);
         while(i<=j){
            sum=sum+salary[i];
            i++;
         }

     return sum/j;   }
        
    }
