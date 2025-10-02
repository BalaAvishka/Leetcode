class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;int i,j=0;
    for(i=0;i<=n;i++){
        for(j=0;j<n;j++){
            if(nums[j]==i){
            break;
        }}
        if(j==n){
            return i;
        }
    }  return -1;}
  
}



 