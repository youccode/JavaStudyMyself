package PS.ps2024.Day0131;

import java.io.*;
import java.util.StringTokenizer;

public class b11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stn = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(stn.nextToken());
        int M = Integer.parseInt(stn.nextToken());
        int index1;
        int index2;
        int total = 0;

        long[] ar = new long[N+1];
        stn = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
                ar[i] = ar[i-1] + Integer.parseInt(stn.nextToken());
        }

        for (int i = 0; i < M; i++) {
            stn = new StringTokenizer(br.readLine());
            index1 = Integer.parseInt(stn.nextToken());
            index2 = Integer.parseInt(stn.nextToken());

            sb.append(ar[index2] - ar[index1-1] ).append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();

        // 0000 0000 0101 a
        // 0000 0010 1000 a * 8
        // 0000 0000 1010 a * 2 => a *10
        // 0000 0000 0011 b => a * 10 + b

    }
}
