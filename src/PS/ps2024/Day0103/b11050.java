package PS.ps2024.Day0103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int N = Integer.parseInt(nums[0]);
        int K = Integer.parseInt(nums[1]);

        int ans = factorial(N) / factorial(K) / factorial(N-K);
        System.out.println(ans);
        br.close();
    }

    public static int factorial(int a) {
        if (a <= 1) {
            return 1;
        }

        return a * factorial(a -1);
    }
}
