class Solution {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (true) {
            slow = squareSum(slow);              // move 1 step
            fast = squareSum(squareSum(fast));   // move 2 steps

            if (fast == 1) {
                return true;
            }

            if (slow == fast) {
                return false;
            }
        }
    }

    private int squareSum(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }

        return sum;
    }
}