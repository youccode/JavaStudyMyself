package ps.Day20231127;

import java.io.*;

public class b4948 {

    public static int findPrimeNum(int a) {
        int ans = 0;
        boolean[] check = new boolean[2*a+1];
        check[0] = check[1] = true;

        for (int i = 2; i <= a; i++) {
            for (int j = i*2; j <= 2*a; j = j + i) {
                check[j] = true;
            }
        }

        for (int k = a+1; k <= 2 * a; k++) {
            if (!check[k]) {
                ans++;
            }
        }

        return ans;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        while (num != 0) {
            sb.append(findPrimeNum(num) );
            sb.append("\n");
            num = Integer.parseInt(br.readLine());
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
