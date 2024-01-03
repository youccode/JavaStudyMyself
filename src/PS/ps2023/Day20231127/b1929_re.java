package PS.ps2023.Day20231127;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1929_re {
    // 범위 내의 모든 소수를 구하는 경우에는 해당 수가 소수인지를 판단하는 isPrime을 사용하면
    // 각각의 수에 대해 모두 판별을 하므로 비효율적임
    // 해당 time complexity가 가능하게 했던 에라토스테네스의 체를 code로 구현할 것
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // StringBuilder는 immutable한 String을 mutable하게 만들어주는 도구
        // StringBuilder vs StringBuffer는 또다른 차이점이 있다고 함. 따로 정리할 것.

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] check = new boolean[n + 1];

        check[0] = check[1] = true;

        for (int i = 2; i <= n; i++) {
            if(check[i]) continue;

            for(int j=i*2; j<=n; j+=i){
                // i의 배수를 더해주면서 해당 값들은 소수가 아닌 것으로 판명.
                check[j] = true;
            }
        }

        for(int i = m; i <= n; i++) {
            if(!check[i]) sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}
