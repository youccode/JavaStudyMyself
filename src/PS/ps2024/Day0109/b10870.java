package PS.ps2024.Day0109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(fibo(N));
        br.close();
    }

    public static int fibo(int a ){
        if (a <= 1) {
            return a;
        }

        return fibo(a - 1) + fibo( a - 2);
    }
}
