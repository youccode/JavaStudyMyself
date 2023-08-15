package ps.Day20230615;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class b10814 {
    public static void main(String[] args) throws IOException {

        // 첫 째줄에는 온라인 저지 회원의 수 N이 주어집니다.
        // 다음부터는 차례대로 나이와 문자열의 형태로 정보가 주어지고
        // 이를 나이순, 나이가 같다면 입력 순으로정렬하여 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 차례대로 입력을 받고, Comparator를 이용하여 정렬

        int N = Integer.parseInt(br.readLine());
        ArrayList<String[]> ar = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ar.add(0, br.readLine().split(" "));
        }

        Collections.sort(ar, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]);

        }});

        for (int i = N-1; i >= 0; i--) {
            bw.write(ar.get(i)[0] + " " + ar.get(i)[1] + "\n" );
        }

        bw.close();

    }
}
