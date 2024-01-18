package PS.ps2024.Day0116;

import java.awt.*;
import java.io.*;
import java.util.StringTokenizer;

public class b14888 {
    public static int[] nums;
    public static int[] operators = new int[4];
    public static int[] order;
    public static int N;
    public static int ans;
    public static int min = Integer.MAX_VALUE;
    public static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        // 입력을 array로 받음
        // 연산자들도 array의 형태로 받음
        // 같은 연산자가 자리를 바꾸는 경우는 동일한 케이스이므로
        // 연산자 array의 연산자들을 차례로 배치
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        order = new int[N-1];
        StringTokenizer stn = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(stn.nextToken());
        }

        stn = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(stn.nextToken());
        }

        dfs(0);
        sb.append(max).append("\n").append(min).append("\n");
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();

    }

    public static void dfs(int cnt) {
        if (cnt == N - 1) {
            ans = nums[0];
            for (int i = 0; i < N-1; i++) {
                if (order[i] == 1) {
                    ans += nums[i+1];
                    continue;
                }
                if (order[i] == 2) {
                    ans -= nums[i+1];
                    continue;
                }
                if (order[i] == 3) {
                    ans *= nums[i+1];
                    continue;
                }
                if (order[i] == 4) {
                    ans /= nums[i+1];
                }
            }
            min = Math.min(min, ans);
            max = Math.max(max, ans);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] == 0) continue;

            if (operators[i]-- != 0) {
                order[cnt] = i +1;
                dfs(cnt+1);
                operators[i]++;
            }
        }
    }
}
