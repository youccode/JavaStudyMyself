package PS.ps2024.Day0118;

import java.io.*;
import java.util.StringTokenizer;

public class b14889 {

    public static int[][] arr;
    public static boolean[] teamCheck;
    public static int[] team1;
    public static int[] team2;
    public static int N;
    public static int dif = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        // Array 내부에 능력치 값들을 저장할 때는 2D Array를 이용해서 저장.
        // 능력치 간 차이의 최솟값을 구하는 과정에서는 Team 1과 Team 2를 나눌 때,
        // Team 1을 구하면 자연스레 Team 2가 정해진다는 것을 최대한 활용할 것.
        // 2n C n = > 2n! / n! n!
        // 2n -1 C n-1 => (2n-1) ! / n! (n-1)!
        // 1을 포함하여서 만들 수 있는 경우의 수만을 세고 나면 나머지는 동일

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr= new int[N+1][N+1];
        teamCheck = new boolean[N];
        team1 = new int[N/2];
        team2 = new int[N/2];
        teamCheck[0] = true;
        StringTokenizer stn;
        for (int i = 0; i < N; i++) {
            stn = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i+1][j+1] = Integer.parseInt(stn.nextToken());
            }
        }

        dfs(1, 1);
        bw.write(dif +"\n");

        br.close();
        bw.flush();
        bw.close();

    }

    public static void dfs(int at, int cnt) {
        // 경우의 수를 나눈다.
        // 경우의 수를 나누는 과정이 끝나면 그에 따른 능력치 합산을 진행
        // 능력치의 값이 이전보다 더 작다면 최솟값을 변경

        if (cnt == N /2) {
            // 능력치 값 합산의 code가 들어가야 함.
            int ans = 0;
            int pos1 = 0;
            int pos2 = 0;

            for (int i = 0; i < N; i++) {
                if (teamCheck[i]) {
                    team1[pos1++] = i+1;
                } else {
                    team2[pos2++] = i+1;
                }
            }

            for (int num : team1) {
                for ( int num2 : team1) {
                    ans += arr[num][num2];
                }
            }

            for (int num : team2) {
                for ( int num2 : team2) {
                    ans -= arr[num][num2];
                }
            }


            dif = Math.min(Math.abs(ans), dif);
            return;
        }

        for (int i = at; i < N; i++) {
            teamCheck[i] = true;
            dfs(i + 1, cnt + 1);
            teamCheck[i] = false;
        }

    }
}
