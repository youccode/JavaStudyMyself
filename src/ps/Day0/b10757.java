package ps.Day0;

import java.math.BigInteger;
import java.util.Scanner;

public class b10757 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // input으로 한 줄 단위로 모든 것을 받아내는 것부터 진행
        String[] twoDigit = input.split(" "); // 받은 줄을 공백을 기준으로 나눈 이후, 이를 배열로 받아들임.

        int[] answ = new int[twoDigit[0].length() > twoDigit[1].length() ? twoDigit[0].length() + 1
                : twoDigit[1].length() + 1]; // 입력받은 2개의 숫자 중에서 길이가 더 긴 녀석보다 하나 더 많은 것으로 배열을 생성.
        for (int i = twoDigit[0].length() - 1; i >= 0; i--) {
            answ[twoDigit[0].length() - 1 - i] = answ[twoDigit[0].length() - 1 - i] + (twoDigit[0].charAt(i) - '0');
            // 각 자리에 char를 int형으로 변경하여서 더해줌. 일의 자리 => index 0
        }
        for (int i = twoDigit[1].length() - 1; i >= 0; i--) {
            answ[twoDigit[1].length() - 1 - i] = answ[twoDigit[1].length() - 1 - i] + (twoDigit[1].charAt(i) - '0');
            // 위의 과정과 동일함.
        }
        for (int i = 0; i < answ.length; i++) {
            if (answ[i] >= 10) {
                answ[i] = answ[i] - 10;
                answ[i + 1]++;
            }
        }
        for (int i = answ.length - 1; i >= 0; i--) {
            if (i == answ.length - 1 && answ[i] == 0) {
                continue;
            }
            System.out.print(answ[i]);
        }
        System.out.print("\n");
    }

    public int main2() {
        // Big Integer라는 java만의 클래스를 이용할 것
        // 주의점 Big Integer는 말 그대로 Integer로서는 표현할 수 없는 부분을 하는 것이므로 입력값으로 문자열, 즉 String을 입력으로 받는다.
        Scanner scanner = new Scanner(System.in);
        String[] ar = scanner.nextLine().split(" ");
        BigInteger num1 = new BigInteger(ar[0]);
        BigInteger num2 = new BigInteger(ar[1]);
        System.out.println(num1.add(num2));
        return num1.add(num2).intValue();
    }

}