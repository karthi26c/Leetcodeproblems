
class Solution {
    private int f(int n,int[]cost,int[]dp) {

        if (n == 0 || n == 1) {
            return 0;
        }
        if(dp[n]!=-1) {
            return dp[n];
        }
        return dp[n]=Math.min(f(n-1,cost,dp)+cost[n-1],f(n-2,cost,dp)+cost[n-2]);
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return f(n,cost,dp);
    }
}
