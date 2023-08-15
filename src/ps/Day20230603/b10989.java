package ps.Day20230603;

import java.io.*;
import java.util.ArrayList;

public class b10989 {
    public static void main(String[] args) throws IOException {
        // N개의 숫자가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] ar = new int[10001];
        int max = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
            }
            ar[num]++;
        }
        for (int i = 0; i <= max; i++) {
            if (ar[i] != 0) {
                for (int j = 0; j < ar[i]; j++) {
                    bw.write(i + "\n");
                }

            }
        }
        bw.close();
        br.close();
    }
}
