class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int n = strs.length;
        boolean[] fixed = new boolean[n];

        for (int i = 0; i < strs[0].length(); i++) {
            boolean delete = false;

            for (int j = 0; j < n - 1; j++) {
                if (!fixed[j] && strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    delete = true;
                    break;
                }
            }

            if (delete) {
                count++;
                continue;
            }

            for (int j = 0; j < n - 1; j++) {
                if (!fixed[j] && strs[j].charAt(i) < strs[j + 1].charAt(i)) {
                    fixed[j] = true;
                }
            }
        }

        return count;
    }
}