package PS.ps2023.Day0;

import java.util.Scanner;

public class b1193 {

    public static int[] findTotal(int targetNumber) {
        int[] outArray = new int[2];
        int sum = 0;
        int plus = 1;
        while (targetNumber > plus) {
            targetNumber = targetNumber - plus++;
        }
        outArray[0] = targetNumber;
        outArray[1] = plus;

        return outArray;
    }

    public static String calFraction(int[] ar) {
        int numerator;
        int denominator;
        String answer ="";
        if (ar[1] % 2 ==0) {
            numerator = ar[0];
            denominator = ar[1] + 1 -numerator;
        } else {
            denominator = ar[0];
            numerator = ar[1] + 1 - denominator;
        }
        answer = Integer.toString(numerator) + "/" + Integer.toString(denominator);


        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        System.out.println(calFraction(findTotal(X)));
    }

}
