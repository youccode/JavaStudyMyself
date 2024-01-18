package PS.ps2024.Day0112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b15650 {

    public static int[] arr;
    public static int M;
    public static int N;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        // 조합을 만드는 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stn = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stn.nextToken());
        M = Integer.parseInt(stn.nextToken());

        arr = new int[M];
        dfs(1, 0);
        System.out.println(sb.toString());
    }

    public static void dfs(int at, int depth) {

        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = at; i <= N; i++) {

            arr[depth] = i;
            dfs(i + 1, depth + 1);

        }
    }
}
