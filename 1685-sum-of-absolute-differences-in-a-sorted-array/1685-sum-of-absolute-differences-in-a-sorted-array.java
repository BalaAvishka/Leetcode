class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
         int n = nums.length;
        int[] prefix = new int[n + 1];  // prefix sum array
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            // sum of distances to elements on the left
            int leftSum = nums[i] * i - prefix[i];
            // sum of distances to elements on the right
            int rightSum = (prefix[n] - prefix[i + 1]) - nums[i] * (n - i - 1);
            result[i] = leftSum + rightSum;
        }
        
        return result;
    }
}