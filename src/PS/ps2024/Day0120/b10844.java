package PS.ps2024.Day0120;

import java.io.*;
import java.util.Arrays;

public class b10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[10];
        int[] result = new int[10];
        int ans = 0;
        Arrays.fill(arr, 1);
        arr[0] = 0;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    result[j] = arr[j+1];

                    if (result[j] > 1000000000) {
                        result[j] %= 1000000000;
                    }

                    continue;
                }

                if (j == 9) {
                    result[j] = arr[j-1];

                    if (result[j] > 1000000000) {
                        result[j] %= 1000000000;
                    }

                    continue;
                }

                result[j] = arr[j - 1] + arr[j + 1];

                if (result[j] > 1000000000) {
                    result[j] %= 1000000000;
                }
            }

            for (int a = 0; a < 10; a++) {
                arr[a] = result[a];
            }

        }

        for (int i = 0; i < 10; i++) {
            ans += arr[i];
            if (ans > 1000000000) {
                ans %= 1000000000;
            }
        }

        bw.write(ans + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
