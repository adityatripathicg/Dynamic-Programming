public class climbingStairs {
        public static int climbStairs(int n) {
            // Handle the base cases
            if(n == 1 || n == 2){
                return n;
            }
            //needed in only few test cases
            else if(n == 0){
                return 1;
            }
            else if(n < 0){
                return 0;
            }
            
            // Create a dp array to store the number of ways to reach each step
            int dp[] = new int[n+1];
            
            // Initialize the base cases
            dp[1] = 1;
            dp[2] = 2;
            
            // Fill the dp array using the recurrence relation
            for(int i=3; i<=n; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
            
            // Return the number of ways to reach the n-th step
            return dp[n];
        }
        public static void main(String[] args) {
            int n = 5;
            System.out.println(climbStairs(n));
        }
    }
