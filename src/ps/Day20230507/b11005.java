package ps.Day20230507;

import java.util.Scanner;

public class b11005 {
    public static void main(String[] args) {
        // 10진법 수 N이 주어지고, B진법으로 변환을 하기 위한 B가 주어짐
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int B = scanner.nextInt();

        // 변환 과정에서 출력 과정을 기록할 String 필요
        String str = "";

        // B 진법으로 변환 과정 B로 계속 나눈 후, 그 값을 역으로 읽어주면 됨.

        int num = N;

        while(num >= B) {
            int quotient = num / B;
            int remainder = num - quotient * B;
            if (remainder > 9) {
                remainder += 55;
            } else {
                remainder += 48;
            }

            str += Character.toString((char) remainder);
            num = quotient;
        }

        if (num > 9) {
            num += 55;
        } else {
            num += 48;
        }
        str += Character.toString((char) num);

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
