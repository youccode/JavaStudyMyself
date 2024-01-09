package PS.ps2024.Day0105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];
        double arithmeticMean = 0;
        int cnt = N / 2;
        int mid = 4001;
        int most = 0;
        int mostCnt = 0;
        int mostCheck = 0;
        int input;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            input = Integer.parseInt(br.readLine());
            arithmeticMean += input;
            arr[input + 4000] +=1;

        }
        arithmeticMean = Math.round(arithmeticMean / N);
        sb.append((int)arithmeticMean);
        sb.append("\n");
        for(int i = 0; i <arr.length; i++) {
            if (arr[i] != 0) {
                N-= arr[i];
                if (N <= cnt && mid == 4001) {
                    mid = i - 4000;

                }

                if (min > i - 4000) {
                    min = i - 4000;
                }

                if (max < i - 4000) {
                    max =i - 4000;
                }
                if (arr[i] > mostCnt) {
                    most = i -4000;
                    mostCnt = arr[i];
                    mostCheck = 0;
                    continue;
                }

                if (arr[i] == mostCnt && mostCheck == 0) {
                    most = i -4000;
                    mostCheck++;
                }

            }
        }

        sb.append(mid);
        sb.append("\n");
        sb.append(most);
        sb.append("\n");
        sb.append(max - min);
        System.out.println(sb.toString());

    }

}

