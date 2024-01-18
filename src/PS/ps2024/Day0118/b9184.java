package PS.ps2024.Day0118;

import java.io.*;

public class b9184 {
    public static int[][][] arr = new int[102][102][102];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 51; i++) {
            for (int j = 1; j < 102; j++) {
                for (int k = 1; k < 102; k++) {
                    arr[i][j][k] = 1;
                    arr[j][i][k] = 1;
                    arr[k][j][i] = 1;
                }
            }
        }
        for (int i = 52; i <= 71; i++) {
            for (int j = 52; j <= 71; j++) {
                for (int k = 52; k <= 71; k++) {
                    if (i < j && j < k) {
                        arr[i][j][k] = arr[i][j][k-1] + arr[i][j-1][k-1] - arr[i][j-1][k];
                    } else {
                        arr[i][j][k] = arr[i-1][j][k] + arr[i-1][j-1][k] + arr[i-1][j][k-1] - arr[i-1][j-1][k-1];
                    }
                }
            }
        }

        for (int i = 72; i < 102; i++) {
            for (int j = 52; j < 102; j++) {
                for (int k = 52; k < 102; k++) {
                    arr[i][j][k] = arr[71][71][71];
                    arr[j][i][k] = arr[71][71][71];
                    arr[k][j][i] = arr[71][71][71];
                }
            }
        }
        String str;
        String[] strArr;
        while(!(str = br.readLine()).equals("-1 -1 -1")) {
            strArr = str.split(" ");
            sb.append("w(").append(strArr[0]).append(", ").append(strArr[1]).append(", ").append(strArr[2]).append(") = ");
            sb.append(arr[Integer.parseInt(strArr[0]) + 51][Integer.parseInt(strArr[1]) + 51][Integer.parseInt(strArr[2]) + 51]).append("\n");
        }
        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();



    }

}
