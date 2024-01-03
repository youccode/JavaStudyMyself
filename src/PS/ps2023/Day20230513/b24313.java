package PS.ps2023.Day20230513;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b24313 {
    public static void main(String[] args ) throws IOException {
        // Big O Notation => 알고리즘의 시간 복잡도의 상한을 나타내는 방법
        // f(n) <= c * g(n), n >= n0를 만족하는 n0가 존재할 때,
        // 시간 복잡도는 O(n), g(n) 같은 경우에는 단순히 n의 몇  승의 형태로 나타나는듯.

        // 첫째 줄에 f(n)을 나타내는 a1, a0가 주어짐.
        // 다음 줄에 양의 정수 c
        // 다음 줄에 양의 정수 n0

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int a1 = Integer.parseInt(str[0]);
        int a0 = Integer.parseInt(str[1]);

        /*
        String str = br.readLine();
        int a1 = Integer.parseInt(Character.toString(str.charAt(0)));
        int a0 = Integer.parseInt(Character.toString(str.charAt(2)));
        */

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if (c - a1 < 0) {
            System.out.println(0);
        } else {
            if(a1 * n0 + a0 > c * n0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }

        // (c-a1) * n + a0 >=0


    }
}
