package ps.Day20231124;

import java.io.*;

public class b13241 {
    public static void main(String[] args) throws IOException {
        // A,B를 받은 다음에 더 작은 수로 남은 수를 나누고, 나머지랑 작은 수를 비교해서 구하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long A =0;
        long B =0;
        String[] num;

        long small = 0;
        long big =0;
        long remainder = 0;

            num = br.readLine().split(" ");
            A = Integer.parseInt(num[0]);
            B = Integer.parseInt(num[1]);

            if (A == 1 || B == 1) {
                bw.write(A * B + "\n");
            } else {

                if (A != B) {
                    if (A > B) {
                        big = A;
                        small = B;
                        remainder = A % B;
                    } else {
                        big = B;
                        small = A;
                        remainder = B % A;
                    }

                    if (remainder == 0) {
                        bw.write(big + "\n");
                    } else if (small % remainder == 0) {
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
                } else {
                    bw.write(A + "\n");
                }

            }



        br.close();
        bw.flush();
        bw.close();
        }

    }