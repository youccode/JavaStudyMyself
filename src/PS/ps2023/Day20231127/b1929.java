package PS.ps2023.Day20231127;

import java.io.*;
import java.util.StringTokenizer;

public class b1929 {

    public static boolean isPN(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(stk.nextToken());
        int end = Integer.parseInt(stk.nextToken());

        for (int i = start; i <= end; i++) {
            if (isPN(i)) {
                bw.write(i + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
