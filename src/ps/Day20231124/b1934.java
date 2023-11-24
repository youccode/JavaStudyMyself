package ps.Day20231124;

import java.io.*;

public class b1934 {
    public static void main(String[] args) throws IOException {
        // A,B 두 개의 수를 받은 다음, 둘 중에 더 작은 수만큼 for문을 돌리면서 나누어지는 수가 있는지 확인
        // 나누어지는 수가 존재하지 않는다면 두 수를 서로 곱해주고 그 동안 나왔던 수들은 마지막에 곱해준다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        int A =0;
        int B =0;
        String[] num;

        int big = 0;
        int small = 0;
        int times = 1;

        for (int i = 0; i < cnt; i++) {
            num = br.readLine().split(" ");
            A = Integer.parseInt(num[0]);
            B = Integer.parseInt(num[1]);

            if(A == 1 ) { bw.write(B + "\n"); continue; }
            // continue는 반복문의 현재를 중단
            // break는 반복문 자체를 중단
            if(B == 1) { bw.write(A + "\n"); continue; }

            if (A > B) {
                big = A;
                small = B;
            } else if(B > A) {
                big = B;
                small = A;
            } else {
                bw.write(A + "\n");
                continue;
            }

            if ( big % small == 0) {
                bw.write(big + "\n");
                continue;
            }
            boolean dividable = true;

            while(dividable) {
                for (int j = 2; j < small / 2 + 2; j++) {
                    if (A % j ==0 && B % j ==0) {
                        A = A / j;
                        B = B / j;
                        small = small / j;
                        times *= j;
                        break;
                    }

                    if (j == small / 2 + 1) {
                        if (A > B && A % B == 0) {
                            times *= B;
                            A = A / B;
                            B = 1;
                        } else if (B > A && B % A == 0) {
                            times *= A;
                            B = B / A;
                            A = 1;
                        }
                        dividable = false;
                    }
                }
            }

            bw.write(times * A * B + "\n");
            times = 1;

        } // 코드가 돌아가기는 하는데 시간 초과 뜸.

        br.close();
        bw.flush();
        bw.close();
    }
}
