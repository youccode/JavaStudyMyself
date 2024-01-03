package PS.ps2023.Day20230505;

import java.util.Scanner;

public class b2566 {
    public static void main(String[] args) {
        // 9 x 9 형태의 격자판에 적힌 자연수 중에 최댓값을 찾고 출력

        Scanner scanner = new Scanner(System.in);
        int row = 1;
        int column = 1;
        int max = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int num = scanner.nextInt();
                if (num > max) {
                    max = num;
                    row = i;
                    column = j;
                }
            }
            scanner.nextLine();
        }
        System.out.println(max);
        System.out.println(row + " " + column);

    }

}
