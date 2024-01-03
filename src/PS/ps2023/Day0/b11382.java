package PS.ps2023.Day0;

import java.util.Scanner;

public class b11382 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNum = scanner.nextLong();
        long secondNum = scanner.nextLong();
        long thirdNum = scanner.nextLong();

        System.out.println(firstNum + secondNum + thirdNum);
    }
} /*
Datatype의 범위가 어디까지인지를 잘 생각하고 assign 해줄 것.
단순히 int가 안된다는 것을 깨닫지 못해서 오랫동안 문제를 풀지 못함.
int의 범위 ==> -2,147,483,648 ~ 2,147,483,647 => +- 21억
10^8 => 1억 10^12 => 1조
long의 범위 ==> +- 900해
*/
