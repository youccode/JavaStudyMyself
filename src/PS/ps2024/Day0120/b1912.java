package PS.ps2024.Day0120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1912 {
    public static StringTokenizer stn;
    public static int[] arr;
    public static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        stn = new StringTokenizer(br.readLine());

        System.out.println(dp());

    }

    public static int dp() {

        arr[0] = Integer.parseInt(stn.nextToken());
        int max = arr[0];

        for (int i = 1; i < N; i++) {
            int cur = Integer.parseInt(stn.nextToken());

            arr[i] = Math.max(arr[i-1] + cur, cur);

            max = Math.max(max, arr[i]);
        }

        return max;
        // 해당 index까지의 합과 현재의 element와의 대소 비교를 통해서 항상 해당 index까지 나올 수 있는
        // 최댓값을 저장해놓음.
        // 이후 비교를 통해서 max값을 추출 가능
    }
}
