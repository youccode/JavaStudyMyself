package ps.Day20230505;

import java.util.Arrays;
import java.util.Scanner;

public class b10812 {
    public static void main(String[] args) {
        // 입력으로 받게 되는 인수 N은 총 바구니의 개수를 의미
        // M은 바구니를 회전시킬 횟수

        Scanner scanner = new Scanner(System.in);
        int[] N = new int[scanner.nextInt()];
        int M = scanner.nextInt();
        scanner.nextLine();

        // N 배열의 각 항마다 index + 1의 값을 대입

        for (int i = 0; i < N.length; i++) {
            N[i] = i + 1;
        }

        // begin, mid , end의 형태로 세 개의 숫자를 받음
        // 바구니의 회전은 mid ~ end + begin ~ mid -1의 형태로 변환

        for (int i = 0; i < M; i++) {
            int begin = scanner.nextInt();
            int end = scanner.nextInt();
            int mid = scanner.nextInt();

            int[] beginToMid = Arrays.copyOfRange(N, begin -1, mid -1);
            int[] midToEnd = Arrays.copyOfRange(N, mid-1 , end );

            for (int j = begin - 1; j < begin - 1 + midToEnd.length; j++) {
                N[j] = midToEnd[j - begin + 1];
            }
            for (int k = begin - 1 + midToEnd.length; k < begin - 1 + midToEnd.length  + beginToMid.length; k++) {
                N[k] = beginToMid[k - begin + 1 - midToEnd.length];
            }

        }


        // 최종적으로 나열된 바구니의 형태를 출력
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] + " ");
        }
    }
}
