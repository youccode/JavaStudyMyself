package PS.ps2024.Day0118;

import java.io.*;

public class b24416 {
    public static void main(String[] args) throws IOException {
        /*
        DP(Dynamic Programming)
        : method for solving complex problems by breaking them down into simpler
        overlapping subproblems and soovling each subproblem only once, storing the solutions to
        subproblems in a table to avoid redundant computations.

        1. Top - down approach (Memoization)
        - using the recursive way, and the solutions are stored, so that the recomputaion is not happened

        2. Bottom - up approach (Tabulation)
        - solving smaller subproblems first and then using their solutions
        to build up to the solution of the original problem.

        - subproblem's solutions are stored in table.

        1 1 2 3 5
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb= new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N+1];
        int cnt = 0;
        arr[1] = arr[2] = 1;

        for (int i = 3; i < N + 1; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            cnt++;
        }

        sb.append(arr[N]).append(" ").append(cnt);
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
