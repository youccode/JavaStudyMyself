package PS.ps2024.Day0112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b15649 {

    static StringBuilder sbAns = new StringBuilder();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = br.readLine().split(" ");
        int N = Integer.parseInt(ar[0]);
        int M = Integer.parseInt(ar[1]);
        boolean[] ans = new boolean[N];

        sequence(ans, M, 0, sb);
        System.out.println(sbAns.toString());

        br.close();
    }

    public static void sequence(boolean[] ar, int target, int cnt, StringBuilder sb) {
        if ( cnt == target ) {
            sbAns.append(sb.toString());
            sbAns.append("\n");
            return;
        }

        for (int i = 0; i < ar.length; i++) {
            if (!ar[i]) {
                ar[i] = true;
                sb.append(i+1).append(" ");
                sequence(ar, target, ++cnt, sb);
                ar[i] = false;
                cnt--;
                if (sb.length() > 2) {
                    sb.delete(sb.length() - 3, sb.length() - 1);
                } else {
                    sb = new StringBuilder();
                }

            }
        }

    }
}
