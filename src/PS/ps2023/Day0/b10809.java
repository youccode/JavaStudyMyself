package PS.ps2023.Day0;

import java.util.Arrays;
import java.util.Scanner;

public class b10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ar = new int[26];
        Arrays.fill(ar, -1);

        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            int index = string.indexOf(ch);
            int num = ch - 97;
            if(ar[num] == -1) {
                ar[num] = index;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

    }
}
