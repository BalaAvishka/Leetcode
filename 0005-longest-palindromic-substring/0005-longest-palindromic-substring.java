class Solution {
    public String longestPalindrome(String s) {
        
        if (s.length() < 2) return s;

        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            // Odd length
            String odd = expand(s, i, i);
            // Even length
            String even = expand(s, i, i + 1);

            // Choose longer
            String current = odd.length() > even.length() ? odd : even;

            if (current.length() > longest.length()) {
                longest = current;
            }
        }

        return longest;
    }

    // Expand around the center
    private String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
    
