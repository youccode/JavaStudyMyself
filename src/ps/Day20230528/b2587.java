package ps.Day20230528;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2587 {
    public static void main(String[] args) throws IOException {
        // 5개의 숫자가 주어질 때, 중앙값과 대표값을 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ar = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            ar[i] = Integer.parseInt(br.readLine());
            total += ar[i];
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (ar[j] > ar[j + 1]) {
                    int tmp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j+1] = tmp;
                }
            }
        }
        System.out.println(total / 5);
        System.out.println(ar[2]);

    }
}
