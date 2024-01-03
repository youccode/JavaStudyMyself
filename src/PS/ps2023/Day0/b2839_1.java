package PS.ps2023.Day0;
import java.util.Scanner;

public class b2839_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();

        int quotinent5 = total / 5;
        int quotinent3 = 0;

        switch (total % 5) {
            case 0:
                System.out.println(quotinent3 + quotinent5);
                break;
            case 1:
                if (quotinent5 < 1) {
                    System.out.println(-1);
                    break;
                }
                quotinent5--;
                quotinent3 = quotinent3 + 2;
                System.out.println(quotinent3 + quotinent5);
                break;
            case 2:
                if (quotinent5 < 2) {
                    System.out.println(-1);
                    break;
                }
                quotinent5 = quotinent5 - 2;
                quotinent3 = quotinent3 + 4;
                System.out.println(quotinent3 + quotinent5);
                break;

            case 3:
                quotinent3++;
                System.out.println(quotinent3 + quotinent5);
                break;
            case 4:
                if (quotinent5 < 1) {
                    System.out.println(-1);
                    break;
                }
                quotinent5--;
                quotinent3 = quotinent3 + 3;
                System.out.println(quotinent3 + quotinent5);
                break;

        }
    }
}