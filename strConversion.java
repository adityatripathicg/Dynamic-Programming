public class strConversion {
    public static int lcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n+1][m+1];
        for(int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for(int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    int a1 = dp[i-1][j];
                    int a2 = dp[i][j-1];
                    dp[i][j] = Math.max(a1, a2);
                }
            }
        }
        return dp[n][m];
    }
    public static void ans(String str1,String str2){
        int lcss = lcs(str1, str2);
        int del = str1.length()-lcss;
        int ins = str2.length()-lcss;
        System.out.println("No. of Insertion : "+ ins + "& No of Deletions :" + del);
    }
    public static void main(String[] args) {
        String str1 ="pear";
        String str2 ="sea";
        ans(str1, str2);
    }
}
