package PS.ps2024.Day0120;

import java.io.*;

public class b2579 {
    public static void main(String[] args) throws IOException {
        // 2D Array를 만든 다음, 1칸 넘어서 온 값은 arr[][0]에 2칸 넘어서 온 값은 arr[][1]에 저장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N+1];
        int[][] arr = new int[N+1][2];

        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        arr[0][0] = score[0];
        arr[1][0] = score[0] + score[1];
        arr[1][1] = score[1];

        for (int i = 2; i < N; i++) {

            if (arr[i-2][0] > arr[i-2][1]) {
                arr[i][1] = score[i] + arr[i-2][0];
            } else {
                arr[i][1] = score[i] + arr[i-2][1];
            }

            arr[i][0] = score[i] + arr[i-1][1];
        }

        /*

        더하는 값이 index를 기준으로 index -2의 값인지, 혹은 index -1인지를 비교할 때
        index-2의 값과, index -3과 index-1의 합을 더한 것의 크기 비교를 해야함.
        index - 3과 index -1의 합을 구하는 과정에서는 index -3의 경우, 해당 index까지의 합을 더하지만
        index -1의 경우, 해당 계단에서의 점수 자체를 더해주어야, 연속적으로 한 칸 오르는 것을 방지 가능.
        이를 이용하면 코드가 훨씬 더 간결하게 쓰여질 수 있음.

        DP[i] = Math.max( DP[i-3]+A[i-1] + A[i], DP[i-2]+A[i]);
        DP[i-3]+A[i-1] => 해당 코드가 위의 주의사항을 반영한 결과.

         */


        int max = Math.max(arr[N - 1][0], arr[N - 1][1]);
        bw.write(max + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
