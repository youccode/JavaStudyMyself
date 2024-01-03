package PS.ps2023.Day0;

import java.util.Scanner;

public class b10810 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];
        int loop = scanner.nextInt();

        while (loop > 0) {
            scanner.nextLine();
            int range1 = scanner.nextInt();
            int range2 = scanner.nextInt();
            int num = scanner.nextInt();

            for (int i = range1 - 1; i < range2; i++) {
                arr[i] = num;
            }
            loop --;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
