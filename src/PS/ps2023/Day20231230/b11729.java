package PS.ps2023.Day20231230;

import java.util.Scanner;

public class b11729 {
    public static void main(String[] args) {
        // A B C
        // A => B
        //
        // B => C

        // if 개수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        hanoi(n, 1, 2, 3, sb);
        System.out.println((int)Math.pow(2,n) - 1);
        System.out.println(sb.toString());

    }

    public static void hanoi(int n, int a, int b, int c, StringBuilder sb) {
        if (n == 1) {
            sb.append(a + " " + c + "\n");
            return;
        }

        hanoi(n -1, a, c, b, sb);
        sb.append(a + " " + c + "\n");

        hanoi(n-1,b, a, c, sb);
    }

}
