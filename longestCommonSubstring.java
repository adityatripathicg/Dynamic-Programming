public class longestCommonSubstring {
    public static int longestSubs(String s1,String s2) {
        int n = s1.length();
        int m = s2.length();
        int ans=0;
        int dp[][] = new int[n+1][m+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (n==0||m==0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                    ans = Math.max(ans, dp[i][j]);
                }
                if (s1.charAt(i-1)!=s2.charAt(j-1)) {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";
        System.out.println(longestSubs(str1, str2));
    }
}