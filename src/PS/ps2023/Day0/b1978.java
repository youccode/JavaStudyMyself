package PS.ps2023.Day0;

import java.util.Scanner;

public class b1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = scanner.nextInt();
        int checkNumber = 0;
        int answer = 0;
        for (int i = 0; i < loop; i++) {
            checkNumber = scanner.nextInt();
            answer += checkPrime(checkNumber);
        }
        System.out.println(answer);
    }

    public static int checkPrime(int num) {
        int isPrime = 0;
        if (num == 2 || num == 3) {
            isPrime = 1;
        }
        for (int i =2; i <= num / 2 + 1; i++) {
            if(num % i == 0 || num == 1) {
                break;
            }
            if(i == num / 2 + 1) {
                isPrime = 1;
            }
        }

        return isPrime;
    }
}
