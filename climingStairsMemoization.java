public class climingStairsMemoization {
    public static int ways(int n, int dp[]){
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        else if(n == 1 || n == 2){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = ways(n-1, dp) + ways(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        System.out.println(ways(n,dp));
    }
}
