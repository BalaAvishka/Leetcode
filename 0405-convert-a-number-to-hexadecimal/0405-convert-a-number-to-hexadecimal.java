class Solution {
    public String toHex(int num) {
         if (num == 0) return "0";

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        // Process 8 hex digits max for 32-bit int
        while (num != 0 && sb.length() < 8) {
            sb.append(hexChars[num & 15]); // num & 15 extracts last 4 bits
            num >>>= 4; // Unsigned right shift to fill with 0s
        }

        return sb.reverse().toString();
    }
}