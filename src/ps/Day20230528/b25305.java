package ps.Day20230528;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b25305 {
    public static void main(String[] args) throws IOException {
        // 총 인원 N명과 상을 받게 될 인원 k명을 첫 줄에 받게 된다.
        // 둘 째줄에는 N개의 성적들이 나오게 되고, 차례대로 정렬한 후, 상을 받는 커트라인을 제출한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = br.readLine().split(" ");
        int N = Integer.parseInt(ar[0]);
        int k = Integer.parseInt(ar[1]);

        ar = br.readLine().split(" ");

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (Integer.parseInt(ar[j]) > Integer.parseInt(ar[j + 1])) {
                    String tmp = (ar[j]);
                    ar[j] = ar[j + 1];
                    ar[j + 1] = tmp;
                }
            }
        }
        System.out.println(ar[N - k]);
    }
}
