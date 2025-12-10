class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;     // Total sum of all elements
        int sum2 = 0;    // Running sum of left-side elements
        int[] res = new int[nums.length]; // Result array

        // Step 1: Calculate total sum
        for (int x : nums) {
            sum += x;
        }

        // Step 2: Traverse the array and compute differences
        for (int i = 0; i < nums.length; i++) {
            // Right sum = total sum - current element - left sum
            int rightSum = sum - nums[i] - sum2;
            int leftSum = sum2;

            // Store absolute difference between left and right sums
            res[i] = Math.abs(rightSum - leftSum);

            // Update left sum for next iteration
            sum2 += nums[i];
        }

        return res;
    }
}