package PS.ps2023.Day20230603;

import java.io.*;
public class b11650 {

    public static void main(String[] args) throws IOException {
        // 첫째 줄에는 받게 될 좌표의 개수를 N으로 받게 된다.
        // 이후에는 x의 값을 바탕으로 차례대로 좌표들을 나열한다.
        // x 좌표가 같다면 y 좌표의 값을 이용하여 나열한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        // merge를 이용한 sorting을 진행

        int N = Integer.parseInt(br.readLine());
        int[][] ar = new int[N][2];
        int[][] tmp = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            ar[i][0] = Integer.parseInt(str[0]);
            ar[i][1] = Integer.parseInt(str[1]);

        }
        // ar에 좌표의 값들을 차례대로 받아오는 과정

        // ar에 있는 값들을 tmp에 1차 복사.
        // tmp = ar; ==> 다음과 같은 assign은 shallow copy를 진행하게 됨. 참조값을 가져오게 됨. 조심할 것

        mergeSort(tmp, ar, 0, ar.length - 1);

        for (int i = 0; i < ar.length; i++) {
            sb.append(tmp[i][0]).append(" ").append(tmp[i][1]).append("\n");
        }
        System.out.println(sb);

        bw.close();
        br.close();
    }

    // mid, left, right을 바탕으로 계속해서 merge가 이루어지도록 해야함.
    // 기본 배열과 다른 새로운 배열을 하나 만들어야 함.
    static void mergeSort(int[][] tmp, int[][] ar, int start, int end) {

        // start < end라는 조건을 검으로서 start와 end가 같거나,
        // start보다 end가 작은 경우에는 더 이상 작동하지 않도록 설정.

        if (start < end) {
            int mid = (start + end ) / 2;

            mergeSort(tmp, ar, start, mid);
            mergeSort(tmp, ar, mid+1, end);

            int p = start;
            int q = mid + 1;
            int index = p;

            while (p <= mid && q <= end) {

                // x 좌표가 다른 경우, x 좌표가 같은 경우.
                if (ar[p][0]< ar[q][0]) {
                    tmp[index++] = ar[p++];
                } else if ( ar[p][0] == ar[q][0]) {
                    if (ar[p][1] < ar[q][1]) {
                        tmp[index++] = ar[p++];
                    } else {
                        tmp[index++] = ar[q++];
                    }
                } else {
                    tmp[index++] = ar[q++];
                }
            }
            if (p > mid) {
                for (int i = q; i <= end; i++) {
                    tmp[index++] = ar[i];
                }
            } else  {
                for (int i = p; i <= mid; i++) {
                    tmp[index++] = ar[i];
                }
            }

            for (int i = start; i <= end; i++) {
                ar[i] = tmp[i];

            }
            // merge sorting을 하는 과정에 있어서
            // tmp의 값을 원래 array로 다시 복사해주는 과정의 범위를 매우 주의해야함을 잊지 말자.
            // loop를 ar.legnth를 이용하여 전체를 돌게 만든다면 이거 하나만으로 N만큼의 time complexity가 증가
            // 이로 인하여 엄청난 시간을 소모하게 되는 것과 같은 것 같다. 조심할 것.

        }
    }
}
