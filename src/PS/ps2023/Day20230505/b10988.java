package PS.ps2023.Day20230505;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10988 {

    public static void main(String[] args) throws IOException {
        // 첫 입력에서 String을 받음 => bufferReader를 한 번 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Boolean ans = true;

        // palindrome인지 확인.
        for (int i =0; i < str.length() / 2; i ++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                ans = false;
                break;
            }
        }
        if (ans) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
