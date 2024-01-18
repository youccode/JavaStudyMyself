package PS.ps2024.Day0118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1904 {
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N+2];
        System.out.println(tile(N));
    }

    public static int tile(int n) {
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            if (arr[i] >= 15746) {
                arr[i] = arr[i] % 15746;
            }
        }

        return arr[n];
    }
}
