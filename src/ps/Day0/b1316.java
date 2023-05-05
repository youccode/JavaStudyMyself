package ps.Day0;

import java.util.Scanner;

public class b1316 {

    public static void main(String[] args) {
        boolean[] ar = new boolean[26];
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        scanner.nextLine();
        String str;
        char prev = ' ';
        boolean check = true;
        int cnt = 0;

        for (int i = 0; i < times; i++) {
            str = scanner.nextLine();

            for (int j = 0; j < str.length(); j++) {
                int pos = str.charAt(j) - 97;
                if (prev == ' ') {
                    ar[pos] = true;
                    prev = str.charAt(j);
                } else if (str.charAt(j) == prev) {
                    continue;
                } else if (str.charAt(j) != prev && ar[pos]) {
                    check = false;
                    break;
                } else if (str.charAt(j) != prev && !ar[pos]) {
                    ar[pos] = true;
                    prev = str.charAt(j);
                }
            }
            if (check) {
                cnt++;
            } else {
                check = true;
            }

            prev = ' ';
            ar = new boolean[26];
        }

        System.out.println(cnt);
    }
}


