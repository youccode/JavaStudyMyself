package PS.ps2024.Day0112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b15651 {

    public static int[] arr;
    public static int N;
    public static int M;
    public  static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stn = new StringTokenizer(br.readLine());

        N = Integer.parseInt(stn.nextToken());
        M = Integer.parseInt(stn.nextToken());

        arr = new int[M];
        dfs(M, 0);

        System.out.println(sb.toString());
        br.close();
    }

    public static void dfs(int depth, int cnt) {
        if (depth == cnt) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {

            arr[cnt] = i+1;
            dfs(depth, cnt+1);
        }
    }
}
