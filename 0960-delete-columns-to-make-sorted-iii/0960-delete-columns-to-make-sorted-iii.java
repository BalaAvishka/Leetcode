class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int[] dp = new int[cols];
        Arrays.fill(dp, 1); 
        for (int i = 1; i < cols; i++) {                         
            for (int j = 0; j < i; j++) {
                if (checkForAll(strs, i, j)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int longest = 0;
        for (int val : dp) {
            longest = Math.max(longest, val);
        }
        return cols - longest;
    }
    private static boolean checkForAll(String[] strs, int i, int j){
        for(String s : strs){
            if(s.charAt(j) > s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}