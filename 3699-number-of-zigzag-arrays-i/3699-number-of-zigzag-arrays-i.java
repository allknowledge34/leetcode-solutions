class Solution {
    private static final int MOD = 1000000007;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        int[] dp = new int[m];
        Arrays.fill(dp, 1);

        for (int i = 2; i <= n; i++) {
            for (int j = 0, k = m - 1; j < k; j++, k--) {
                int temp = dp[j];
                dp[j] = dp[k];
                dp[k] = temp;
            }
            int sum = 0;
            for (int j = 0; j < m; j++) {
                int temp = dp[j];
                dp[j] = sum;
                sum = (sum + temp) % MOD;
            }
        }

        int res = 0;
        for (int d : dp)
            res = (res + d) % MOD;

        return (res << 1) % MOD;
    }
}