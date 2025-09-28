class Solution {
    public boolean isThree(int n) {
    int i;int count=0;
    for(i=1;i<=n;i++)
        if(n%i==0)
        {
        count++;
        }
      return (count==3);
    }
    }