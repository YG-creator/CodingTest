import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        new Main().solution();
    }

    static class Fish {
        int x;

        public Fish(int x) {
            this.x = x;
        }
    }

    private void solution() throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Fish fish1 = new Fish(0);
        Fish fish2 = new Fish(1);
        int[] a = {0};
        int b = 0;
        Integer c = Integer.valueOf(0);
        int[][] d = {{0}};
        String e = "0";

        move(fish1);
        move1(a);
        move2(b);
        move3(c);
        move4(d);
        move5(e);

        // 출력
        //System.out.println(fish1.x);
        //System.out.println(a[0]);
        //System.out.println(b);
        System.out.println(c);
        //System.out.println(d[0][0]);
        //System.out.println(e);
        br.close();
    }

    private void move5(String e) {
        e = "1";
    }

    private void move4(int[][] arr) {
        arr[0][0]++;
    }

    private void move3(Integer c) {
        c++;
    }

    private void move2(int b) {
        b++;
    }

    private void move(Fish fish) {
        fish.x++;
    }

    private void move1(int[] a) {
        a[0]++;
    }
}
