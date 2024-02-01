package PS.ps2024.Day0105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.NumberFormat;

public class b27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger("1");
        int N = Integer.parseInt(br.readLine());
        NumberFormat f = NumberFormat.getInstance();
        f.setGroupingUsed(false);
        String str = f.format(factorial(N));
        System.out.println(str);
        br.close();
    }

    public static double factorial(int a) {
        if (a <= 1) {
            return 1;
        }

        return a * factorial(a-1);
    }
}
