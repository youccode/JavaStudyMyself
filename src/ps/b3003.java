package ps;


import java.util.Scanner;

public class b3003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] lackChess = new int[6];

        for (int i=0; i<lackChess.length; i++) {
            lackChess[i] = chess[i] - scanner.nextInt();
        }

        for (int i=0; i<lackChess.length; i++) {
            System.out.print(lackChess[i] + " ");
        }

    }
}
