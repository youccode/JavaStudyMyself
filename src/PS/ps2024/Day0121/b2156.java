package PS.ps2024.Day0121;

import java.io.*;

public class b2156 {
    public static void main(String[] args) throws IOException {

        /*
        해당 index까지 더했을 때, 나올 수 있는 값을 저장.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] result = new int[n+1];


        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        /*
        해당 index까지의 합을 저장하는 array가 존재한다.
        1. 바로 이전의 값을 더하는 경우, arr[cur] + arr[cur-1]
         => 이전의 합을 더하는 과정이 필요함 => 이전의 합에서 연속 3번이 나오는 경우는 없어야만 함.
         => result[cur-3] + arr[cur-1] + arr[cur]
         [cur -3] cur -2 [cur -1] [cur] => 다음의 3개를 택하는 경우

        2. 전전 항과의 합을 구하는 경우, arr[cur] + arr[cur-2]
        => result[cur-2] + arr[cur] 치환 가능

        3. 해당 합을 스킵하는 경우
        => result[cur-1]

         */

        result[1] = arr[1];
        if (n > 1) {
            result[2] = arr[1] + arr[2];
        }


        for (int i = 3; i <= n; i++) {
            result[i] = Math.max(result[i - 1], Math.max(result[i - 2] + arr[i], result[i - 3] + arr[i - 1] + arr[i]));
        }


        bw.write(result[n] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
