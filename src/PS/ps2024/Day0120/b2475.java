package PS.ps2024.Day0120;

import java.io.*;
import java.util.StringTokenizer;

public class b2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stn = new StringTokenizer(br.readLine());

        int total = 0;
        for (int i = 0; i < 5; i++) {
            int cur = Integer.parseInt(stn.nextToken());
            total += cur * cur;
        }

        total %= 10;

        bw.write(total + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
