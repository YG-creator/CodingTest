import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }

    class Oper {
        int r,c,s;

        public Oper(int r, int c, int s) {
            this.r = r;
            this.c = c;
            this.s = s;
        }
    }

    static int N, M, K, ans;
    static int[][] graph;
    static Oper[] opers, select;
    static boolean[] visited;

    private void solution() throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        opers = new Oper[K];
        select = new Oper[K];
        visited = new boolean[K];
        ans = Integer.MAX_VALUE;

        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<K;i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken())-1;
            int c = Integer.parseInt(st.nextToken())-1;
            int s = Integer.parseInt(st.nextToken());
            opers[i] = new Oper(r,c,s);
        }

        // 백트래킹
        perm(0);

        // 출력
        System.out.println(ans);
        br.close();
    }

    private void perm(int depth) {
        if(depth == K) {
            int[][] cGraph = copyGraph();
            
            // 회전
            for(Oper oper : select) {
                for(int i=0;i<oper.s;i++) {
                    rotate(cGraph,oper.r-oper.s+i,oper.c-oper.s+i,oper.r+oper.s-i,oper.c+oper.s-i);
                }
            }

            // 행 합 중 최솟값
            int res = getMinRowSum(cGraph);
            
            // 최솟값
            ans = Math.min(ans,res);

            return;
        }

        for(int i=0;i<K;i++) {
            if(visited[i]) continue;
            visited[i] = true;
            select[depth] = opers[i];
            perm(depth+1);

            visited[i] = false;
        }
    }

    private int[][] copyGraph() {
        int[][] ans = new int[N][M];

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                ans[i][j] = graph[i][j];
            }
        }

        return ans;
    }

    private void rotate(int[][] cGraph, int minX, int minY, int maxX, int maxY) {
        int temp = cGraph[minX][minY];

        // 서
        for(int i=minX;i<=maxX-1;i++) {
            cGraph[i][minY] = cGraph[i+1][minY];
        }

        // 남
        for(int i=minY;i<=maxY-1;i++) {
            cGraph[maxX][i] = cGraph[maxX][i+1];
        }


        // 동
        for(int i=maxX;i>=minX+1;i--) {
            cGraph[i][maxY] = cGraph[i-1][maxY];
        }

        // 북
        for(int i=maxY;i>=minY+1;i--) {
            cGraph[minX][i] = cGraph[minX][i-1];
        }

        cGraph[minX][minY+1] = temp;
    }

    private int getMinRowSum(int[][] cGraph) {
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<N;i++) {
            int sum = 0;
            for(int j=0;j<M;j++) {
                sum += cGraph[i][j];
            }
            ans = Math.min(ans,sum);
        }

        return ans;
    }
}
