package PS.ps2024.Day0112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b15649_moreEfficient {
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());
        br.close();

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);
        System.out.print(sb);
    }

    private static void dfs(int N, int M, int depth) {
        if(depth == M) {
            for(int value : arr) {
                sb.append(value).append(' '); // array가 완성되면 내부의 element들을 StringBuilder에 append
            }
            sb.append('\n');
            return;
        }

        for(int i=0; i<N; i++) {
            if(!visit[i]) {
                visit[i] = true; // 미리 저장된 값들은 array에 저장.
                arr[depth] = i+1;
                dfs(N, M, depth+1);
                visit[i] = false;
            }
        }

    }
}
