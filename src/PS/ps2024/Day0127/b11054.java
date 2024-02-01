package PS.ps2024.Day0127;

import java.io.*;
import java.util.StringTokenizer;

public class b11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stn;
        int[] ar;
        int[][] DP;
        int increase = Integer.MIN_VALUE;
        int decrease = Integer.MIN_VALUE;
        int max = 1;


        int N = Integer.parseInt(br.readLine());

        ar = new int[N];
        DP = new int[N][2];
        stn = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(stn.nextToken());
        }

        // DP[i][0] => 증가하는 경우의 수열 값을 더함.
        // DP[i][1] => 감소하는 경우의 수열 값을 더함.
        DP[0][0] = 1;
        DP[0][1] = 1;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (ar[i] > ar[j]) {
                    increase = Math.max(increase, DP[j][0]);
                } else if(ar[i] < ar[j]){
                    decrease = Math.max(Math.max(DP[j][1], DP[j][0]), decrease);
                }
            }

            DP[i][0] = increase == Integer.MIN_VALUE ? 1 : increase + 1;
            DP[i][1] = decrease == Integer.MIN_VALUE ? 1 : decrease + 1;

            max = Math.max(max, Math.max(DP[i][0], DP[i][1]));

            increase = Integer.MIN_VALUE;
            decrease = Integer.MIN_VALUE;
        }

        if (N == 2) {
            if (ar[0] != ar[1]) {
                System.out.println(2);
                return;
            } else {
                System.out.println(1);
                return;
            }
        }

        bw.write(max +"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
