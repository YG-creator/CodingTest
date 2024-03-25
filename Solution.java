import java.util.HashMap;
import java.util.Map;

class Solution {
    int MOD = 20170805;

    public int solution(int m, int n, int[][] cityMap) {
        int[][][] dp = new int[m][n][2];	// 오른쪽, 아래쪽

        // 초기값
        dp[0][0][0] = 1;
        dp[0][0][1] = 1;
        for(int i=1;i<n;i++) {	// 첫행
            if(cityMap[0][i] != 1) dp[0][i][0] = dp[0][i-1][0];
        }
        for(int i=1;i<m;i++) {	// 첫열
            if(cityMap[i][0] != 1) dp[i][0][1] = dp[i-1][0][1];
        }

        // 3차 dp - x,y,온방향
        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
                if(cityMap[i][j-1] == 0) {
                    dp[i][j][0] = (dp[i][j-1][0] + dp[i][j-1][1]) % MOD;
                } else if(cityMap[i][j-1] == 1) {
                    dp[i][j][0] = 0;
                } else {
                    dp[i][j][0] = dp[i][j-1][0];
                }

                if(cityMap[i-1][j] == 0) {
                    dp[i][j][1] = (dp[i-1][j][0] + dp[i-1][j][1]) % MOD;
                } else if(cityMap[i-1][j] == 1) {
                    dp[i][j][1] = 0;
                } else {
                    dp[i][j][1] = dp[i-1][j][1];
                }
            }
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i : map)

        //이동 가능한 전체 경로의 수를 20170805로 나눈 나머지
        return (dp[m-1][n-1][0] + dp[m-1][n-1][1]) % MOD;
    }
}