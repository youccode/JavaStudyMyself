package ps.Day0;

import java.util.Scanner;

public class b25314 {
    static void printLong(int num) {

        for (int i = 0; i < num / 4; i++) {
            System.out.print("long ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loop = scanner.nextInt();



        b25314.printLong(loop);
        System.out.println("int");
        /*
        Java는 코드가 돌아가는 구조가 main 함수를 기점으로 차근차근 내부의 코드가
        돌아가는 구조이다. 그러므로 main 내부에 method가 있으면 문제가 됨.
        애초에 main 역시, 하나의 method임.
         */


    }
}



