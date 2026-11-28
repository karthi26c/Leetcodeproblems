
class Solution {
    private int f(int i, int[] a, int[] dp) {

        if (i >= a.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        return dp[i] = Math.max(
            a[i] + f(i+2, a, dp),
            f(i+1, a, dp)
        );
    }

    public int rob(int[] a) {
        int n = a.length;

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return f(0, a, dp);
    }
}
