package PS.ps2023.Day20231128;

import java.io.*;

public class b17103 {
    public static void main(String[] args) throws IOException {
        boolean[] primeCheck = new boolean[1000001];
        primeCheck[0] = primeCheck[1] = true;
        for (int i = 2; i < 500001; i++) {
            for (int j = 2*i; j < 1000001; j +=i) {
                primeCheck[j] = true;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        int input;
        int cntPartitian = 0;
        for (int k = 0; k < cnt; k++) {
            input = Integer.parseInt(br.readLine());
            for (int a = 2; a <= input /2; a++) {
                if (!primeCheck[a] && !primeCheck[input - a]) {
                    cntPartitian++;
                }
            }
            bw.write(cntPartitian + "\n");
            cntPartitian = 0;
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
