package PS.ps2023.Day20230507;

import java.util.Scanner;

public class b2903 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int ans = 0;

            if (N == 1) {
                ans = 9;
            } else if (N == 2) {
                ans = 25;
            } else {
                ans = 5;
                for (int i = 3; i <= N; i++) {
                    ans += ans - 1;
                }
                ans = ans * ans;
            }

            System.out.println(ans);

    }
}