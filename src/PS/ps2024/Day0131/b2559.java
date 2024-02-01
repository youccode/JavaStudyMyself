package PS.ps2024.Day0131;

import java.io.*;
import java.util.StringTokenizer;

public class b2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stn = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stn.nextToken());
        int K = Integer.parseInt(stn.nextToken());
        int index1;
        int index2;
        int max = Integer.MIN_VALUE;
        int cur;
        int prev;

        int[] ar1 = new int[K];
        int[] ar2 = new int[K];
        stn = new StringTokenizer(br.readLine());

        for (int j = 1; j <= N; j++) {
            index1 = j % K; // 1 2 3 4 5 6 7
            index2 = (index1 + K - 1) % K;
            prev = ar2[index1];
            cur = Integer.parseInt(stn.nextToken());
            ar2[index1] = cur;
            ar1[index1] = ar1[index2] - prev + cur;

            if (j >= K) {
                max = Math.max(ar1[index1], max);
            }
        }

        bw.write(max + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
