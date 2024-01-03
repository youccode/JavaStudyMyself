package PS.ps2023.Day20230505;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10798 {

    public static void printChar(String str, int length, int index) {
        String ans = "";
        if (index > length - 1) {

        } else {
            ans = String.valueOf(str.charAt(index));
        }
        System.out.print(ans);
    }

    public static void main(String[] args) throws IOException {
        // 5줄의 String이 입력됨.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();
        String str5 = br.readLine();

        int str1Length = str1.length();
        int str2Length = str2.length();
        int str3Length = str3.length();
        int str4Length = str4.length();
        int str5Length = str5.length();
        int maxLength = Math.max(str1Length, Math.max(str2Length, Math.max(str3Length, Math.max(str4Length, str5Length))));

        for (int i = 0; i < maxLength; i++) {
            printChar(str1, str1Length, i);
            printChar(str2, str2Length, i);
            printChar(str3, str3Length, i);
            printChar(str4, str4Length, i);
            printChar(str5, str5Length, i);

        }
        // 이를 세로줄에 맞춰서 읽어서 출력
        // 중간에 빈 공간이 있다면 뛰어넘고 다음 줄부터 출력



    }
}
