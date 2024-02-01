package PS.ps2024.Day0201;

import java.io.*;
import java.util.StringTokenizer;

public class b16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stn;
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int[][] arr = new int[str.length()+1][26];
        char target;
        int targetNum;
        int start;
        int end;

        target = str.charAt(0);

        for (int i = 1; i <= str.length(); i++) {
            target = str.charAt(i-1);
            for (int j = 0; j < 26; j++) {
                if (target - 97 == j) {
                    arr[i][j] = arr[i-1][j] + 1;
                } else {
                    arr[i][j] = arr[i-1][j];
                }
            }
        }

        for (int j = 0; j < q; j++) {
            stn = new StringTokenizer(br.readLine());
            targetNum = stn.nextToken().charAt(0) - 97;
            start = Integer.parseInt(stn.nextToken());
            end = Integer.parseInt(stn.nextToken());

            sb.append(arr[end+1][targetNum] - arr[start][targetNum]).append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
