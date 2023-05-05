package ps.Day20230502;

import java.util.Scanner;

public class b9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cnt; i++) {
            String str = scanner.nextLine();
            System.out.print(str.charAt(0));
            System.out.print(str.charAt(str.length() - 1));
            System.out.println();
        }
    }
}
