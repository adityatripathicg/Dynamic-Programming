public class coinChange {
    public static int Maxi(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];
        
        // Initialize the first column to 1 as there's one way to make sum 0 (using no coins)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        
        // Initialize the first row (except dp[0][0]) to 0 as there's no way to make positive sums with 0 coins
        for (int j = 1; j <= sum; j++) {
            dp[0][j] = 0;
        }
        
        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int coins[] = {1, 2, 3};
        int sum = 5;
        System.out.println(Maxi(coins, sum));  // Output should be 5
    }
}
