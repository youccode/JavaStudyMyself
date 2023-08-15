package ps.Day20230507;


import java.util.Scanner;

public class b2745 {
    public static void main(String[] args) {
        // 첫 째줄에 숫자 N과 B진법임을 알려주는 말이 나옴.
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int B = scanner.nextInt();
        int ans = 0;

        // 이를 10진법으로 변환하여 출력하면 됨.
        // 10진법 이하인 경우
        if (B < 10) {

            for (int i = 0; i < N.length(); i++) {
                ans += (N.charAt(N.length() - 1 - i) - 48) * Math.pow(B, i);
            }
            System.out.println(ans);
        } else if (B == 10) {
            System.out.println(Integer.valueOf(N));
        } else {

            for (int i = 0; i < N.length(); i++) {
                char c = N.charAt(N.length() - 1 - i);
                if (c > 58) {
                    ans += (c - 55) * Math.pow(B, i);
                } else {
                    ans += (c - 48) * Math.pow(B, i);
                }
            }
            System.out.println(ans);
        }

    }
}
