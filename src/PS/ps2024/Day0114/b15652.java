package PS.ps2024.Day0114;

import java.io.*;
import java.util.StringTokenizer;

public class b15652 {

    public static int N;
    public static int M;
    public static  int[] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stn = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stn.nextToken());
        M = Integer.parseInt(stn.nextToken());

        arr = new int[M];
        dfs(0, 0);
        //bw.write(sb.toString());
        System.out.println(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void dfs(int at, int cnt) {
        if (cnt == M) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = at; i < N; i++) {
            arr[cnt] = i+1;
            dfs(i, cnt+1);
        }
    }
}
