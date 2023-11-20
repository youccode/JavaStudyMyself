package ps;

import java.util.Scanner;

public class b2581 {
    public static void main(String[] args) {
        // 첫 째줄에 시작 지점 숫자
        // 둘 째줄에 끝 지점 숫자
        // 소수가 존재하지 않는다면 -1을 출력
        // 소수가 존재한다면 그 합을 첫 째 줄에 그리고 가장 작은 최솟값을 출력
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        scanner.nextLine();
        int end = scanner.nextInt();
        scanner.nextLine();

        int totalPrime = 0;
        int minPrime = 0;

        for (int i = start; i <= end ; i++) {
            if (i >=1 && i < 10) {
                if (i == 2 || i == 3 || i == 5 || i == 7){
                    if (minPrime == 0) {
                        minPrime = i;// 1 2 3 4 5 6 7 8 9 / 2 3 5 7
                    }
                    totalPrime += i;
                }
                continue;
            }
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
                if( j == i / 2) {
                    if(minPrime == 0) {
                        minPrime = i;
                    }
                    totalPrime += i;
                }

            }
        }
        if (minPrime == 0 && totalPrime == 0) {
            System.out.println(-1);
        } else {
            System.out.println(totalPrime);
            System.out.println(minPrime);
        }


    }
}
