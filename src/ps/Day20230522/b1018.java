package ps.Day20230522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1018 {
    public static void main(String[] args ) throws IOException {
        // BruteForce Algorithm을 이용하여서 문제를 풀어야 함.
        // 첫 줄에는 2개의 숫자가 주어지고 이는 각각 세로와 가로의 개수를 의미함.
        // 이는 체스판의 가로(N)와 세로(M)를 의미하고 체스판은 어디서든 8 * 8의 형태로 뽑아낼 것이고,
        // 이 체스판은 정상인 형태여야 한다. 이 때, 체스판에 문제가 없도록 할 때, 고쳐야될 개수는?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = br.readLine().split(" ");
        int N = Integer.parseInt(ar[0]);
        int M = Integer.parseInt(ar[1]);

        // N이 세로를 의미, M이 가로를 의미.

        int correctCnt1 = 0;
        int correctCnt2 = 0;
        int tmp = -1;


        String[] arrString = new String[N];
        for (int i = 0; i < N; i++) {
            arrString[i] = br.readLine();
        } // 체스판들을 String Array에 하나씩 추가하는 과정.

        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                // i는 첫째 줄부터 시작하여 차례대로 내려가는 과정을 의미함.
                // i와 j는 각 지점의 시작 지점을 선택해줌.
                // 8*8의 체스판을 구해야하므로 최대 N-8까지 가능

                // 기준점이 되는 i를 기준으로 i+2n은 i와 동일한 색을 지니고 있어야함.
                // 이를 이용하여 색을 구할 예정

                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {

                        if ((k + l) % 2 == 0) {
                            if (arrString[k].charAt(l) != 'B') {
                                correctCnt1++;
                            } else if (arrString[k].charAt(l) != 'W') {
                                correctCnt2++;
                            }
                        } else {
                            if (arrString[k].charAt(l) != 'W') {
                                correctCnt1++;
                            } else if (arrString[k].charAt(l) != 'B') {
                                correctCnt2++;
                            }
                        }
                    }
                }
                if (tmp == -1) {
                    tmp = Math.min(correctCnt1, correctCnt2);
                } else {
                    if ( tmp > Math.min(correctCnt1, correctCnt2)) {
                        tmp = Math.min(correctCnt1, correctCnt2);
                    }
                }
                correctCnt1 =0;
                correctCnt2 =0;
            }
        }
        System.out.println(tmp);
    }
}
