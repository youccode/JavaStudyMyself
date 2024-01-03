package PS.ps2023.Day20230505;

import java.util.Scanner;

public class b2563 {

    public static void main(String[] args) {
        int[][] arr = new int[100][100];
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        scanner.nextLine();
        int s = 0;
        for (int i = 0; i < cnt; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (int a = x - 1; a < x + 9; a++) {
                for (int j = y - 1; j < y + 9; j++) {
                    arr[a][j] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                s += arr[i][j];
            }
        }
        System.out.println(s);
    }
}
