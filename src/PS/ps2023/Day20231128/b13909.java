package PS.ps2023.Day20231128;

import java.io.*;

public class b13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        bw.write((int)Math.sqrt(N) + "\n");
        br.close();
        bw.flush();
        bw.close();

    }
}
