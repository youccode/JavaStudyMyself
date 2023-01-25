package ps;

import java.util.Scanner;

public class b2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        String reA = "";
        String reB = "";

        for (int i = 0; i < 3; i++) {
            reA += Character.toString(a.charAt(2-i));
            reB += Character.toString(b.charAt(2-i));
        }

        int A = Integer.parseInt(reA);
        int B = Integer.parseInt(reB);

        if (A > B) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }

    }
}
