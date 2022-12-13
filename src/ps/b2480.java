package ps;

import java.util.Scanner;

public class b2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        if (first == second) {
            if (first == third) {
                System.out.println(10000 + first*1000);
            } else {
                System.out.println(1000 + first * 100);
            }
        } else if(first == third) {
            System.out.println(1000 + first * 100);
        } else if (second == third) {
            System.out.println(1000 + second * 100);
        } else {
            System.out.println(Math.max(Math.max(first, second), third) * 100);
        }
        }

}
