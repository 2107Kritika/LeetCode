class Solution {
    public boolean isHappy(int n) {
        int num1 = n;                      // like slow
        int num2 = getSquareSum(n);       // like fast

        while (num2 != 1 && num1 != num2) {
            num1 = getSquareSum(num1);                    // move 1 step
            num2 = getSquareSum(getSquareSum(num2));      // move 2 steps
        }

        return num2 == 1;
    }

    private int getSquareSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
