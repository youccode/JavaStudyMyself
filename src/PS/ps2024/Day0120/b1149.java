package PS.ps2024.Day0120;

import java.io.*;
import java.util.StringTokenizer;

public class b1149 {
    public static int[][] arr;
    public static int[] table = new int[3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stn;

        int N = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int ans;
        arr = new int[N][3];

        //array에 element 저장 과정
        for (int i = 0; i < N; i++) {
            stn = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(stn.nextToken());
            }
        }

        // array를 차례대로 돌아다니면서, 해당 index까지 더했을 때, 나오는 최솟값을 저장해놓을 것.
        table[0] = arr[0][0];
        table[1] = arr[0][1];
        table[2] = arr[0][2];

        for (int i = 1; i < N; i++) {

            // table에 있는 값을 update
            // 해당 index를 제외한 나머지 값들을 확인 후, 최솟값을 더해준다.
            // table[0] => arr[i][1] or arr[i][2]를 확인 후, table에 더해줄 것.
            // 나머지 값들도 동일하게 진행.

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    // 같은 index는 패스
                    if (k == j) continue;

                    // arr[i]를 돌아다니며, 최솟값에 해당하는 경우를 각각 구함.
                    min = Math.min(table[k], min);

                }

                arr[i][j] = arr[i][j] + min;
                min = Integer.MAX_VALUE;
            }

            for (int a = 0; a < 3; a++) {
                table[a] = arr[i][a];
            }

        }

        ans = table[0];

        for (int i = 1; i < 3; i++) {
            if (table[i] < ans) {
                ans = table[i];
            }
        }

        bw.write(ans + "\n");

        br.close();
        bw.flush();
        bw.close();

    }
}
