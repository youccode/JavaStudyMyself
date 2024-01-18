package PS.ps2024.Day0114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9663 {

    public static boolean[][] arr;
    public static int N;
    public static int ans =0;
    public static void main(String[] args) throws IOException {
        // N -Queen
        // Queen과 대각선 혹은 같은 줄에 있는 경우, break
        // cnt에 해당하는 Queen을 모두 놓았을 때, 해당 경우의 수를 count
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new boolean[N][N];
        NQueen(0,0);
        System.out.println(ans);
    }

    public static void NQueen(int at, int cnt) {
        if (cnt == N) {
            ans++;
            return;
        }

        for (int i = at; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (diagonalCheck(i, j) && garoseroCheck(i, j) && !arr[i][j]) {
                    arr[i][j] = true;
                    NQueen(at+1,cnt + 1);
                    arr[i][j] = false;
                }

                if (N - i < N - cnt) {
                    return;
                }
            }
        }
    }

    public static boolean diagonalCheck(int a, int b) {

        for (int i =  1; i + a < N && i + b < N; i++) {
            if (arr[a+i][b+i]) {
                return false;
            }
        }

        for (int i =  1; a - i > -1 && i + b < N; i++) {
            if (arr[a-i][b+i]) {
                return false;
            }
        }

        for (int i = -1; i + a > -1 && i + b > -1; i--) {
            if (arr[a+i][b+i]) {
                return false;
            }
        }

        for (int i = 1; i + a < N && b - i > -1; i++) {
            if (arr[a+i][b-i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean garoseroCheck(int a, int b) {
        for (int i = 0; i < N; i++) {
            if (arr[a][i] && i != b) {
                return false;
            }
        }

        for (int j = 0; j < N; j++) {
            if (arr[j][b] && j != a) {
                return false;
            }
        }
        return true;
    }
}
