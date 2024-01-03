package PS.ps2023.Day20231124;

import java.io.*;

public class b1735 {

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return getGcd(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] A;
        String[] B;

        A = br.readLine().split(" ");
        B = br.readLine().split(" ");

        int numerator = Integer.parseInt(A[0]) * Integer.parseInt(B[1]) + Integer.parseInt(B[0]) * Integer.parseInt(A[1]);
        int denominator =Integer.parseInt(A[1]) * Integer.parseInt(B[1]);

        int div = getGcd(numerator, denominator);

        bw.write(numerator / div + " " + denominator/div + "\n");
        br.close();
        bw.flush();
        bw.close();

    }
}


