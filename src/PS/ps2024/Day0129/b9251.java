package PS.ps2024.Day0129;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9251 {
    // Longest Common Subsequence(LCS)를 찾는 방법
    // Longest Common Substring의 경우, 연속된 공통 문자열을 찾아야하지만,
    // Subsequence의 경우, 순서만 맞으면 된다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int[][] arr = new int[str1.length() + 1][str2.length() + 1];
        int max = 0;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    arr[i+1][j+1] = arr[i][j] + 1;
                } else {
                    arr[i+1][j+1] = Math.max(arr[i+1][j], arr[i][j+1]);
                }

                max = Math.max(arr[i+1][j+1], max);
            }
        }
        br.close();
        System.out.println(max);

    }


}
