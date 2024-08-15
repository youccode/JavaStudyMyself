package Waffle;

import java.io.*;
import java.util.StringTokenizer;

public class prob2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sn = new StringBuilder();
        StringTokenizer stn = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stn.nextToken());
        int M = Integer.parseInt(stn.nextToken());
        int K = Integer.parseInt(stn.nextToken());
        int max = 0;

        int[] left = new int[3];
        left[0] = N;
        left[1] = M;
        left[2] = K;

        int[] arrW = new int[3];
        int[] arrC = new int[3];
        int[] arrS = new int[3];


        stn = new StringTokenizer(br.readLine());
        arrW[0] = Integer.parseInt(stn.nextToken());
        arrW[1] = Integer.parseInt(stn.nextToken());
        arrW[2] = Integer.parseInt(stn.nextToken());

        stn = new StringTokenizer(br.readLine());
        arrC[0] = Integer.parseInt(stn.nextToken());
        arrC[1] = Integer.parseInt(stn.nextToken());
        arrC[2] = Integer.parseInt(stn.nextToken());

        stn = new StringTokenizer(br.readLine());
        arrS[0] = Integer.parseInt(stn.nextToken());
        arrS[1] = Integer.parseInt(stn.nextToken());
        arrS[2] = Integer.parseInt(stn.nextToken());

        int maxW = Math.min(Math.min(arrW[0] != 0 ? N / arrW[0] : 100, arrW[1] != 0 ? M / arrW[1] : 100), arrW[2] != 0 ? K / arrW[2] : 100);
        int maxC;
        int maxS;

        int[] copy = left.clone();

        for (int i = 0; i <= maxW; i++) {
            copy[0]= N - arrW[0] * i;
            copy[1]= M - arrW[1] * i;
            copy[2]= K - arrW[2] * i;

            maxC = Math.min(Math.min(arrC[0] != 0 ? copy[0] / arrC[0] : 100, arrC[1] != 0 ? copy[1] / arrC[1] : 100), arrC[2] != 0 ? copy[2] / arrC[2] : 100);
            for (int j = 0; j <= maxC; j++) {
                copy[0] = copy[0] - arrC[0] * j;
                copy[1] = copy[1] - arrC[1] * j;
                copy[2] = copy[2] - arrC[2] * j;

                maxS = Math.min(Math.min(arrS[0] != 0 ? copy[0] / arrS[0] : 100, arrS[1] != 0 ? copy[1] / arrS[1] : 100), arrS[2] != 0 ? copy[2] / arrS[2] : 100);
                for (int k = 0; k <= maxS; k++) {
                    copy[0] = copy[0] - arrS[0] * k;
                    copy[1] = copy[1] - arrS[1] * k;
                    copy[2] = copy[2] - arrS[2] * k;

                    if (copy[0] >= 0 && copy[1] >= 0 && copy[2] >= 0) {
                        max = Math.max(max, i + j + k);
                    }

                    copy[0] = copy[0] + arrS[0] * k;
                    copy[1] = copy[1] + arrS[1] * k;
                    copy[2] = copy[2] + arrS[2] * k;
                }

                copy[0] = copy[0] + arrC[0] * j;
                copy[1] = copy[1] + arrC[1] * j;
                copy[2] = copy[2] + arrC[2] * j;
            }
        }

        bw.write(max + "");


        br.close();
        bw.flush();
        bw.close();

    }

}
