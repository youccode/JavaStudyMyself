package PS.ps2023.Day20230507;

import java.util.Scanner;

public class b2720 {

    static int calCoin(int coin, int exchage) {
        return exchage / coin;
    }
    static int calExchange(int coin, int exchange) {
        int quotient = exchange / coin;
        exchange = exchange - quotient * coin;

        return  exchange;
    }

    public static void main(String[] args) {
        // 거스름돈을 걸러줌
        // 0.25$ Quarter 0.10$ Dime 0.05$ Nickel 0.01$ Penny
        // 거스름돈은 5$를 넘지 않음

        // 첫 입력에서는 테스트 케이스의 개수 T
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        // 이후에는 거스름돈이 나옴
        // 거스름돈을 주는 동전의 개수는 항상 최소여야 함.
        for (int i = 0; i < T; i++) {
            int exchange = scanner.nextInt();
            System.out.print(calCoin(25, exchange) + " ");
            exchange = calExchange(25, exchange);
            System.out.print(calCoin(10, exchange) + " ");
            exchange = calExchange(10, exchange);
            System.out.print(calCoin(5, exchange) + " ");
            exchange = calExchange(5, exchange);
            System.out.print(calCoin(1, exchange));
            exchange = calExchange(1, exchange);
            System.out.println();

        }
    }
}
