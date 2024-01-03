package PS.ps2023.Day0;

import java.util.Scanner;

public class b5662 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int time = 0;
        int ch =0;
        int test =0;


        for (int i = 0; i < str.length(); i++) {
            ch = test = str.charAt(i);
            ch = (ch - 65) / 3;
            if(ch ==0) {
                time += 3;
            } else if (ch == 1) {
                time += 4;
            } else if (ch == 2) {
                time += 5;
            } else if (ch == 3) {
                time +=6;
            } else if (ch == 4) {
                time += 7;
            } else if (ch == 5 || test == 83) { // 여기 4개짜리임
                time += 8;
            } else if (ch == 6 || test == 86) {
                time += 9;
            } else {
                time += 10;
            }
        }
        System.out.println(time);

    }
}
