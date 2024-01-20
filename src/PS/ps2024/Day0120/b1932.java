package PS.ps2024.Day0120;

import java.io.*;
import java.util.StringTokenizer;

public class b1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stn;

        int n = Integer.parseInt(br.readLine());
        int[] arr;
        int[] result = { Integer.parseInt(br.readLine())};

        for (int i = 1; i < n; i++) {
            stn = new StringTokenizer(br.readLine());
            arr = new int[i+1];

            // arr에 해당 줄의 element를 저장.
            for (int a = 0; a < i + 1; a++) {
                arr[a] = Integer.parseInt(stn.nextToken());
            }

            // 윗 줄의 합을 바탕으로 해당 element까지 도출할 수 있는 최댓값을 저장.
            for (int j = 0; j < i + 1; j++) {
                // element 중에서 처음 및 끝 원소의 경우, 연결되어있는 element가 하나이므로 바로 더해준다.
                if (j == 0) {
                    arr[j] = arr[j] + result[j];
                    continue;
                }
                if (j == i) {
                    arr[j] = arr[j] + result[j-1];
                    continue;
                }

                if (result[j - 1] > result[j]) {
                    arr[j] = arr[j] + result[j-1];
                } else {
                    arr[j] = arr[j] + result[j];
                }

            }

            result = arr;
        }

        int max = result[0];

        for (int i = 1; i < n; i++) {
            if (max < result[i]) {
                max = result[i];
            }
        }

        bw.write(max + "\n");

        br.close();
        bw.flush();
        bw.close();

    }
}
