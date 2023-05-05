package ps.Day20230505;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2738 {
    public static void main(String[] args) throws IOException {
        // N*M 형태의 행렬을 입력으로 받음 => row / column
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int row = Integer.parseInt(str.split(" ")[0]);
        int column = Integer.parseInt(str.split(" ")[1]);

        int[][] A = new int[row][column];
        int[][] B = new int[row][column];


        // 이후에 두 개의 행렬 A, B의 값을 각각 넣어줌

        for (int i = 0; i < row; i++) {
            String[] rowStr = br.readLine().split(" ");
            for (int j = 0; j < column; j++) {
                A[i][j] += Integer.parseInt(rowStr[j]);
            }
        }
        for (int i = 0; i < row; i++) {
            String[] rowStr = br.readLine().split(" ");
            for (int j = 0; j < column; j++) {
                B[i][j] += Integer.parseInt(rowStr[j]);
            }
        }

        // 이들의 합행렬을 출력

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }
}
