public class TwoEggsPuzzle {


    static int[] dp = new int[1001];
    public static int twoEggDrop(int n) {
        if (dp[n] == 0)
            for (int i = 1; i <= n; ++i)
                dp[n] = Math.min(dp[n] == 0 ? n : dp[n], 1 + Math.max(i - 1, twoEggDrop(n - i)));
        return dp[n];
    }

    public static void main(String[] args) {

        int i = twoEggDrop(10);

        System.out.println(i);
    }

}