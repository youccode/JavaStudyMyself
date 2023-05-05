package ps.Day20230502;

import java.util.Scanner;

public class b10811 {
    public static void main(String[] args) {
        // N개의 바구니를 지니고 있음, 가장 왼쪽부터 1번 바구니
        // 번호를 가지고 있는 것과 동일한 형태로 문제를 풀면 될듯
        Scanner scanner = new Scanner(System.in);
        int[] N = new int[scanner.nextInt()];
        int M = scanner.nextInt();

        for (int i = 0; i < N.length; i++) {
            N[i] = i + 1;
        }


        // M번 바구니를 역순의 형태로 정렬할 예정
        // 범위를 설정한 후, 그 범위만큼 역순으로 변함.

        for (int i = 0; i < M; i++) {
            int b1 = scanner.nextInt();
            int b2 = scanner.nextInt();
            int cnt = 0;

            for (int j = 0; j < (b2 - b1 + 1) / 2; j++) {
                cnt = N[b1 - 1 + j];
                N[b1 - 1 + j] = N[b2 - 1 - j];
                N[b2 - 1 - j] = cnt;
            }
            scanner.nextLine();

        }
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] + " ");
        }

    }
}
