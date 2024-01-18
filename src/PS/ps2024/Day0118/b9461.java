package PS.ps2024.Day0118;

import java.io.*;

public class b9461 {
    public static long[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int size;
        for (int i = 0; i < N; i++) {
            size = Integer.parseInt(br.readLine());
            arr = new long[101];
            sb.append(tri(size)).append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();

    }

    public static long tri(int n) {
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;

        if (n <= 3 || arr[n] != 0) {
            return arr[n];
        }

        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i-2] + arr[i-3];
        }

        return arr[n];
    }
}
