package ps.Day20230601;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class b2751 {
    public static void main(String[] args) throws IOException {
        // N개의 숫자가 주어졌을 때, 이를 오름차순으로 정렬한 결과를 차례대로 하나씩 출력하는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < N; i++) {
                ar.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(ar);
        for (int i = 0; i < N; i++) {
            bw.write(ar.get(i) +"\n");
        }
        bw.close();
        br.close();

    }
}
