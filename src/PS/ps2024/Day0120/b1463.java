package PS.ps2024.Day0120;

import java.io.*;

public class b1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());

        int[] arr = new int[X+4];
        int tmp;
        arr[0] = arr[1] = 0;
        arr[2] = arr[3] = 1;
        for (int i = 4; i <= X; i++) {
            tmp = arr[i-1];

            if (i % 2 == 0) {
                tmp = Math.min(arr[i /2], tmp);
            }
            if (i % 3 == 0) {
                tmp = Math.min(tmp, arr[i/3]);
            }

            arr[i] = tmp + 1;

        }

        bw.write(arr[X] + "\n");

        br.close();
        bw.flush();
        bw.close();

    }
}
