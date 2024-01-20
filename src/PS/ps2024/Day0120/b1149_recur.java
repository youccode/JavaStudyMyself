package PS.ps2024.Day0120;

import java.io.*;
import java.util.StringTokenizer;

public class b1149_recur {
    public static int[][] arr;
    public static int N;
    public static int total;
    public static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][3];

        // array에 element 저장
        StringTokenizer stn;
        for (int i = 0; i < N; i++) {
            stn = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(stn.nextToken());
            }
        }

        recur(-1, 0);

        bw.write(min + "\n");

        br.close();
        bw.flush();
        bw.close();


    }

    public static void recur(int at, int cnt) {
        // cnt가 target에 도달하면 멈추고, 해당 합이 최솟값인지 확인
        if (cnt == N) {
            min = Math.min(total, min);
            return;
        }

        // array를 돌아가면서, 해당값을 더해주고, 해당 index와 함께 recur을 다시 호출
        for (int i = 0; i < 3; i++) {
            if (i == at) continue;

            total += arr[cnt][i];
            recur(i, cnt+1);
            total -= arr[cnt][i];
        }
    }
}
