package PS.ps2024.Day0201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stn = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stn.nextToken());
        int M = Integer.parseInt(stn.nextToken());

        int[] ar1 = new int[N];
        int[] ar2 = new int[M];
        long answer = 0;
        int cur;

        ar2[0]++;
        stn = new StringTokenizer(br.readLine());

        ar1[0] = Integer.parseInt(stn.nextToken()) % M;
        ar2[ar1[0]]++;
        for (int i = 1; i < N; i++) {
            cur = Integer.parseInt(stn.nextToken()) % M;
            ar1[i] = ar1[i - 1] + cur;
            ar1[i] %= M;

            ar2[ar1[i]]++;
        }

        for (int i = 0; i < M; i++) {
            if (ar2[i] == 0) continue;

            answer += (long) ar2[i] * (ar2[i] - 1) / 2; // 곱하는 과정에서 long으로 넘어갈 수 있음.
        }

        System.out.println(answer);

        // 1 3 6 7 9
        // 1 0 0 1 0

    }
}
