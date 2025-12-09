class Solution {
    public int specialTriplets(int[] nums) {
          int MOD = 1_000_000_007;
        int n = nums.length;
        Map<Integer, Integer> leftCount = new HashMap<>();
        Map<Integer, Integer> rightCount = new HashMap<>();
        for (int num : nums) {
            rightCount.put(num, rightCount.getOrDefault(num, 0) + 1);
        }
        long result = 0;    
        for (int j = 0; j < n; j++) {
            int val = nums[j];
            rightCount.put(val, rightCount.get(val) - 1);
            int leftVal = val * 2;
            int leftFreq = leftCount.getOrDefault(leftVal, 0);
            int rightFreq = rightCount.getOrDefault(leftVal, 0);
            result = (result + (long) leftFreq * rightFreq) % MOD;
                        leftCount.put(val, leftCount.getOrDefault(val, 0) + 1);
        }
        
        return (int) result;
    }
}