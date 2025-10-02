class Solution {
    public boolean isMonotonic(int[] nums) {
        Boolean Isdecrease=true;
        Boolean Isincrease=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
            Isdecrease=false;
        }
            if(nums[i-1]>nums[i]){
            Isincrease=false;
            }}
            return(Isdecrease || Isincrease);
    }}
            