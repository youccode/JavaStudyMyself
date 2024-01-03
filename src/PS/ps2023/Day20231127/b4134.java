package PS.ps2023.Day20231127;

import java.io.*;

public class b4134 {

    public static boolean isPN(long a) {

        if (a == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(a) + 1; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        if ( a < 2) {
            return false;
        }

        return true;
    }

    public static long findPN(long a) {
        long PN = a;
        while(!isPN(PN)) {
            PN++;
        }
        return PN;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            bw.write(findPN(Long.parseLong(br.readLine())) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
