class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j=0;
    int[] res=new int[2];
    for(i=0;i<nums.length-1;i++)
    {
        for(j=1;j<nums.length;i++)
    {
        if(nums[i]+nums[j]==target)
        {
            res[0]=i;
            res[1]=j;
            return res;
        }
    }
    }
    return res;
    }
}