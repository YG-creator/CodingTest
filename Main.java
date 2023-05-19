import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
    static class Time {
        int s, e;
        public Time(int s, int e) {
            this.s = s;
            this.e = e;
        }
    }

    public static void main(String[] args) throws Exception {
        // 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Time> courses = new PriorityQueue<>((Time a, Time b) ->
                a.s == b.s ? a.e - b.e : a.s - b.s);
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            courses.add(new Time(s,e));
        }

        int ans = 1;
        rooms.add(courses.poll().e);


        for(int i=0;i<n-1;i++) {
            Time now = courses.poll();
            int e = rooms.poll();

            if(now.s < e) {
                rooms.add(e);
                ans++;
            }

            rooms.add(now.e);
        }

        bw.append(ans+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
