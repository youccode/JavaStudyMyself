package ps.Day20230502;

import java.util.Scanner;

public class b10813 {
    public static void main(String[] args) {
        // N개의 바구니를 지니고, 각 바구니에는
        // 자신의 번호에 해당하는 번호의 공을 지니고 있음

        Scanner scanner = new Scanner(System.in);
        int[] N = new int[scanner.nextInt()];
        for (int i = 0; i < N.length; i++) {
            N[i] = i + 1;
        }
        int M = scanner.nextInt();
        scanner.nextLine();


        // M번 공을 바꿀 예정, 바구니 두 개를 선택하면 공을 서로 변경함.

        for (int i = 0; i < M; i++) {
            int b1 = scanner.nextInt();
            int b2 = scanner.nextInt();
            scanner.nextLine();
            int cnt = N[b1-1];

            N[b1-1] = N[b2 -1];
            N[b2 -1] = cnt;

        }

        // 최종적으로 바구니 별로 지니고 있는 공의 번호를 출력
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] +" ");
        }
    }
}
