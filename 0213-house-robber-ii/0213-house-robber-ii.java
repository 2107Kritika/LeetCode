class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int max1 = robbery(nums, 0, n - 2);
        int max2 = robbery(nums, 1, n - 1);
        return Math.max(max1, max2);
    }

    private int robbery(int[] nums, int start, int end) {
        int len = end - start + 1;
        int[] dp = new int[len];

        if (len< 2) return nums[start];

        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < len; i++) {
            int rob = nums[start + i] + dp[i - 2];
            int skip = dp[i - 1];
            dp[i] = Math.max(rob, skip);
        }

        return dp[len - 1];
    }
}
