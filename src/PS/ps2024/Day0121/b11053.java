package PS.ps2024.Day0121;

import java.io.*;;
import java.util.StringTokenizer;

public class b11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stn;
        int N = Integer.parseInt(br.readLine());
        stn = new StringTokenizer(br.readLine());
        int max = 0;
        int dpMax = 0;
        int[] arr = new int[N + 1];
        int[] DP = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(stn.nextToken());
        }

        DP[1] = 1;

        for (int i = 2; i <= N; i++) {
            if (arr[i] > arr[i-1]) {
                // 이전 항과 그 전의 항들에 대해서 이어졌던 수열이 있는지 확인해야함.
                DP[i] = DP[i-1] +1;

                for (int j = 2; j < i; j++) {
                    if (DP[i-1] < DP[i - j] && arr[i] > arr[i-j]) {
                        dpMax = Math.max(dpMax, DP[i-j]);
                    }
                }

                if (dpMax != 0) {
                    DP[i] = dpMax + 1;
                }
                dpMax = 0;

                max = Math.max(max, DP[i]);
            } else {
                DP[i] = 1;
                for (int j = 1; j < i; j++) {
                    if (arr[i] > arr[i - j]) {
                        dpMax = Math.max(dpMax, DP[i-j]);
                    }
                }
                DP[i] += dpMax;
                dpMax = 0;

                max = Math.max(max, DP[i]);
            }
        }

        if (N == 1) {
            max = 1;
        }

        bw.write( max+"\n");

        br.close();
        bw.flush();
        bw.close();

    }
}
