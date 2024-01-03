package PS.ps2023.Day0;
import java.util.Scanner;

public class b2839 {
    public static int[] findNum(int total) {
        int[] ans = new int[2];
        int for5kg = 0;
        boolean loop = true;
        if (total % 3 == 0) {
            ans[1] = total / 3;
            return ans;
        }
        while (loop) {
            for5kg++;
            total = total - 5;
            loop = total % 3 != 0;
            if (!loop) {
                ans[0] = for5kg;
                ans[1] = total / 3;
            }
            if (total < 0) {
                ans[0] = -1;
            }
        }
        if (ans[0] != -1) {

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalKg = scanner.nextInt();
        int[] ar = new int[2];
        ar = findNum(totalKg);

        if (ar[0] == -1) {
            System.out.println(-1);
        } else {
            if (ar[1] >= 5) {
                ar[0] = ar[0] + ar[1] / 5 * 3;
                ar[1] = ar[1] % 5;
            }
            System.out.println(ar[0] + ar[1]);
        }
        scanner.close();
    }

}