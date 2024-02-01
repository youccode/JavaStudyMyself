package PS.ps2024.Day0129;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2565 {
    public static void main(String[] args) throws IOException {
        // LIS ( Longest Incresing Sbusequence )를 적용해서 풀 수 있는 문제가 무엇인지 정확히 알 것.
        // A, B 2개의 전봇대에 줄이 연결되어 있는 상황이다. 서로 엇갈리는 전선이 없는 상황이 나오기 위해서는
        // 단순히 연결된 두 전봇대의 번호가 모두 증가하고 있다면, 서로 엇갈리는 경우는 발생하지 않는다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arrA = new int[N];
        int[] arrB = new int[N];
        int[] DP = new int[N];
        String[] nums;
        int tmp;
        int max = 1;
        int ans = 0;

        for (int i = 0; i < N; i++) {
            nums = br.readLine().split(" ");
            arrA[i] = Integer.parseInt(nums[0]);
            arrB[i] = Integer.parseInt(nums[1]);
        }

        // Sorting의 과정
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (arrA[j] > arrA[j + 1]) {
                    tmp = arrA[j];
                    arrA[j] = arrA[j+1];
                    arrA[j+1] = tmp;

                    tmp = arrB[j];
                    arrB[j] = arrB[j+1];
                    arrB[j+1] = tmp;
                }
            }
        }

        DP[0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arrB[i] > arrB[j]) {
                    max = Math.max(max, DP[j]+1);
                }
            }

            DP[i] = max;
            ans = Math.max(ans, DP[i]);
            max = 1;
        }

        System.out.println(N - ans);


    }
}
