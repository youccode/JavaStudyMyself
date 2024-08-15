package Waffle;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class prob1 {

    static String[][] arr = new String[101][101];
    static boolean[][] checkButter = new boolean[101][101];

    static void clearButter() {
        checkButter = new boolean[101][101];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stn = new StringTokenizer(br.readLine());
        StringBuilder stb = new StringBuilder();
        int N = Integer.parseInt(stn.nextToken());
        int M = Integer.parseInt(stn.nextToken());
        int K = Integer.parseInt(stn.nextToken());


        for (int x = 0; x <= N; x++) {
            Arrays.fill(arr[x], "");
        }

        int ord = 0;
        int i = 0;
        int j = 0;

        for (int v = 0; v < K; v++) {
            stn = new StringTokenizer(br.readLine());
            ord = Integer.parseInt(stn.nextToken());
            i = Integer.parseInt(stn.nextToken());
            j = Integer.parseInt(stn.nextToken());
            switch (ord) {
                case 1:
                    if (i == 1) { // row < N / row + col < j
                        if (j <= 2 || j > N + M) {
                            continue;
                        }
                        for (int a = 1; j - a >= 1; a++) {
                            if (j - a > M) {
                                continue;
                            }
                            if (a > N) {
                                break;
                            }
                            if (checkButter[a][j-a]){

                            } else {
                                    arr[a][j-a] = arr[a][j-a].concat("S");
                            }
                        }
                        clearButter();
                    } else { // row - col = j row = col + j
                        if (j <= -M + 1 || j >= N - 1) {
                            continue;
                        }
                        for (int a = 1; a <= M; a++) {
                            if ( a + j > N || a + j < 0) {
                                continue;
                            }
                            if (checkButter[a+j][a]){

                            } else {
                                arr[a+j][a] = arr[a+j][a].concat("S");
                            }
                        }
                        clearButter();
                    } break;
                case 2:
                    if (i == 1) {
                        for (int a = 1; a <= M; a++) {
                            if (checkButter[j][a]){

                            } else {
                                arr[j][a] = arr[j][a].concat("C");
                            }
                        }
                        clearButter();
                    } else {
                        for (int a = 1; a <= N; a++) {
                            if (checkButter[a][j]){

                            } else {
                                arr[a][j] = arr[a][j].concat("C");
                            }
                        }
                        clearButter();
                    } break;
                case 3:
                    if (checkButter[i][j]){
                        clearButter();
                    } else {
                        clearButter();
                        arr[i][j] = arr[i][j].concat("B");
                        checkButter[i][j] = true;
                    }
                    break;
                default: break;
            }
        }

        for (int p = 1; p <= N; p++) {
            for (int q = 1; q <= M; q++) {
                if (arr[p][q].equals("")){
                    stb.append("0 ");
                } else {
                    stb.append(arr[p][q]).append(" ");
                }

            }
            stb.append("\n");
        }

        bw.write(stb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
