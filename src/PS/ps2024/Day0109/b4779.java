package PS.ps2024.Day0109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        int N;
        while ((str = br.readLine()) != null) {
            N = Integer.parseInt(str);
            cantor(sb, 0, (int) Math.pow(3,N));

            System.out.println(sb.toString());
            sb = new StringBuilder();

        }

    }

    public static void cantor(StringBuilder sb, int start, int end) {
        if (end - start == 1) {
            sb.append("-");
            return;
        }

        cantor(sb, start, end / 3);
        for (int i = 0; i < end / 3; i++) {
            sb.append(" ");
        }
        cantor(sb, start, end / 3);
    }
}
