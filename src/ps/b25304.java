package ps;

import java.util.Scanner;

public class b25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testPrice = scanner.nextInt(); // 체크를 해봐야될 가격을 받는 부분
        int realPrice = 0; // 실제 가격을 계산해줄 때 사용할 변수

        scanner.nextLine();
        int iteration = scanner.nextInt();

        for (int i = 0; i < iteration; i++) {
            int price = scanner.nextInt();
            int num = scanner.nextInt();

            realPrice += price * num;
            scanner.nextLine();

        }

        if( testPrice == realPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
