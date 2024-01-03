package PS.ps2023.Day20231124;

import java.io.*;

public class b2485 {

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return getGcd(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int[] distance = new int[cnt];
        int prev = 0;
        int pres = 0;
        int sum =0;


        for (int i = 0; i < cnt; i++) {
            if (i == 0) {
                pres = Integer.parseInt(br.readLine());
                continue;
            }

            prev = pres;
            pres = Integer.parseInt(br.readLine());
            distance[i - 1] = pres - prev;
            sum += pres - prev;

        }
        int gcd = getGcd(distance[0], distance[1]);
        for (int i = 2; i < cnt - 1; i++) {
            gcd = getGcd(gcd, distance[i]);
        }

        bw.write(sum / gcd - cnt + 1 + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
