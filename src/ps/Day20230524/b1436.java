package ps.Day20230524;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1436 {

    static boolean endNumberCheck(int num) {
        int length = 0;
        int tmp = num;
        while( num != 0) {

            if (num / 10 != 0) {
                length++;
                num = num / 10;
            } else if (num < 10) {
                length++;
                break;
            }
        }


        for (int i = 0; i < length-2; i++) {
            if ((tmp % 10 == 6) && ((tmp / 10) % 10 == 6) && ((tmp / 100) % 10 == 6)) {
                return true;
            } else {
                tmp = tmp / 10;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        // 숫자를 N을 받을 것이고, 이는 N번째 종말의 수를 말한다.
        // 종말의 숫자란 666이 적어도 3개 이상 연속으로 들어가는 수를 의미함.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = (int) Integer.parseInt(br.readLine());
        int target = 1;
        int num = 667;

        if (N == 1) {
            System.out.println(666);
        } else {
            while( target != N ) {
                // 값을 1씩 증가시키면서 종말의 숫자에 해당하면 target의 값을 1 증가
                // 숫자의 각 자릿수 값을 array 형태로 저장하고, 6이 연속으로 3번 나오는지 체크
                if ( endNumberCheck(num) ) {
                    target++;
                    if (target == N) {
                        System.out.println(num);
                        break;
                    }
                    num++;
                } else {
                    num++;
                }
            }
        }

    }
}
