class Solution {
    public int majorityElement(int[] nums) {
        int majority=nums[0],j=1;int i=1;
        for( i=1;i<nums.length;i++)
        {
            if(j==0){
            j++;
            majority=nums[i];
        }
            else if(majority==nums[i])
            {
                j++;
            }else
            j--;
    }
    return majority;
}}