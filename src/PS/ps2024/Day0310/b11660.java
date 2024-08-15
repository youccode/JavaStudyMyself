package PS.ps2024.Day0310;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stn = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stn.nextToken());
        int cnt = Integer.parseInt(stn.nextToken());

        int x1;
        int y1;
        int x2;
        int y2;

        int total1 = 0;
        int total2 = 0;

        int[][] arr = new int[N][N];
        int[][] DP = new int[N][N];

        for (int i = 0; i < N; i++) {
            stn = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(stn.nextToken());
            }
        }

        for (int i = 0; i < cnt; i++) {
            stn = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(stn.nextToken()) - 1;
            y1 = Integer.parseInt(stn.nextToken()) - 1;
            x2 = Integer.parseInt(stn.nextToken()) - 1;
            y2 = Integer.parseInt(stn.nextToken()) - 1;

            if (DP[x1][y1] != 0) {
                total1 = DP[x1][y1];
            }

            if (DP[x2][y2] != 0) {
                total2 = DP[x1][y1];
            }


        }
    }
}
