class Solution {
    public int primePalindrome(int n) {
    while (true) {
            if (isPalindrome(n) && isPrime(n)) return n;

            // Skip even-length palindromes > 11, as they're divisible by 11
            if (n > 11 && Integer.toString(n).length() % 2 == 0) {
                n = (int)Math.pow(10, Integer.toString(n).length());
            } else {
                n++;
            }
        }
    }

    private boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}

