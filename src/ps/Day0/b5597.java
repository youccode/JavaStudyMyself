package ps.Day0;

import java.util.Scanner;

public class b5597 {
    public static void main(String[] args) {
        int[] ar = new int[30];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = 1;

        }

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 28; i++) {
            int attend = scanner.nextInt();
            scanner.nextLine();

            ar[attend -1] = 0;

        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 1) {
                System.out.println(++i);
            }
        }
    }
}
