package PS.ps2023.Day20231124;

import java.io.*;

public class b1934_re {
    public static void main(String[] args) throws IOException {
        // A,B를 받은 다음에 더 작은 수로 남은 수를 나누고, 나머지랑 작은 수를 비교해서 구하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        int A =0;
        int B =0;
        String[] num;

        int small = 0;
        int big =0;
        int remainder = 0;

        for (int i = 0; i < cnt; i++) {
            num = br.readLine().split(" ");
            A = Integer.parseInt(num[0]);
            B = Integer.parseInt(num[1]);

            if (A == 1) {
                bw.write(B + "\n");
                continue;
            }
            // continue는 반복문의 현재를 중단
            // break는 반복문 자체를 중단
            if (B == 1) {
                bw.write(A + "\n");
                continue;
            }

            if (A > B) {
                big = A;
                small = B;
                remainder = A % B;
            } else if (B > A) {
                big = B;
                small = A;
                remainder = B % A;
            } else {
                bw.write(A + "\n");
                continue;
            }
            if (remainder == 0) {
                bw.write(big + "\n");
                continue;
            }
            if (small % remainder == 0) {
                bw.write(big * small / remainder + "\n");
            } else {
                boolean dividable = true;

                while(dividable) {
                    for (int j = 2; j < remainder / 2 + 2; j++) {
                        if (small % j ==0 && remainder % j ==0) {
                            small = small / j;
                            remainder = remainder / j;
                            break;
                        }

                        if (j == remainder / 2 + 1) {
                            dividable = false;
                        }
                    }
                }

                bw.write(big * small + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
