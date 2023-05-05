package ps.Day20230505;

import java.util.Scanner;

public class b2444 {

    public static void main(String[] args) {
        // N 값을 입력으로 받음

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // An = 2n - 1의 형태로 별을 출력
        // 출력 조건: 별의 개수 + 공백까지 체크해야 함.
        // 공백은 입력값 N, 문자열 길이가 N이어야 함.
        for (int i = 1; i <= N; i++) {
            String star = "*";
            String blank = " ";
            String ans = blank.repeat(N - i) + star.repeat(2*i - 1);

            System.out.println(ans);

        }

        // N 값에 도달하고 나면 역순으로 An = 1이 될 때까지 출력

        for (int i = N - 1; i >= 1; i--) {
            String star = "*";
            String blank = " ";
            String ans = blank.repeat(N - i) + star.repeat(2*i - 1);

            System.out.println(ans);
        }

    }
}
