import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }

    class Pos {
        int x, y;

        public Pos(int x ,int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int R, C;
    static char[][] graph;
    static Stack<Pos>[] dp;

    private void solution() throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        graph = new char[R][C];
        dp = new Stack[C];
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<R;i++) {
            graph[i] = br.readLine().toCharArray();
        }

        int N = Integer.parseInt(br.readLine());

        // dp, stack
        for(int i=0;i<C;i++) {
            dp[i] = new Stack<>();
        }

        for(int i=0;i<N;i++) {
            int col = Integer.parseInt(br.readLine()) - 1;

            // 배치 됐는지 확인
            while(!dp[col].isEmpty() && graph[dp[col].peek().x][dp[col].peek().y] == 'O') {
                dp[col].pop();
            }

            // 돌 떨구기
            if(dp[col].isEmpty()) fall(0,col,col);
            else fall(dp[col].peek().x,dp[col].peek().y,col);
        }

        // 출력
        for(int i=0;i<R;i++) {
            for(int j=0;j<C;j++) {
                sb.append(graph[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    private void fall(int row, int col, int c) {
        while(row+1 < R && graph[row+1][col] != 'X') {  // 아랫칸이 벽이거나 가장 아랫줄이면 그대로 멈추기
            if(graph[row+1][col] == '.') {  // 비어있다면 이동
                row++;
            } else if(graph[row+1][col] == 'O') {   // 아래 돌이면
                // 왼쪽으로 미끄러지는 경우
                if(col-1 >= 0 && graph[row][col-1]=='.' && graph[row+1][col-1]=='.') {
                    row++;
                    col--;
                }
                // 오른쪽으로 미끄러지는 경우
                else if(col+1 < C && graph[row][col+1]=='.' && graph[row+1][col+1] =='.') {
                    row++;
                    col++;
                } else break;   // 둘다 아니면 멈추기
            }

            dp[c].push(new Pos(row,col));
        }

        graph[row][col] = 'O';
    }
}
