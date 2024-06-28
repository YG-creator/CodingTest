import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

    static int[][] flies;
    static int N, M;

    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[] dir1X = {0,0,1,-1};
        int[] dir1Y = {1,-1,0,0};
        int[] dir2X = {1,1,-1,-1};
        int[] dir2Y = {1,-1,1,-1};

        for(int i=1;i<=T;i++) {
            // 입력
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            flies = new int[N][N];
            int maxCnt = 0;

            for(int j=0;j<N;j++) {
                st = new StringTokenizer(br.readLine());
                for(int k=0;k<N;k++) {
                    flies[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            // 스프레이 뿌리기
            for(int x=0;x<N;x++) {
                for(int y=0;y<N;y++) {
                    // +
                    int cnt1 = catchFly(x,y,dir1X,dir1Y);

                    // x
                    int cnt2 = catchFly(x,y,dir2X,dir2Y);

                    // 최댓값
                    maxCnt = Math.max(maxCnt,Math.max(cnt1,cnt2));
                }
            }

            sb.append("#").append(i).append(" ").append(maxCnt).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    private static int catchFly(int x, int y, int[] dirX, int[] dirY) {
        int ans = flies[x][y];

        for(int dir=0;dir<4;dir++) {
            for(int j=1;j<M;j++) {
                int nx = x + dirX[dir] * j;
                int ny = y + dirY[dir] * j;

                if(nx <  0 || nx >= N || ny < 0 || ny >= N) break;

                ans += flies[nx][ny];
            }
        }

        return ans;
    }
}