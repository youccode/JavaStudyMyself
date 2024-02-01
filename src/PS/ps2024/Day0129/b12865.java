package PS.ps2024.Day0129;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stn = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stn.nextToken());
        int K = Integer.parseInt(stn.nextToken());

        // 0 => 무게 / 1 => value
        int[][] items = new int[N+1][2];
        int[][] DP = new int[N+1][K+1];

        int ans = 0;

        for (int i = 1; i <= N; i++) {
            stn = new StringTokenizer(br.readLine());
            items[i][0] = Integer.parseInt(stn.nextToken());
            items[i][1] = Integer.parseInt(stn.nextToken());
        }


        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= K; j++) {
                if (items[i][0] > j) {
                    DP[i][j] = DP[i-1][j];
                } else {
                    DP[i][j] = Math.max(DP[i-1][j], DP[i - 1][j - items[i][0]] + items[i][1]);
                }
            }

        }

        br.close();
        System.out.println(DP[N][K]);
    }
}
