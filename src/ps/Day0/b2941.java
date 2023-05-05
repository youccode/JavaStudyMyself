package ps.Day0;

import java.util.Scanner;

public class b2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int cnt = 0;

        for (int i = 0; i < string.length(); i++) {

                if (i > 0 && i + 1 < string.length() && string.charAt(i - 1) == 'd' && string.charAt(i) == 'z'&& string.charAt(i+1) == '=') {
                    continue;
                } else if (i > 0 && string.charAt(i - 1) == 'l' && string.charAt(i) == 'j') {
                    continue;
                } else if (i > 0 && string.charAt(i - 1) == 'n' && string.charAt(i) == 'j') {
                    continue;
                } else if (string.charAt(i) > 96 && string.charAt(i) < 123) {
                    cnt++;
                }

        }
        System.out.println(cnt);

    }
}
