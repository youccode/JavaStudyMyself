package ps.Day0;

import java.util.Scanner;

public class b10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int result =0;

        scanner.nextLine();

        int[] ar = new int[num];

        for (int i = 0; i < num; i++) {
            ar[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        for (int i = 0; i < ar.length; i++) {
            if(target == ar[i]) {
                result++;
            }
        }

        System.out.println(result);
    }
}
