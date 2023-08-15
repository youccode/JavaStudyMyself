package ps.Day20230603;

import java.io.*;

public class b1247 {
    public static void main(String[] args) throws IOException {
        // 첫째 줄에 숫자 N이 주어진다. => 이를 내림차순으로 정렬 ex) 2143 => 4321
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int[] ar = new int[10];

        for (int i = 0; i<str.length(); i++) {
            int n = str.charAt(i) - 48;
            ar[n]++;
        }
        for (int i = ar.length - 1; i >= 0; i--) {
            for (int j = 0; j < ar[i]; j++) {
                bw.write(i+"");
            }
        }
        bw.close();
        br.close();
    }
}
