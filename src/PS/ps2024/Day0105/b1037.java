package PS.ps2024.Day0105;

import java.io.*;
import java.util.StringTokenizer;

public class b1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int cur;
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer stn = new StringTokenizer(br.readLine());

        while(cnt-- > 0) {
            cur = Integer.parseInt(stn.nextToken());

            if (min > cur) {
                min = cur;
            }
            if (max < cur) {
                max = cur;
            }
        }
        System.out.println(min * max);
        br.close();

    }
}
